package emp;

import java.io.Reader;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MapDAO {
   private  SqlSessionFactory sqlMapper = null;

    public  SqlSessionFactory getInstance() {
        if(sqlMapper == null) {
            try {
                String res = "mybatis/SqlMapConfig.xml";
                Reader reader = Resources.getResourceAsReader(res);

                SqlSessionFactoryBuilder ssfb = new SqlSessionFactoryBuilder();
                sqlMapper = ssfb.build(reader);

                reader.close();
            }catch (Exception e) {
                e.printStackTrace();
            }
        }

        return sqlMapper;
    }
    public List<Map> selectMap(){
       List<Map> empMapList = null;
       
       //SqlMapConfig.xml을 읽어옴
       sqlMapper = getInstance();
       if(sqlMapper !=null) {
       //DB 접속
       SqlSession sqlSession = sqlMapper.openSession();
       
       empMapList = sqlSession.selectList("mapper.emp.selectAllempMap");
       System.out.println("empList.size : " + empMapList.size());
       }
       
       else {
          System.out.println("DB 접속 실패");
          
       }
       
       return empMapList;
       
    }
}
