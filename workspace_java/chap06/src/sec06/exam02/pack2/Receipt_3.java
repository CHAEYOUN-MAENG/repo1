package sec06.exam02.pack2;

public class Receipt_3 {

	public int a = 0;

	// 생성자 없을때(기본생성자만있을때) pack1에서 new 가능했음
	
	// 기본 생성자
//	public Receipt_3() {}

//	Receipt_3(){
		// default 접근제한자라고 읽는
		// 아무런 접근 제한자를 적지 않은 경우
		// 다른 package에서는 접근이 불가능함
		// not visible이라는 오류 발생
//	}

	public Receipt_3() {
		// public 접근제한자는
		// 다른 package에서 접근이 가능함
	}

	void test() {
		donation();
	}

	private void donation() {
		// private 접근제한자
		// 내 클래스 안에서만 사용 가능
		// 내 package에서도 못씀
	}

}
