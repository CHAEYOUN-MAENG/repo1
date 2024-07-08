package sec05.exam05;

public class Person {

	final String nation = "Korea";

	// 생성자에서 딱 한번 값을 초기화 할 수 있다
	// final로 선언하는 동시에 초기화 해야한다.
	final String ssn;

	void test() {
//		nation = "USA"; // final 이 붙으면 못바꿈
		System.out.println(Math.PI);
	}

	Person() {
		ssn = "1234";
	}

//	static final int LOGIN_SUCCESS; (상수예시)

}
