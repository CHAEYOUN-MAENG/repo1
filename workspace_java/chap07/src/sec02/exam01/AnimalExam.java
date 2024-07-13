package sec02.exam01;

public class AnimalExam {

	public static void main(String[] args) {

		Cat cat = new Cat();
		Dog dog = new Dog();

		Animal a1 = new Dog();
		Animal a2 = new Cat();

		// 타입이 같아서 부모자식관계 신경안쓰고 가능함
//		a1 = a2;
//		dog = cat; -> 안됨

		a1.sound();
		a2.sound();

		Animal a3 = new Animal();
		a3.sound();

	}

}
