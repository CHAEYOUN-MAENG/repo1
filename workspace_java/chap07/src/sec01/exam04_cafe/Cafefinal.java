package sec01.exam04_cafe;

public class Cafefinal {

	public static void main(String[] args) {

		Pack pack = new Pack("빽다방");

		String menu1 = pack.order("복숭아 아이스티");
		System.out.println(menu1);

		int pay1 = pack.pay(40000);
		System.out.println(pay1);

		int pay2 = pack.pay(1000);

		pack.menu("사라다빵");

		System.out.println("---------------");

		Mega mega = new Mega("메가커피");

		String menu2 = mega.order("토피넛라떼");
		System.out.println(menu2);

		int pay3 = mega.pay(6000);
		System.out.println(pay3);

		mega.menu("할메가");

	}

}
