package human.class1.ajax.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import human.class1.ajax.dto.EmpDTO;
import human.class1.ajax.service.EmpService;

@Controller
public class EmpController {

	@Autowired
	EmpService empService;

	@RequestMapping("/listEmp")
	@ResponseBody
	public List listEmp(Model model) {
		List<EmpDTO> list = empService.listEmp(); // 1번
		model.addAttribute("list", list); // 2번, jsp는 3번

		System.out.println("list.size() :" + list.size());

		return list; // 위에 list를 호출
	}

	// 글씨만 나오면 @ResponseBody를 썼기 때문에 주의
	@RequestMapping("/emp")
	public String emp() {

		return "emp";
	}

	@RequestMapping(value="/deleteEmp", method=RequestMethod.DELETE)
	@ResponseBody
	public int deleteEmp(@RequestBody EmpDTO dto) {
		System.out.println(dto);
		int result = empService.deleteEmp(dto); // 1번
	
		System.out.println("삭제결과 :" + result);

		return result;
	}

}
