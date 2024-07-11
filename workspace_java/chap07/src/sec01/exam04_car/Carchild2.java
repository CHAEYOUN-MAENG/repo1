package sec01.exam04_car;

public class Carchild2 extends Carparent {

	@Override
	void drive() {
//		super.drive();
		System.out.println("자식2 운전을 시작합니다");
	}

	void accel(String a) {
		System.out.println("악셀을 밟습니다");
	}

	void brk(String b) {
		System.out.println("브레이크를 밟습니다");
	}

}
