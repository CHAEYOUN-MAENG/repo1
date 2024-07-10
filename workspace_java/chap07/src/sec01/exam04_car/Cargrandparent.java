package sec01.exam04_car;

public class Cargrandparent {

	String color;
	String name;

	String carcolor(String color) {
		System.out.println("차색깔은 " + color + " 입니다");
		this.color = color;
		return color;
	}

	String carname(String name) {
		System.out.println("차이름은 " + name + " 입니다");
		this.name = name;
		return name;
	}

}
