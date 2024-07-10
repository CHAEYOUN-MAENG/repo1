package sec01.exam03;

public class ComputerExam {

	public static void main(String[] args) {

		// 부모
		Calc calc = new Calc();

		double area = calc.areaCircle(5);
		System.out.println(area);

		System.out.println("--------------");

		// 자식(부모를 상속받은)
		Computer computer = new Computer();

		double areaCalc = computer.areaCircle(5);
		System.out.println(areaCalc);

	}

}
