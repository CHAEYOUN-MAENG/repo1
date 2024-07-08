package sec05.exam02;

public class Singleton {

//	static Singleton s = null;
	static Singleton s = new Singleton(); 
	
	// new 한번만 해서 그녀석을 돌려씀 (장점)
	// 쓰지 않아도 메모리에 저장이 되어있음 (단점)
	
	
	// 생성을 못하게 막았다
	private Singleton() {

	}

	static Singleton getInstance() {
//		if (s == null) {
//			s = new Singleton();
//		}

		return s;
	}

}
