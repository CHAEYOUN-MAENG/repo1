package sec04.exam05;

import java.util.Scanner;

public class Fan {

	// 선풍기 전원 상태를 저장할 필요가 있다
	// 전원 켜기 기능
	// 전원 끄기 기능
	// 각각 전원 상태 값을 변경
	// 약풍 기능, 강풍기능

	boolean isOn = false;

	void fanOn() {
		System.out.println("전원을 켭니다");
		isOn = true;
	}

	// 숫자 1일때 약풍기능
	// 숫자 2일때 강풍기능

	Scanner scan = new Scanner(System.in);

	void power() {
		if (isOn) {
			int button = scan.nextInt();
			if (button == 1) {
				System.out.println("약풍기능");
			} else if (button == 2) {
				System.out.println("강풍기능");
			} else {
				System.out.println("존재하지 않는 버튼입니다");
			}
		} else {
			System.out.println("선풍기를 켜주세요");
		}
	}

	void fanOff() {
		System.out.println("전원을 끕니다");
		isOn = false;
	}

}
