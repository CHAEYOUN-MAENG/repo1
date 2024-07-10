package sec01.exam01;

public class Child extends Parent {

	// 부모의 필드를 가리는 현상
	// overshadow
	String name = "Child의 name";

	// 자식에 this.name 하면 자식 name이 나옴
	// (부모랑 동일한게 있다는 가정하에)

	// 만약 내가 name이 없고 부모 name만 있을때 상속을 받게 되면
	// 부모 name 이 출력

	// 기본생성자
	public Child() {
		super(""); // 상속된 부모 생성자를 호출하는 것
					// (extends를 통해 알수있음 parent를 뜻함)
					// 맨 첫줄에 있어야만 한다
					// 상속을 받았을 땐 super자동으로 생김
					// string이 들어가야함 ()안에
					// super는 내 클래스의 부모를 뜻함
	}

	// Child(){
	// System.out.println("Child의 기본 생성자");
	// }

	// 실무에서 쓰는 방법은 아닌데 연습삼아
	// 부모의 name을 변경하는 메소드
	void setName(String name) {
		this.name = name;
	}

	void setName2(String n) {
		name = n;
	}

	void setName3(String name) {
		this.name = name;
	}

	void printName() {
		getName();
		System.out.println("this.name : " + this.name);
		System.out.println("super.name : " + super.name);
	}

}
