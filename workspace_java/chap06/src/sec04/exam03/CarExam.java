package sec04.exam03;

public class CarExam {

	public static void main(String[] args) {

		// Car 클래스를 생성해서
		// car 타입의 car 변수에 담는다
		Car car = new Car();

		// gas가 남아있는지 받아온다
		boolean gasState = car.isLeftGas1();

		if (gasState) {
			System.out.println("출발합니다");
			car.run();
		}

		System.out.println("----------");

		System.out.println(car.name); // null
//		car.name = "아방이";
		car.setName("아방이");
		System.out.println(car.name); // 아방이

		car.setName("");
		System.out.println(car.name); // 아방이 (유지됨)
		
		// 변수.메소드로 부르면 됨

	}

}
