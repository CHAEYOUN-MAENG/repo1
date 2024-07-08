package sec06.exam06;

public class Car {

	private int speed; // 다른데에서 막 바꾸면 안됨
	boolean stop;

	// getters는 필드값을 읽어서 리턴하는 기능
	// private 접근제한자를 읽어오기 위해 사용
	// get + 필드명(첫글자만 대문자)
	// 전달인자 없음
	// 보통은 어디서나 가져다 쓸수 있도록 public으로 씀
	public int getSpeed() {
		return this.speed;
	}

	// setter는 필드값을 수정할 수 있는 기능
	// 메소드명 : set + 필드명(첫글자만 대문자)
	// 전달인자 : 필드의 타입으로 된 변수
	// 리턴타입 : 없음
	public void getSpeed(int speed) {
		this.speed = speed;
	}

	// getter 중에서 boolean 타입일 경우
	// get+필드명 대신에 is+필드명도 가능하나
	// 오류가 발생하는 라이브러리도 있으니 가능하면 get을 쓰자
	public boolean isStop() {
		return this.stop;
	}

}
