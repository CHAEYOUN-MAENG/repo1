package sec01.exam01;

import java.util.ArrayList;
import java.util.List;

public class RemoConExam {

	public static void main(String[] args) {

//		new RemonteControl(); // 인터페이스도 new안됨

		RemoteControl tv = new Tv();
//		new Tv는 Tv는 class니까 new가 가능한거고 
//		그걸 그냥 부모타입으로 형변환을 해준거임
//		부모가 new가 안되는 객체여도 상관없음
//		걍 new 뒤에 객체 타입을 보자

		Audio audio = new Audio();
		RemoteControl audio2 = (RemoteControl) new Audio();

//		Tv tv = new Tv();
		tv.turnOn();
		tv.setVolume(15);
		tv.setVolume(-5);
		tv.turnOff();

//		Audio audio = new Audio();
		audio.turnOn();
		audio.turnOn();

		audio2.setVolume(12);
//		System.out.println(audio2.voulume);

		List list = new ArrayList(); // 컨트롤 + 쉬프트 + o 임포트
//		List l2 = new List();
		// List 는 인터페이스이기 때문에 new가 안됨
		// 그리고 ArrayList가 list를 상속받아서(구현되서)
		// ArrayList 안에 list가 있어서 List 타입으로 변환이 가능

		// 상속을 받게되면 받게 된 클래스가 상속을 한 객체도 쓸수 있기 때문에
		// 아주 편함
		// 그게 다형성임

	}

}
