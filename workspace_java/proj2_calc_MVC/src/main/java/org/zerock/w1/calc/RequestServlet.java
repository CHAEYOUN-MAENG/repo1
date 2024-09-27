package org.zerock.w1.calc;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/RequestServlet")
public class RequestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("getRemoteAddr : " + request.getRemoteAddr()); // 클라이언트의 IP 주소를 반환 ipv6 -> 0::1 축약가능
		System.out.println("getMethod : " + request.getMethod()); // HTTP 요청 메서드를 반환
		System.out.println("getRequestURL : " + request.getRequestURL()); // 클라이언트가 요청한 전체 URL을 반환
		System.out.println("getServletPath : " + request.getServletPath()); // 서블릿 경로를 반환
		System.out.println("getQueryString : " + request.getQueryString()); // 요청 URL에 포함된 쿼리 문자열을 반환
		System.out.println("getContextPath : " + request.getContextPath()); // 컨텍스트 경로를 반환

		// request에 임의의 값을 키로 저장할 수 있다
		request.setAttribute("key", "value");
		// request에서 키로 값을 꺼낼 수 있다.
		String v = (String) request.getAttribute("key");
		System.out.println(v);
	}

}
