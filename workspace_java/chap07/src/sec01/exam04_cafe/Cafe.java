package sec01.exam04_cafe;

public class Cafe {

	String name;
	String menu;
	int money;

	Cafe(String name) {
		System.out.println(name + "카페입니다");
	}

	String order(String menu) {
		this.menu = menu;
		System.out.println(this.menu + "를(을) 주문하셨습니다");
		return this.menu;
	}

	int pay(int money) {
		int change = money - this.money;

//		this.money = money;
		if (this.money > money) {
			System.out.println("돈이 부족합니다");
		} else {
			System.out.println("거스름돈 " + (money - this.money) + " 을(를) 받아주세요");
		}
		return change;
	}

}
