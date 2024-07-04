package sec04.exam06;

public class MemberJoinExam {

	public static void main(String[] args) {

		// 아이디, 비밀번호는 필수입니다
		// 주소 입력 X, null
		// 나이 입력 X, -1
		// 성별 입력 X, -1
		MemberJoin member = new MemberJoin();

		member.join("id", "pw", "주소", 20, 1);
		System.out.println("-----------------");

		member.join("아이디1", "1234", null, -1, -1);
		System.out.println("-----------------");
		member.join("아이디2", "qwerty", null, -1, -1);
		System.out.println("-----------------");
		member.join("아이디3", "abcd"); // 대신 해주는 녀석이 생긴거임
	}
}
