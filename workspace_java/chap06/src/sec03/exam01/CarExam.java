package sec03.exam01;

public class CarExam {

	// CarExam() {}

	public static void main(String[] args) {

		// Car를 사용하기 위해서는 변수에 넣었어야함
		// 근데 일단 생성만 시킴
//		new Car();

		System.out.println("---------------");
		Car myCar1 = new Car("흰색", 1500);
		myCar1.print(); // 메소드는 재사용

		System.out.println("---------------");
		Car myCar2 = new Car();
		myCar2.print(); // 메소드는 재사용

	}

}
