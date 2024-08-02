package sec01.exam01;

public class ThrowsTest {

	// throws ClassNotFoundException 이걸 씀으로써
	// method2를 쓰는 사용자한테 저 예외를 떠넘김
	
	void method2(String name) throws ClassNotFoundException {
		Class clazz = Class.forName(name);
	}

	// throws는 최소한 try - catch 를 해줘야하는데
	// 나말고 다른사람이 해줘~

	void method1() {
		try {
			method2("java.lang.String");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	void throwException() {
		System.out.println("출력");
		throw new NumberFormatException("글씨");
	}

	void human(int e) throws HumanException {
		System.out.println("human 실행 :  e :" + e);
		if (e < 5) {
			throw new HumanException("EC05");
		} else if (e > 10) {
			throw new HumanException("EC10");
		} else {
			System.out.println("5이상 10 이하로 정상입니다");
		}
	}

}
