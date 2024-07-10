package sec03.exam01;

public class Login {
	
	//	생성자로 id, pw를 받아서 저장해 놓음 (회원가입)
	//	login(아이디, 패스워드) 실행하면
	//	login메소드 안에서...
	//	만약 같으면 "메인페이지" 출력하고 true 돌려줌
	//	다르면 "로그인 화면으로 돌아감" 출력하고 false 돌려줌
	
	String id;
	String pw;

	Login(String i, String p) {
		this.id = i;
		this.pw = p;
		System.out.println("홈페이지에 들어왔습니다");
	}

	// 메소드를 만드는데 생성자의 전달인자와 동일하게 생성
	// 조건을 생성자의 전달인자와 메소드의 전달인자가 같으면~
	// 메인페이지 출력하는 syso를 만들면되고
	// 아니면 로그인을 다시하세요 또는 아이디/비밀번호가 틀렸습니다

	boolean On = true;

	boolean log(String id, String pw) {

		if (this.id.equals(id) && this.pw.equals(pw)) {
			System.out.println("로그인이 되었습니다");
			return On;
		} else {
			On = false;
			System.out.println("로그인 다시하세요");
			System.out.println(On);
		}
		return On;

	}

}
