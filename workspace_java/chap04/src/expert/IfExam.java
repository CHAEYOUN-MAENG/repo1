package expert;

import java.util.Scanner;

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

		double rand = Math.random();
		double 답1 = rand * 100.0;
		// 0 <= rand < 1.0
		// (int)답1

		// 5 ~ 7까지 랜덤으로 뽑고 싶을때
		// 5 + (0 ~ 2)
//		int a02 = (int)(rand * 3);
		int 결과1 = (int) (Math.random() * 3) + 5;
		int 결과2 = (int) (Math.random() * 389545) % 3 + 5; // 0 ~ 9999

		// 로또번호 6개를 뽑는 것
		double lotto = Math.random();
		int lotto1 = (int) (lotto * 45) + 1; // 1 ~ 45

		double lotto2 = Math.random();
		int lotto3 = (int) (lotto2 * 45) + 1;

		double lotto4 = Math.random();
		int lotto5 = (int) (lotto4 * 45) + 1;

		double lotto6 = Math.random();
		int lotto7 = (int) (lotto6 * 45) + 1;

		double lotto8 = Math.random();
		int lotto9 = (int) (lotto8 * 45) + 1;

		double lotto10 = Math.random();
		int lotto11 = (int) (lotto10 * 45) + 1;

		System.out.println(lotto1);
		System.out.println(lotto3);
		System.out.println(lotto5);
		System.out.println(lotto7);
		System.out.println(lotto9);
		System.out.println(lotto11);

		// 내 주머니에 만 원 있음
		// 술을 마시고 싶어요
		// 소주 : 5000
		// 과자 : 2000
		// 컵라면 : 1500
		// 족발 : 35000

		// 온도에 따른 if문
		Scanner scan = new Scanner(System.in);
		int weather = scan.nextInt();

		if (weather > 1) {
			System.out.println("영상 " + weather + "도 입니다");
		} else if (weather <= 0) {
			System.out.println("영하 " + (weather * (-1)) + "도 입니다");
		}

		// scan을 받아서(숫자)
		// 2000과 3000 사이면 맞습니다 (그리고)
		// 아니면 틀립니다
//		Scanner num = new Scanner(System.in);
//		int number = num.nextInt();

//		if (number >= 2000 && number <= 3000) {
//			System.out.println("2000과 3000 사이입니다");
//		} else {
//			System.out.println("2000과 3000 사이가 아닙니다");
//		}

		// 3월 ~ 5월까지 봄
		// 6월 ~ 8월까지 여름
		// 9월 ~ 11월까지 가을
		// 12월 ~ 2월까지 겨울

//		if (number >= 3 && number <= 5) {
//			System.out.println("봄입니다");
//		} else if (number >= 6 && number <= 8) {
//			System.out.println("여름입니다");
//		} else if (number >= 9 && number <= 11) {
//			System.out.println("가을입니다");
//		} else if ((number == 12) || (number >= 1 && number <= 2)) {
//			System.out.println("겨울입니다");
//		}

//		if ((number >= 1 && number <= 2) || number == 12) {
//			System.out.println("겨울");
//		} else if (number <= 5) {
//			System.out.println("봄");
//		} else if (number <= 8 ) {
//			System.out.println("여름");
//		} else if (number <= 11) {
//			System.out.println("가을");
//		}

	}

}
