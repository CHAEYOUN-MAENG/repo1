package sec03.exam02;

// 추상클래스는 추상메소드를 가질 수 있도록 하는거
// 그리고 new가 되지 않음
public abstract class Animal {

	String kind;

	// 부모가 구현해놓은 메소드
	void breathe() {
		System.out.println("숨쉬자");
	}

	// 추상메소드
	// 내가 구현하지 않고 나를 상속받은 애들이 구현하도록 유도
	abstract void sound();

	// 부모는 그냥 틀만 빌려주고 자식이 내용을 구현하는거임
	// 그래서 부모.제목할때 자식내용을 가져옴

}
