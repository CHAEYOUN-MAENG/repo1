package sec01.exam01;

public class ForExam {

	public static void main(String[] args) {

		// 1씩 증가하는 걸 5번 할꺼임
		int sum = 0;
		sum = sum + 1;
//		sum += 1;
//		sum++;
		sum = sum + 1;
		sum = sum + 1;
		sum = sum + 1;
		sum = sum + 1;
		System.out.println("sum : " + sum);

		// 참고로 1~n까지 더한 값
		// n*(n+1) / 2

		// 1 + 2 + 3 + 4 + 5
		sum = 0;
		sum = sum + 1;
		sum = sum + 2;
		sum = sum + 3;
		sum = sum + 4;
		sum = sum + 5;
		System.out.println("sum : " + sum);

		// 1,2,3 .. 에 해당하는 걸 변수에 넣어보자
		sum = 0;
		int i = 0;		// 초기화식

		i++;// i == 1   // 증감식
		sum = sum + i;	// 실행문

		i++;// i == 2
		sum = sum + i;

		/*
		 * 반복문 만드는 원리
		 * 
		 * 반복되는 것 찾기 (ctrl + c,v 해도 바뀌지 않는 것) 
		 * 
		 * 반복되지 않는 것 
		 * 	패턴(규칙)을 찾을 수 있다면 반복문으로 만들 수 있음
		 * 	변수를 활용해서 반복되게 만들기
		 * 
		 * 반복되지 않는 것의 
		 * 	시작조건 찾기, 종료조건 찾기
		 * 
		 * for : 반복 횟수를 아는 경우
		 * while : 반복 횟수를 모르는 경우
		 * 
		 */

		// 맨 처음 한번만 초기화식 실행
		// 	조건이 참이면 
		//	실행블럭 실행하고
		//	증감식 실행하고
		// 다시 조건 보기 반복
		
		// for(초기화식 ; 조건 ; 증감식){실행블럭}
		int sum2 = 0;
		for( int e = 1 ; e <=5 ; e++ ) {
			sum2 = sum2 + e;
			System.out.println("실행블럭 안 e : "+ e +", sum2 : "+ sum2);
		}
		System.out.println("sum2 : "+ sum2);

		
		int total = 0;
		for ( int a = 0 ; a <=10 ; a++ ) {
			total = total + a;
			System.out.println("a : "+ a +",total : "+ total);
		}
		System.out.println("total : "+ total); 
		
		/* 
		 * total = 0;
		 * int a = 0;
		 * int a = a + 1; -> a++;
		 * total = total + 1;
		 * total = total + 2;
		 * total = total + 3;
		 * total = total + 4;
		 * total = total + 5;
		 * total = total + 6;
		 * total = total + 7;
		 * total = total + 8;
		 * total = total + 9;
		 * total = total + 10;
		 * System.out.println("total : "+ total);
		 * 
		 * 변경되는 규칙을 변수로 바꿈
		 * a -> a++; (1씩 증가)
		 */
		
		int total2 = 0;
		for (int b = 1 ; b <= 10 ; b++) {
			total2 = total2 + b;
			System.out.println("b : "+ b +",total2 : "+ total2);
		}
		System.out.println("total2 : "+ total2);
		
		System.out.println("------------");
		
		// 1부터 10까지 짝수만 출력하기
		// 1. 증감식 이용하기
		// 2. if문 이용하기
		// 3. 1 ~ 10 까지 한줄에 3개씩 출력하기
		
		// 1. 증감식 이용하기

//		
		// 2. if문 이용하기 
		int x = 1;
		
		if (x % 2 == 0) {
			System.out.println("짝수입니다");
		} else {
			System.out.println("홀수입니다");
		}
		
		x = 3;
		
		if (x % 2 == 0) {
			System.out.println("짝수입니다");
		} else {
			System.out.println("홀수입니다");
		}
		
		x = x + 1;
		
		if (x % 2 == 0) {
			System.out.println("짝수입니다");
		} else {
			System.out.println("홀수입니다");
		}
		
		


		
		
	}

}
