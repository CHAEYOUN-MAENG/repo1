package kr.or.human.emp.service;

import java.util.List;

import kr.or.human.emp.dto.EmpDTO;

public interface EmpService {

	List<EmpDTO> listEmp();

	void insertEmp(EmpDTO empDTO);

}
