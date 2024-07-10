package sec01.exam04;

public class Meat extends Food {

	Meat() {

//		super();
		System.out.println("meat 생성자 실행");

		this.name = "제육";
		this.price = 8000;
		this.recipe = "돼지고기 앞다리";
		this.type = "한식";

	}

	void setSpicy(String spicy) {
		this.name += " " + spicy;
	}

	@Override
	String eat(String name) {
		System.out.println("갓지은 밥과 상추에 마늘을 싸서");
//		System.out.println(this.name + "을(를) 많이 먹는다");
//		return this.name;
		return super.eat("제육");
	}

}
