package sec02.exam01_cafe;

public class CoffeeExam {

	public static void main(String[] args) {

		Coffee coffee = new Coffee();
		TwoSome 투썸 = new TwoSome();
		Mega 메가 = new Mega();
		Me 나 = new Me();

		Coffee cafe = (Coffee) 투썸;
		// 투썸껄 Coffee로 가져와서 Coffee 안에있는 메소드만 사용 가능
		// 투썸에 있는 메소드는 사용하지 못함
		// 사용할꺼면 투썸에 있는 메소드를 Coffee에 가져와서
		// 오버라이드 해서 사용해야함

		// walk를 사용하려면
		// dog.walk();를 사용해야 하거나, 애니멀 클래스에 walk메소드를 만들고
		// 오버라이드를 해야 함.
		// 형변환을 하면 부모에 있는 메소드 자체만 사용가능.

		나.buy(cafe);

		나.buy(메가);

	}

}
