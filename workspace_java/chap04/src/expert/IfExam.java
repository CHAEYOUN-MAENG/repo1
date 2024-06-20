package expert;

public class IfExam {

	public static void main(String[] args) {

		int a = 10;
		boolean b = a < 5; // 결과가 boolean 값 (true/ false)으로 돌려줄 수 있는 것은 들어갈 수 있음

		// if ( a > 5 )
		if (b) {
			System.out.println(a + "은(는) 5보다 작습니다");
		} else if (a < 15) {
			System.out.println(a + "은(는) 15보다 작습니다");
		} else if (a < 25) {
			System.out.println(a + "은(는) 25보다 작습니다");
		}

		if (b) {
			System.out.println(a + "은(는) 5보다 작습니다");
		}
		if (a < 15) {
			System.out.println(a + "은(는) 15보다 작습니다");
		}
		if (a < 25) {
			System.out.println(a + "은(는) 25보다 작습니다");
		}

		// else로 묶는것과 묶지 않는 것의 차이

		boolean a1 = true;
		boolean a2 = true;
		boolean a3 = false;

		System.out.println(a1 && a3 && a2); // && a2는 보지도 않음
//		String b1 = "치킨";
		String b1 = null;

		if (b1 != null) {
//			System.out.println(123); 

			if (b1.length() > 4) {
				System.out.println(b1);
			}
		}

		if (b1 != null && b1.length() > 4) {
			System.out.println(b1);
		} // b1 != null 이 거짓이기 때문에 &&부터 뒤로 계산 X -> 그래서 에러가 안남 (and는 false만 찾아감)

		System.out.println(a1 || a3 || a2);

		// &&(논리곱) 는 2개가 다 true일때만 true가 나옴 즉, 거짓이 나오면 뒤에 꺼보지도 않음
		// ||(논리합) 는 2개중에 하나만 true가 있어도 true가 나옴 즉, 참이 나오면 뒤에꺼 보지도 않음

		System.out.println(false || true && true);
		System.out.println((false || true) && true);
		// && 연산자가 || 연산자보다 우선순위가 높음 (먼저계산)

		// if ( 3 < a < 5){} -> 3 < a 는 true 또는 false가 나오는데 그것과 < 5 는 타입이 달라서 비교자체가 안됨
		if (a > 3 && a < 5) {

		}
		
		//랜덤실습부터
		
		
	}

}
