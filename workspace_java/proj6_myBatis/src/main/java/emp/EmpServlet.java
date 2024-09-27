package emp;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/emp")
public class EmpServlet extends HttpServlet {
   private static final long serialVersionUID = 1L;

   
   protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      
      EmpDAO empDAO = new EmpDAO();
      List<EmpDTO>emplist = empDAO.selectEmp();
      
      System.out.println(emplist);
      request.setAttribute("emplist", emplist);
      
      MapDAO mapDAO = new MapDAO();
      //map을 담은 list 받기
      List<Map> empListMap= mapDAO.selectMap();
      //첫번째 map의 ename 출력
      request.setAttribute("empListMap",empListMap);
      
      Map m = empListMap.get(0);
      System.out.println(m.get("ENAME"));
      
      EmpDTO empDTO = empDAO.selectOneEmp();
      System.out.println(empDTO);
      
      int total = empDAO.selectTotalEmp();
      System.out.println(total);
      
      String ename = empDAO.selectEnameEmp();
      System.out.println(ename);
      
      EmpDTO dto = new EmpDTO();
      dto.setEmpno(7788);
      dto.setEname("ScoTT3");
      dto.setSal(3210);
      
      int updateResult = empDAO.updateEmp(dto);
      System.out.println("업데이트 결과 : " + updateResult);
      
      empDTO = empDAO.selectEmpByEname("KING");
      System.out.println(empDTO);
   }

}
