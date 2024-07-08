package sec03.exam01;

public class Login {

	String id;
	String pw;

	Login(String i, String p) {
		id = i;
		pw = p;
		System.out.println("홈페이지에 들어왔습니다");
	}

	// 메소드를 만드는데 생성자의 전달인자와 동일하게 생성
	// 조건을 생성자의 전달인자와 메소드의 전달인자가 같으면~
	// 메인페이지 출력하는 syso를 만들면되고
	// 아니면 로그인을 다시하세요 또는 아이디/비밀번호가 틀렸습니다

	boolean On = true;

	boolean log(String i, String p) {

		if (id == i && pw == p) {
			System.out.println("로그인이 되었습니다");
			return On;
		} else if (id != i || pw != p) {
			On = false;
			System.out.println("아이디/ 비밀번호가 틀렸습니다");
			System.out.println(On);
		}
		return On;

	}

}
