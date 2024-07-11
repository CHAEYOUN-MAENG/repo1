package sec01.exam04_cafe;

public class Pack extends Cafe {

	Pack(String name) {
		super("빽다방");
		money = 5000;
	}

	void menu(String a) {
		System.out.println("사라다빵 드리겠습니다");
	}

}
