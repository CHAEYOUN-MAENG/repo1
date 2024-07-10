package sec01.exam01;

public class Parent {

	String name = "parent의 name";

//	Parent() {
//		super();     부모생성자 호출
//		this("a");   super()와 this()는 모두 첫줄에 적어야 하므로
//                   같이 사용할 수 없다
//					 this(내꺼)는 다른생성자 호출, String name 에 a변수 넣어준거임
//		System.out.println("Parent 기본 생성자");
//	}

	Parent(String name) {
		System.out.println("Parent 기본 생성자");
	}

	String getName() {
		System.out.println("parent의 getName 실행");
		return this.name;
	}

	// super()는 다른 클래스에서 부모생성자 호출
	// this()는 내 클래스 안에서 다른생성자 호출
	// ()안에는 생성자 전달인자에 따라서 작성해줘야함

}
