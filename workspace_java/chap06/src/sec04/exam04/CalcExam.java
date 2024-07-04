package sec04.exam04;

public class CalcExam {

	public static void main(String[] args) {

		Calc calc = new Calc();
		calc.execute();
		
		System.out.println("-------------");
		calc.plus(1, 2);

		System.out.println("-------------");
		calc.plus(1, 1.5);

	}

}
