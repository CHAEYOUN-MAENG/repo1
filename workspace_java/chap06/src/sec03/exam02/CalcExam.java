package sec03.exam02;

public class CalcExam {

	public static void main(String[] args) { // 생성자(일회용)

		Calc calc = new Calc(); // 메소드(재사용 가능)
		double p = calc.plus(5, 7.5);
		System.out.println(p); // 변수에 담아서

		System.out.println("----------------");

		int a = (int) calc.plus(10, 5);
		System.out.println(a);

		System.out.println("----------------");

		double oper = calc.oper(10, "+", 5);
		System.out.println(oper);
	}

}
