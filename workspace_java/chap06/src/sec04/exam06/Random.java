package sec04.exam06;

public class Random {

	// 임의의 수 0~9에서 하나 결정 ex.7
	// 정답3 -> up (시도회수: 1회)
	// 정답8 -> down (시도회수: 2회)
	// 정답7 => 정답 (시도회수: 3회)

	// 숫자을 입력한다
	// up / down 출력
	// 숫자을 입력한다
	// up / down 출력

	// int num = (int) (Math.random() * 100) % 10; // 0 ~ 9
	int number = (int) (Math.random() * 10); // 0 ~ 9

	// number의 숫자를 지정하는 기능
	void setNumber(int num) {
		number = num;
	}

	// 임의의 수로 교체
	void initNumber() {
		int number = (int) (Math.random() * 10);
	}

	void hint() {
		System.out.println("number : " + number);
	}

	// up down 정답을 판단하는 기능
	// 전달인자 : int (추측한 숫자)
	// 리턴타입 없음
	void answer(int num) {
		if (number == num) {
			System.out.println("정답입니다");
		} else if (number > num) {
			System.out.println("UP");
		} else if (number < num) {
			System.out.println("DOWN");
		}
	}

}
