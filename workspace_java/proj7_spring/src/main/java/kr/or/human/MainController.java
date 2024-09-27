package kr.or.human;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

// Controller Bean((class) 즉, spring이 생성할 수 있는 class)으로 등록한다.
@Controller
// ip:port/context_path/ -> 프로젝트 구분(주소) 
// class에 붙은 @RequestMapping은 HandlerMapping이 처리합니다.
// ip:port/context_path/sub/* 
// 이 클래스에서 반복되는 첫 주소를 한번에 지정할 때 사용 
@RequestMapping("/sub")
public class MainController {

	// 메소드에 적용한 @RequestMapping은 HandlerAdaper(메소드에 붙은 주소를 파악해서 메소드를 실행시켜줌)가 처리함
	@RequestMapping("/test/a1.do") // 얘는 그냥 main1까지만 안내 -> main1는 main.jsp까지 안내
	public ModelAndView a1() {
		System.out.println("a1 실행");

		// ViewResolver로 보내는 객체
		ModelAndView mav = new ModelAndView();
		// jsp의 조합을 위한 이름
		// forward로 이동하게 됨
		mav.setViewName("main");

		// viewName을 생성자에 넣어도 됨
//		ModelAndView mav = new ModelAndView("main");

		return mav;
	}

	@RequestMapping("/test/a2.do") // 얘는 그냥 main2까지만 안내 -> main2는 main.jsp까지 안내
	public ModelAndView a2() {
		System.out.println("a2 실행");
		ModelAndView mav = new ModelAndView();

		mav.setViewName("main");

		// 마치 request.setAttribute처럼 담을 수 있는 방법
		mav.addObject("message", "맹채윤");

		return mav;
	}

	// 전달인자가 value하나일때는 value라는 글씨를 생략할 수 있다
	// 두개 이상의 값을 넣을때는 {} 안에 넣는다
	// value는 url 패턴을 뜻한다
	// method는 접근 방식을 제안함
	// 적은 것만 들어올 수 있음
	// method를 생략하면 모든 방식을 허용
	@RequestMapping(value = { "/test/a3/*/search", "/test/a4.do" }, method = { RequestMethod.POST, RequestMethod.GET })
	public ModelAndView a3() {
		System.out.println("a3 실행");
		ModelAndView mav = new ModelAndView();

		mav.setViewName("main");

		// 마치 request.setAttribute처럼 담을 수 있는 방법
		mav.addObject("message", "a3실행");

		return mav;
	}

	//  url 패턴(주소)가 같으면 부팅시 예외 발생
	//그러나 method를 나눠서 Get과 Post를 지정 해 주면 접속 가능
	// @RequestMapping("/test/a2.do")
	// public ModelAndView a4() {
	//    System.out.println("main4 실행");
	//
	//    ModelAndView mav = new ModelAndView();
	//    mav.setViewName("main");
	//
	//    mav.addObject("message", "a4실행");
	//
	//    return mav;
	// }

	// 주소를 통해서는 get방식밖에 안됨 (둘이 경로는 똑같고, method는 다름)
	@RequestMapping(value = "test/a5.do", method = RequestMethod.GET)
	public ModelAndView a5() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("main");
		mav.addObject("message", "a5실행");
		return mav;
	}

	@RequestMapping(value = "test/a5.do", method = RequestMethod.POST)
//	@PostMapping("test/a5.do"), method = RequestMethod 확인
	public ModelAndView a6() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("main");
		mav.addObject("message", "a6실행");
		return mav;
	}
	
	@PutMapping("test/a6.do")
//	@GetMapping("test/a6.do") method = RequestMethod.GET
//	@DeleteMapping("test/a6.do") method = RequestMethod.DELETE
	public ModelAndView a7() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("main");
		mav.addObject("message", "a7실행");
		return mav;
	}
}
