package sec05.exam01;

public class Car {

	// 생성자

	Car() {
	}

	String model;
	int speed;

//	Car(String m){
//		model = m;
//	}

	Car(String model) {
		model = model; // 같은 model;

		int a = 10;
		a = a;
//
//		Car c1 = new Car();
//		c1.model = model;

		// new가 된 나를 호출할때 this
		// = model; 은 전달인자로 받은 model;
		this.model = model;

	}

	void setSpeed(int speed) {
		this.speed = speed;
	}

}
