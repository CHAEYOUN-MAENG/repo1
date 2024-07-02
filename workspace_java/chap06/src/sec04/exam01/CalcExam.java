package sec04.exam01;

public class CalcExam {

	public static void main(String[] args) {
		powerOn();
		powerOn(); // 이건 내꺼라서 new하지 않고 써도 됨
		
		Calc calc = new Calc();
		calc.poweroff();
		System.out.println(calc); // sec04.exam01.Calc@5ccd43c2
		Calc calc2 = new Calc();
		System.out.println(calc2); // sec04.exam01.Calc@4aa8f0b4
		
	}

	static void powerOn() {
		System.out.println("전원을 켭니다");
	}
	
	
	
}
