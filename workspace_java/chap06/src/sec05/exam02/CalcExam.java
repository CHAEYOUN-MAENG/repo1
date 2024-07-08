package sec05.exam02;

public class CalcExam {

	// java.exe가 특정 클래스를 실행할 때,
	// 예를 들어 CalcExam 클래스를 실행할때,
	// CalcExam.main(String[])을 실행한다
	// new CalcExam() 을 하지 않는다
	public static void main(String[] args) {

		Calc c1 = new Calc();
		Calc c2 = new Calc();

		c1.color = "빨강";
		c2.color = "파랑";

//		if(c1.test2() == constant.LOGIN_SUCCESS) {} // 이런식으로 사용 (상수)

		// new를 한적이 없음
		System.out.println(c1.pi); // 선발대
		System.out.println("-----------");

		System.out.println(Calc.pi); // 후발대
		System.out.println("-----------");

		Calc.pi = 3; // 이렇게 쓰는게 맞음
		c1.pi = 3;
		System.out.println(c1.pi);
		System.out.println(c2.pi);
		System.out.println("-----------");

		// new 한적이 없지만
		// static이 붙어있으니 사용 가능
		// Calc는 클래스명
		// 즉, 클래스명.메소드 / 클래스명.필드 이렇게 사용할 수 있다
		Calc.test1();

		// new를 하고 사용가능
		// static이 붙어있지 않으니
//		C1.test2();
		c1.test2();

	}

}
