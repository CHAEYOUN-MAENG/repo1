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
		int i = 0; // 초기화식

		i++;// i == 1 // 증감식
		sum = sum + i; // 실행문

		i++;// i == 2
		sum = sum + i;

		/*
		 * 반복문 만드는 원리
		 * 
		 * 반복되는 것 찾기 (ctrl + c,v 해도 바뀌지 않는 것)
		 * 
		 * 반복되지 않는 것 패턴(규칙)을 찾을 수 있다면 반복문으로 만들 수 있음 변수를 활용해서 반복되게 만들기
		 * 
		 * 반복되지 않는 것의 시작조건 찾기, 종료조건 찾기
		 * 
		 * for : 반복 횟수를 아는 경우 while : 반복 횟수를 모르는 경우
		 * 
		 */

		// 맨 처음 한번만 초기화식 실행
		// 조건이 참이면
		// 실행블럭 실행하고
		// 증감식 실행하고
		// 다시 조건 보기 반복

		// for(초기화식 ; 조건 ; 증감식){실행블럭}
		int sum2 = 0;
		for (int e = 1; e <= 5; e++) {
			sum2 = sum2 + e;
			System.out.println("실행블럭 안 e : " + e + ", sum2 : " + sum2);
		}
		System.out.println("sum2 : " + sum2);

		int total = 0;
		for (int a = 0; a <= 10; a++) {
			total = total + a;
			System.out.println("a : " + a + ",total : " + total);
		}
		System.out.println("total : " + total);

		/*
		 * total = 0; int a = 0; int a = a + 1; -> a++; total = total + 1; total = total
		 * + 2; total = total + 3; total = total + 4; total = total + 5; total = total +
		 * 6; total = total + 7; total = total + 8; total = total + 9; total = total +
		 * 10; System.out.println("total : "+ total);
		 * 
		 * 변경되는 규칙을 변수로 바꿈 a -> a++; (1씩 증가)
		 */

		int total2 = 0;
		for (int b = 1; b <= 10; b++) {
			total2 = total2 + b;
			System.out.println("b : " + b + ",total2 : " + total2);
		}
		System.out.println("total2 : " + total2);

		System.out.println("------------");

		// 1부터 10까지 짝수만 출력하기
		// 1. 증감식 이용하기
		// 2. if문 이용하기
		// 3. 1 ~ 10 까지 한줄에 3개씩 출력하기

		// 1. 증감식 이용하기
		System.out.println(2);
		int i4 = 4;

		System.out.println(4);
		i4 = i4 + 2; // 6

		System.out.println(6);
		i4 = i4 + 2;

		System.out.println("---------------");
		for (int i5 = 2; i5 <= 10; i5 = i5 + 2) {
			System.out.println(i5);
		}

		System.out.println("---------------");
		// 2. if문 이용하기
		int num = 0;
		if (num % 2 == 0) {
			System.out.println(num);
		}

		num = 1;
		if (num % 2 == 0) {
			System.out.println(num);
		}

		num = 2;
		if (num % 2 == 0) {
			System.out.println(num);
		}

		num = 3;
		if (num % 2 == 0) {
			System.out.println(num);
		}

		System.out.println("------------------");
		for (int num2 = 1; num2 <= 10; num2++) {
			if (num2 % 2 == 0) {
				System.out.println(num2);
			}
		}

		System.out.println("---------------------");
		// 3. 1 ~ 10 까지 한줄에 3개씩 출력하기
		System.out.println(123);
		System.out.println(456);

		System.out.print(1);
		System.out.print(2);
		System.out.print(3);
		System.out.println();

		int num3 = 3;
		num3++;
		System.out.print(num3);
		num3++;
		System.out.print(num3);
		num3++;
		System.out.print(num3); // 6

		int x;
		// 1부터 100까지 3의 배수가 몇개 있는가?
//		1 2 3 4 5 6 7 8 9 10
//		    1     2     3

		System.out.println("-------------");
		int count = 0; // count = count + t
		for (int t = 1; t <= 100; t += 1) {
			if (t % 3 == 0) {
				count++;
			}
		}
		System.out.println("3의 배수의 개수는 : " + count++);

		System.out.println("-------구구단--------");
		// 구구단
		// 2단 출력
		System.out.println("2 * 1 = 2");
		System.out.println("2 * 2 = 4");
		System.out.println("2 * 3 = 6");
		// 1, 2, 3, 4, 1씩 증가하는 건 알고
		// 2, 4, 6, 8, 2씩 증가하는건 알고 꼭 곱하기 2를 해야하는가?
		int cnt = 3;
		cnt++;
		System.out.println("2 * " + cnt + " = " + (2 * cnt));

		System.out.println("------");

		for (int k = 1; k <= 9; k++) {
			System.out.println("2 * " + k + " = " + (2 * k));
		}

		System.out.println("------");

		for (int k = 1; k <= 9; k++) {
			System.out.println("3 * " + k + " = " + (3 * k));
		}

		System.out.println("------");

		int dan = 0; // 왜 3을 선언하는가?
		dan++;
		for (int dan2 = 2; dan2 <= 9; dan2++) {
			for (int k = 1; k <= 9; k++) {
				System.out.println(dan2 + "*" + k + "=" + (dan2 * k));
			}
		}

		/*
		 * 2 * 1 = 2 2 * 2 = 4 2 * 3 = 6 2 * 5 = 10
		 * 
		 * z++
		 */

		for (int z = 1; z <= 9; z++) {
			System.out.println("3 * " + z + " = " + 3 * z);
		}

		System.out.println("------------");

		for(int g = 2; g <=9; g++) {
			for(int z = 1; z <= 9; z++) {
				System.out.println(g +" * " + z +" = " + g * z);
			}
		}


	}
}
