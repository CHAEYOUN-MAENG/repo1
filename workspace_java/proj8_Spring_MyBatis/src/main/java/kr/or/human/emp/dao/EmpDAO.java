package kr.or.human.emp.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import kr.or.human.emp.dto.EmpDTO;

@Mapper
public interface EmpDAO {

	List<EmpDTO> selectEmp();

	void insertEmp(EmpDTO empDTO);

}
