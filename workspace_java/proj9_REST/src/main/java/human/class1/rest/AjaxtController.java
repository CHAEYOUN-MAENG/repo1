package human.class1.rest;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AjaxtController {

	// RequestMapping 주소가 다른건 문이 그냥 2개라는 의미

	// 브라우저는 이 문으로
	@RequestMapping(value = "/ajax.view", method = RequestMethod.GET)
	public String ajaxview() {

		return "ajax";
	}

	// 아작스는 이 문으로, const url = "ajax"; value 값을 맞춰줌
	// @RequestBody : post로 보낸 json을 처리
	@RequestMapping(value = "/ajax", method = RequestMethod.POST)
	public String ajax(String ename, @ModelAttribute EmpDTO dto2, @RequestBody EmpDTO dto) {
		// json으로 보냈더니 @RequestParam 또는 request.getParameter로 받을 수 없다
		System.out.println("ename : " + ename); // null
		System.out.println("dto2 : " + dto2); // null
		System.out.println("dto : " + dto); // null

		return "ajax"; // 글씨를 받음(브라우져에 보여지는)
	}

	// @ResponseBody : 그냥 값이나 json으로 값을 리턴해줌 (ajax.jsp를 거치지 않음, 위에는 거침)
	// get 문으로 들어왔지만 그게 아작스를 거쳐서 아래가 보여지게 끔 함(아작스는 비밀리에 뒤에서 움직이니까 보여주는건 똑같고)
	@RequestMapping(value = "/ajax/string", method = RequestMethod.POST)
	@ResponseBody // (주소에다가 적으면 get방식임)
	public String ajaxString(@RequestBody EmpDTO dto) {
		System.out.println("dto : " + dto); // null

		return "human";
	}

	@RequestMapping(value = "/ajax/dto", method = RequestMethod.POST)
	@ResponseBody // (주소에다가 적으면 get방식임)
	public EmpDTO ajaxDTO(@RequestBody EmpDTO dto) {
		System.out.println("dto : " + dto);

		return dto;
	}

	@RequestMapping(value = "/ajax/list", method = RequestMethod.POST)
	@ResponseBody // (주소에다가 적으면 get방식임)
	public List ajaxList(@RequestBody EmpDTO dto) {
		System.out.println("dto : " + dto);

		List list = new ArrayList();
		list.add(dto);
		list.add(dto);
		list.add(dto);

		return list;
	}

	@RequestMapping(value = "/ajax/forward", method = RequestMethod.GET)
	public String ajaxForward() {

		return "forward:/ajax.view";
	}

	@RequestMapping(value = "/ajax/redirect", method = RequestMethod.GET)
	public String ajaxRedirext() {

		return "redirect:/ajax.view";
	}

	@RequestMapping("/ajax/notice/{num}/static/{str}")
	@ResponseBody
	public int notice(@PathVariable("num") int number,

			@PathVariable("str") String str1,

			HttpServletRequest request) {

		System.out.println(request.getParameter("nem"));
		System.out.println("number :" + number);
		System.out.println("str1 :" + str1);

		return number;
	}
}
