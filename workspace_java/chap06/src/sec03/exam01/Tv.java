package sec03.exam01;

public class Tv {
	
	//	전원
	//	볼륨 up/down 0~10
	//	>> 볼륨의 범위를 벗어나지 못하게 해주세요
	//	채널 up/down/직접입력
	//	정보보기 : 현재 전원상태, 볼륨, 채널 정보 출력

	boolean isOn = false;

	void TvOn() {
		System.out.println("TV가 켜졌습니다");
		isOn = true;
	}

	void TvOff() {
		System.out.println("TV가 꺼졌습니다");
		isOn = false;
	}

	// 볼륨을 만든다(저장할 변수)
	int num = 0;

	void volumeUp() {
		num++;
	}

	void volumeDown() {
		num--;
	}

	// 볼륨을 1 올리고 저장하는 메소드를 만들기
	// 전달인자 없음
	// 리턴타입 int

	int volUp() {
		volumeUp();
		return num;
	}

	int volDown() {
		volumeDown();
		return num;
	}

	// 채널
	int cha;

	int channelUp() {
		cha++;
		System.out.println("현재 채널: " + cha);
		return cha;
	}

	int channelDown() {
		cha--;
		System.out.println("현재 채널: " + cha);
		return cha;
	}

	int channelPrint(int num) {
		cha = num; // 지역변수 개념
		System.out.println("현재 채널: " + cha);
		return num;
	}

	void info() {

//		boolean isOn;
		System.out.println(isOn);
//		int num;
		System.out.println(num);
//		int cha;
		System.out.println(cha);

	}

}
