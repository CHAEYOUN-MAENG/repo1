package sec04.exam03;

import java.util.Scanner;

public class Car {

	// 필드(== 맴버변수)는 class 생성과 함께 생성되고
	// 클래스 소멸시까지 생존

	// 필드는 메모리를 차지함
	// 계속 저장됨
	// 메소드에서 변경하는 경우
	// 다음번 실행까지 저장해둠
	// 그래서 계속 초기화해야하는 상황이 발생할 수 있다
	// 클래스 안의 모든 곳에서 사용 가능하다

	int gas = 5;

//	Scanner s = new Scanner(System.in);
//	int gas = s.nextInt();

	// gas의 값이 0이면 false
	// 그렇지 않으면 true
	boolean isLeftGas1() {
		if (gas == 0) {
			System.out.println("gas가 없습니다");
			return false;
		} else {
			System.out.println("gas가 있습니다");
			return true;
		}
	}

	boolean isLeftGas2() {
		boolean result = false;

		if (gas == 0) {
			System.out.println("gas가 없습니다");
			result = false;
		} else {
			System.out.println("gas가 있습니다");
			result = true;
		}

		return result;
	}

	boolean isLeftGas3() {
		return gas != 0;
	}

	// 주행
	// gas가 없을때까지 달리기
	// void는 return값을 반환하지 않음
	void run() {
		while (true) {
			if (gas > 0) {
				System.out.println("주행중...잔량:" + gas);
				gas--;
			} else {
				System.out.println("주행종료...잔량:" + gas);
				// void이므로 아무값도 돌려주면 안된다
				// break보다 강력해 만나는 순간 method가 끝남
				return; // break 대신 사용
			}
		}

	}

	String name;

	// name의 값을 변경
	// name의 길이가 0인 경우 변경하지 않음
	// 전달인자 : String
	// 리턴타입 : 없음

	void setName(String nick) {
		System.out.println(nick.length());
		if (nick.length() != 0) {
			name = nick;
		} else {
			System.out.println("이름은 필수입니다");
		}
	}

}
