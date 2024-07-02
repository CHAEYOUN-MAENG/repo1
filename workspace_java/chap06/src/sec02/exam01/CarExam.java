package sec02.exam01;

public class CarExam {

	public static void main(String[] args) {
		// void = return 하는 값이 없다
		// main 함수 실행
		// 전달인자로 String 배열을 받겠다
		// 변수명은 args
		
		Car myCar = new Car();
		Car myCar2 = new Car();

		myCar.model = "람보르기니";
		System.out.println(myCar.model);

		System.out.println(myCar2.model);

	}

}
