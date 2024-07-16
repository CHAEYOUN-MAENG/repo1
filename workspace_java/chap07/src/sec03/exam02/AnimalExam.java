package sec03.exam02;

public class AnimalExam {

	public static void main(String[] args) {

//		Animal animal = new Animal(); // 추상클래스는 new가 되지 않음

		Dog dog = new Dog();
		dog.sound(); // 부모가 구현하지 않고 자식한테 떠넘김
		dog.breathe(); // 상속됬기 때문에(어딘가에는 구현이 되어있음)

		Animal a = dog;
		a.sound(); // 자식이 오버라이드 한

	}

}
