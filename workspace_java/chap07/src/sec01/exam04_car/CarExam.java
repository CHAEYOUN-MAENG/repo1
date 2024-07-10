package sec01.exam04_car;

public class CarExam {

	public static void main(String[] args) {

		// 할아버지 -> 아빠 -> 자식 순으로 상속을 하면
		// 자식은 할아버지, 아빠 요소를 다 가지고 있는거다

		Carchild1 car1 = new Carchild1();
		car1.drive();
		car1.carcolor("흰색");
		car1.carname("아방이");

		System.out.println("-----------");

		Carchild2 car2 = new Carchild2();
		car2.drive();
		car2.carcolor("검은색");
		car2.carname("카니발");
	}

}
