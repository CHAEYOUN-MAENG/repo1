package sec01.exam01;

public class OpExampj {

	public static void main(String[] args) {
		/*
		 * 7234원이 있어요 5000원, 1000원, 500원, 100원, 50원, 10원, 1원 각각 최대 몇개까지로 표현할 수 있나요?
		 */

		/*
		 * 5천원 : 1 1천원 : 2 500원 : 0 100원 : 2 50원 : 0 10원 : 3 1원 : 4
		 * 
		 * 1. 예측과 결과가 같은지 확인 - 개발 2. 숫자를 바꿔도 잘 나오는지 (두,세번 해보기) - 테스트
		 */

		int money = 7234;

		// 방법1
//		// 5천원
//		int m5000 = money / 5000; // int끼리 나누기라 결과는 int이고 예상값은 1
//		System.out.println("5천원 : " + m5000);
//
//		// 1천원
//		int m1000 = money / 1000; // 예상값은 2
//		System.out.println("1천원은 :"+ m1000); // 결과 7 -> 대상금액이 7234원이여서
//
//		// 17천원이었을때는 5천원 3장을 빼고 계산해야함
//		int m1000 = (money - (5000 * m5000)) / 1000;
//		int money2 = money - (5000 * m5000);
//		int money = money2 / 1000;
//
//		int m1000 = (money - 5000) / 1000; // 결과 : 2
//		System.out.println("1천원 : " + m1000);
//
//		// 500원
//		전체금액에서 5천원원 빼고, 남은 금액에서 1천원 빼고
//		int m500 = (money - (5000 * m5000) - (1000 * m1000)) / 500;
//		int money3 = money2 - (1000 * m1000);
//		int m500 = money3 / 500;
//		System.out.println("500원 : " + m500);

		// 방법2
		int m5000 = money / 5000;
		System.out.println("5천원 : " + m5000);

		// 나머지(2234)
		money = money % 5000;
		int m1000 = money / 1000;
		System.out.println("1천원 : " + m1000);

		// 나머지 (234)
//		money = money % 1000; 아래와 동일
		money %= 1000;
		int m500 = money / 500;
		System.out.println("500원 : " + m500);

		/*
		 * String left = "수박"; String right = "멜론";
		 * 
		 * // 단, left = "멜론" 금지 System.out.println(left); // 결과 : 멜론
		 * System.out.println(right); // 결과 : 수박
		 */
		
		System.out.println( 3 > 5 );
		boolean bool = 3 > 5;
		System.out.println(bool);
		
		System.out.println(1.0 == 1.0f);
		System.out.println(0.1 == 0.1f);
		// 같은타입으로 변경해서 비교
		
		System.out.println("3 == 3 " + (3 == 3));
		System.out.println("3 != 3 " + (3 != 3));
		
		String str1 = "맹채윤";
		String str2 = "맹채윤";
//		글씨 비교는 == 사용 금지
//		String 변수나 ""에 .equals()를 붙여서 사용 ()안에 글씨와 비교
//		System.out.println(str1 == str2);
		System.out.println( str1.equals(str2) );
		
		System.out.println(  10 & 3  );
		
		int i1 = 3;
		int i2 = 15;
		int i3 = 7;
		System.out.println(" i3이 가장 큰 값인가? "
						+ ( i3 >= i1 && i3 >= i2));
		
		boolean i4 = i3 > i2; 
		System.out.println(i4 ? "i3이 크다" : "i3이 작거나 같다");
							// true 일경우 : 기준 왼 false일 경우 : 기준 오
		
		// 방법1
		int value = 356;
		int value2 = value / 100;
//		System.out.println(value2);
		int value3 = value2 * 100;
		System.out.println(value3);
		
		// 방법2
		System.out.println(value - (value % 100));
		
		int var1 = 5;
		int var2 = 2;
		double var3 = (double) var1 / var2; // var1 / var2 는 int 이기 때문에 double로 형변환 해줘야함
		System.out.println(var3);
		
		int var4 = (int) (var3 * var2);
		System.out.println(var4);
		
	}

}
