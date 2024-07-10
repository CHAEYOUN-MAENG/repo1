package sec01.exam04;

public class FoodExam {

	public static void main(String[] args) {

		Meat food1 = new Meat();

		// (제육 맛있게 매운맛)이 name에 들어가고 + order 되서 출력
		// 제육 맛있게 매운맛을(를) 주문한다
		food1.setSpicy("맛있게 매운맛");
		int change = food1.order(10000); // (원래) 제육을(를) 주문한다

		System.out.println("------------");

		System.out.println(change); // 8000

		System.out.println("------------");

		// Override 되서 출력값이 나옴
		String menu = food1.eat("제육"); // 제육을(를) 먹는다
		System.out.println(menu); // 제육

		System.out.println("------------");

		// 상속 안받은 아예 다른 클래스
		Badfood food2 = new Badfood();

		String name = food2.eat("회탕후루"); // 회탕후루을(를) 먹는다
		System.out.println(name); // 회탕후루

		System.out.println("------------");

		int chg = food2.order(50000); // 회탕후루을(를) 주문한다
		System.out.println(chg); // 20000

		System.out.println("------------");

		food2.goGarbage(); // 쓰레기통에 버리자
	}
	
	// protected는 나를 상속받은 애만 사용할 수 있도록 함

}
