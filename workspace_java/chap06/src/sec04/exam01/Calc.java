package sec04.exam01;

public class Calc {

	// 계산기 전원 상태
	// 필드는 선언과 동시에 초기화는 가능하나
	// 딴 것을 할 순 없음
	boolean isOn = false;

	void poweroff() {
		System.out.println("전원을 끕니다");
	}

	// 내 식구 안에서는 자유롭게 new 없이 사용할 수 있다
//	void num1() {
//		poweroff();
//	}

	void powerOn() {
		System.out.println("전원을 켭니다");
		isOn = true; // 내꺼에 있는 필드, 메소드를 그냥 갖다 쓸 수 있다
	}

	/**
	 * 더하기 두 수를 받아서 더한 결과를 돌려줌
	 * 
	 * 메소드명 : plus 
	 * 전달인자 : int, int 
	 * 리턴타입 : int (두 수를 더한 결과)
	 * 
	 * @author email@naver.com
	 * @param int x, int y
	 * @return int
	 */

	int plus(int x, int y) {
		
		System.out.println("x : " + x);
		System.out.println("y : " + y);

		return x + y;

	}

	// 지역변수여서 위에 있는 x, y 사용해도 됨

	/**
	 * 나누기 두 수를 받아서 나눈 결과를 돌려줌 
	 * 인트로 받아서 결과값은 double로 형변환 해줘야함
	 * 
	 * 메소드명 : divide 
	 * 전달인자 : int, int 
	 * 리턴타입 : double
	 * 
	 * @author email@naver.com
	 * @param int t, int p
	 * @return double
	 */

	double divide(int t, int p) {
		
		System.out.println("t : " + t);
		System.out.println("p : " + p);

		// 아래의 조건이 만족하지 않는 경우 아래의 return이 실행
		if (p == 0) {
			System.out.println("0이으로 나눌 수 없습니다");
			return 0;
		}

		// int / int는 int 이기때문에 의미가 없음, 강제 형변환 해줘야됨
		return t / (double) p;

	}
	
	/**
	 * 더하기2
	 * 
	 * 전달인자 : int 배열
	 * 리턴타입 : int
	 */
	
	int plus2 (int[] num) {
		int x = num[0];
		int y = num[1];
		
		return x + y;
	}
	
	/**
	 * 전달인자의 개수를 지정하지 않고
	 * 전달받은 만큼 처리하는 방법
	 * "..." 가변인자, 가변 길이 파라메터 -> 변수의 개수가 몇개인지 모름
	 * 전달받은 모든 전달인자를 배열로 처리
	 */
	int plus3 (int ...num) {
		System.out.println("num : "+ num);
		
		int sum = 0;
		for(int i = 0; i < num.length; i++) {
			sum = sum + num[i];
		}
		
		return sum;
	}
}
