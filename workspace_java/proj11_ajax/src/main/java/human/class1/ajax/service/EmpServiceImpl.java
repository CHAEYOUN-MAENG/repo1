package human.class1.ajax.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import human.class1.ajax.dao.EmpDAO;
import human.class1.ajax.dto.EmpDTO;

@Service
public class EmpServiceImpl implements EmpService {

	@Autowired
	EmpDAO empDAO; // 밑에 주석을 이렇게 @Autowired로 적음 (다형성때문에)

	@Override
	public List listEmp() {

//		EmpDAOImpl empDAO = new EmpDAOImpl();
		List<EmpDTO> list = empDAO.selectEmp();

		return list;
	}

}
