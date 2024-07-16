package sec01.exam01;

// implements 상속이라는 개념이랑 똑같은데
// 여러개 받을 수 있음
public class Tv implements RemoteControl {
	// public 지우면 안된다

	int volume;

	@Override
	public void turnOn() {
		System.out.println("TV 켭니다");
	}

	@Override
	public void turnOff() {
		System.out.println("TV 끕니다");
	}

	@Override
	public void setVolume(int volume) {
		if (volume > RemoteControl.MAX_VOLUME) {

			volume = RemoteControl.MAX_VOLUME; // RemoteControl.MAX_VOLUME = 10;

		} else if (volume < RemoteControl.MIN_VOLUME) {

			volume = RemoteControl.MIN_VOLUME; // RemoteControl.MIN_VOLUME = 0;
		}

		this.volume = volume; // 조건문 거치고 나온 값 저장

		System.out.println("TV 현재 볼륨" + this.volume);
	}

}
