package sec02.exam01_cafe;

public class Me {

	void buy(Coffee shop) {

		if (shop.isDT() == true) {
			System.out.println("드라이브 스루 이용가능");
			shop.order("메가리카노");
		} else {
			System.out.println("드라이브 스루 이용불가");
			shop.order("아이스아메리카노");
		}

	}

}
