package sec04.exam01;

public class CalcExam {

	public static void main(String[] args) {
		powerOn(); // 두번 써도 되서 두번 씀
		powerOn(); // 이건 내꺼라서 new하지 않고 써도 됨

		Calc calc = new Calc();
		calc.poweroff();
		System.out.println(calc); // sec04.exam01.Calc@5ccd43c2 (힙영역)
		Calc calc2 = new Calc();
		System.out.println(calc2); // sec04.exam01.Calc@4aa8f0b4

		Calc calc3 = new Calc();
		calc3.powerOn();

//		하나하나 다 설정해주지 않고 한번에 설정해줄 수 있도록
//		Calc에서 한번에 isOn = true; 로 설정
//		그럼 Calc2, Calc3 다 설정이 됨
//		calc3.isOn = true; 

		// 결과를 담아서 재활용 한다
		// 꼭 변수에 담아서 사용
		int result = calc3.plus(3, 8); // int result = 11;
//		int result = calc3.plus(3, calc3.plus(3, 8)); 

		System.out.println("더하기 : " + result);
		

		// 나누기
		double result2 = calc2.divide(17, 0);
		System.out.println("나누기 : " + result2);

		int[] a = { 2, 7 };
//		int[] a = new int[] { 2, 7 };
//		int[] a = new int[2];
//		a[0] = 2;
//		a[1] = 7;
		System.out.println(calc3.plus2(a));
		
		
		System.out.printf("%d_%s", 3 , "abc");
		
		int num = calc.plus3(1,2,3,4,5,6,7,8,9,10);
		System.out.println("plus3 결과 : " + num);

	}

	static void powerOn() {
		System.out.println("전원을 켭니다");
	}

}
