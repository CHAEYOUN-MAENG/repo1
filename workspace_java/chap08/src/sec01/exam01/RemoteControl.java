package sec01.exam01;

public interface RemoteControl {

	// 상수 : static final을 뜻하게되고
	// 변수명을 모두 대문자로
	// interface에서는 public static final 생략가능
	// 값도 꼭 줘야함 왜? 생성자가 없기 때문에
	public static final int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;

	// private이 올 수 없다
	// 아무것도 안써도 default가 아니라 public이다

	// 추상메소드
	public abstract void turnOn();

	void turnOff(); // public abstract 생략가능

	void setVolume(int volume);

	// 부모클래스 전용객체임 인터페이스는
	// 부모같은거야 그래서 자식들은 인터페이스 객체를 상속받게 되면
	// 인터페이스 객체는 자식들한테 물려주는 거다~

	///////////////////////////////////////////////////////////
	
	default void search(String word) {
		System.out.println(word);
	}
	// 이렇게만적으면 얘를 상속받은 모든 클래스들이다 메소드 오버라이드를
	// 해줘야함 그럼 만약 상속받은 수가 많다면 번거롭지~
	// 구현실행블럭을 해놓으면 사용하고 싶은 클래스만 사용할 수 있음

	// 그래서 이를 좀더 개선하기 위해 인터페이스에서
	// 메소드를 구현까지 해놓는다
	// 그러기 위해서는 default 키워드를 적어준다
}
