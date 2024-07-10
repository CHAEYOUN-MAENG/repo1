package sec01.exam04;

public class Badfood {

	String name;
	int price;
	String recipe;
	String type;

	Badfood() {
		this.name = "Badfood";
		this.price = 20000;
		this.recipe = "회 + 설탕";
		this.type = "간식";

	}

	String eat(String name) {
		this.name = name;
		System.out.println(this.name + "을(를) 먹는다");
		return this.name;
	}

	int order(int money) {

		int change = 0;

		if (money < this.price) {
			System.out.println("금액 부족으로 주문을 취소합니다");
		} else {
			System.out.println(this.name + "을(를) 주문한다");
			change = money = this.price;
		}
		return change;
	}

	String cook(int master) {
		if (master > 7) {
			return "조리가 잘됨";
		} else if (master > 4) {
			return "그냥 보통";
		} else {
			return "음..";
		}
	}

	void goGarbage() {
		System.out.println("쓰레기통에 버리자");
	}

}
