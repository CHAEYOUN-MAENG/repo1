package sec01.exam04;

public class Food {

	Food() {
		System.out.println("생성자 실행");
	}

	/*
	 * 이름 name 가격 price 주재료 recipe 종류 type
	 */

	String name;
	int price;
	String recipe;
	String type;

	/*
	 * 먹는다 eat() 주문한다 order() 요리한다 cook()
	 */

	String eat(String name) {
		this.name = name;
		System.out.println(this.name + "을(를) 먹는다");
		return this.name;
	}

	int order(int money) {

		int change = 0;

		if (money < this.price) {
			System.out.println("금액 부족으로 주문을 취소합니다");
//			return 0 || return change;
		} else {
			System.out.println(this.name + "을(를) 주문한다");
			change = money = this.price;
//			return change;
		}
		return change;
	}

	int money(int price) {
		this.price = price;
		System.out.println("가격은" + this.price + "입니다");
		return this.price;
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

//	필드 -> 값을 못바꿈
//	메소드 -> 오버라이드 안됨
//	클래스 -> 상속금지

}
