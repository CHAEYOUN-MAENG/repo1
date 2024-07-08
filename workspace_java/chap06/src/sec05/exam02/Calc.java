package sec05.exam02;

public class Calc {

	// 편하기 위해서
	// 빠르게 사용하기 위해서
	// static이 선발대
	static double pi = 3.141592;
	String color;

	// 지역변수 : 해당 블럭안에서만 사용 가능, 블럭이 끝나면 사라짐
	// 필드변수 : new가 된 순간(인스턴스)부터 사용가능, 클래스 소멸시 사라짐
	// static 변수 == 클래스 변수 == 공용변수
	// 				: java 실행 시 사용 가능,
	// 				: java 종료 시 사라짐

	Calc() {
		System.out.println(pi);
	}

	// static 안에서는 static밖에 못씀
	// this 못쓴다 this는 new가 된 이후에 사용이 가능하니까
	// static은 new를 안해도 사용할수 있어야해서
	static void test1() {
		System.out.println(pi);
	}

	// static 아닌 것은 static을 마음대로 사용할 수 있다
	void test2() {
		test1();
	}
	
	// static이 있으면 클래스.메소드 
	// 없으면 new해서 변수명 지정하고 변수.메소드

}
