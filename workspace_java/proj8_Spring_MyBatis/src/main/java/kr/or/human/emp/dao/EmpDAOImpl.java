package kr.or.human.emp.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.or.human.emp.dto.EmpDTO;

//@Repository
public class EmpDAOImpl implements EmpDAO {

	@Autowired
	SqlSession sqlSession;

	@Override
	public List<EmpDTO> selectEmp() {
		List<EmpDTO> result = sqlSession.selectList("mapper.emp.selectEmp");
		return result;
	}

	@Override
	public void insertEmp(EmpDTO empDTO) {
		// MyBatis를 통해 EmpDTO 데이터를 삽입하는 로직
		sqlSession.insert("mapper.emp.insertEmp", empDTO);
	}
}
