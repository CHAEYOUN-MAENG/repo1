package sec03.exam02;

public class Calc {

	void calcOn() {
		System.out.println("전원이 켜졌습니다");
	}

	void calcOff() {
		System.out.println("전원이 꺼졌습니다");
	}

	double plus(double x, double y) {
//		System.out.println(x + y);
		return x + y;
	}

	double minus(double x, double y) {
//		System.out.println(x - y);
		return x - y;
	}

	double mult(double x, double y) {
//		System.out.println(x * y);
		return x * y;
	}

	double divide(double x, double y) {
//		System.out.println(x / y);
		return x / y;
	}

	double remain(double x, double y) {
//		System.out.println(x % y);
		return x % y;
	}

	double oper(double x, String msg, double y) {
		if ("+".equals(msg)) {
			return plus(x, y);
		} else if ("-".equals(msg)) {
			return minus(x, y);
		} else if ("*".equals(msg)) {
			return mult(x, y);
		} else if ("/".equals(msg)) {
			return divide(x, y);
		} else if ("%".equals(msg)) {
			return remain(x, y);
		} else {
			System.out.println("다시 입력하세요");
			return 0;
		}
	}

}
