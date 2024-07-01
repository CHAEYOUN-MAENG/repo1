package expert;

import java.util.Scanner;

public class ForExam {

	public static void main(String[] args) {

//		int a = 1;
//		int c = 0;
//
//		a = a + 10; // a += 10;
//		System.out.println(a);
//
//		a = a + 10;
//		System.out.println(a);
//
//		a = a + 10;
//		System.out.println(a);

		// 첫번째 : 초기화식 : 처음에 딱 한번만 실행됨
		// 두번째 : 조건식 : 거짓이 아닐 때, 반복시키는 조건
		// : 처음부터 조건이 맞아야 실행됨 (즉, 출력이 안되면 조건이 거짓임)
		// 실행되고
		// 세번째 : 증감식 : 실행문 끝에 무조건 실행해야 하는 코드를 넣는 곳

//		for (int b = 1; b <= 31; b += 10) {
//			System.out.println(b);
//		}

		for (int a = 1; a < 11; a++) {
			System.out.println(a);
		}

		System.out.println("----------------");

		for (int b = 3; b < 8; b++) {
			System.out.println(b);
		}

		System.out.println("----------------");

		int num = 8;
		for (int c = 1; c < num; c++) {
			System.out.println((c));
		}

		System.out.println("----------------");

//		Scanner scan = new Scanner(System.in);
//		int num1 = scan.nextInt();
//
//		for (int i = 1; i < num1; i++) {
//			System.out.println(i);
//		}

		System.out.println("----------------");

		for (int y = 1; y < 11; y++) {
//			y = y + 1;
			y += 1;
			System.out.println(y);
		}

		System.out.println("----------------");

		for (int y = 2; y < 11; y += 2) {
			System.out.println(y);
		}

		System.out.println("----------------");
		// 1+2+3+4+5 정답15

		int q = 0; // 결과값
		int p = 1; // p가 더할 변수 -> 초기화

		q = q + p; // 1
		p = p + 1; // p 2

		if (p <= 5) {
			q = q + p; // 3
			p = p + 1; // p 3
		}

		if (p <= 5) {
			q = q + p; // 6
			p = p + 1; // p 4
		}

		if (p <= 5) {
			q = q + p; // 10
			p = p + 1; // p 5
		}

		if (p <= 5) {
			q = q + p; // 15
			p = p + 1; // p 6
		}

		if (p <= 5) {
			q = q + p; // 15
			p = p + 1; // p 6
		}

		q = 0;
		for (int i = 1; i <= 5; i += 1) {
			q = q + i;
		}
		System.out.println(q);

		System.out.println("----------------");
		// 2+4+6+8+10
		// 0+2=2
		// 2+4=6
		// 6+6=12
		// 12+8=20
		// 20+10=30

		int t = 0; // 결과값
		int r = 2; // 더할값

		t = t + r; // 2
		r = r + 2; // r 4

		t = t + r; // 6
		r = r + 2; // 6

		t = t + r; // 12
		r = r + 2; // 8

		if (r <= 10) {
			t = t + r;
			r = r + 2;
		}

		t = 0;
		r = 2;
		for (int i = 0; i <= 10; i += 2) {
			t = t + i;
		}
		System.out.println(t);

		// 개수가 정해진 경우 for, 언제 끝날 지 잘 모를때 while

		System.out.println("----------------");

		// 짝수를 구해서 개수를 구한다
		int count1 = 0;
		for (int i = 4; i <= 100; i += 2) {
			count1++;
		}
		System.out.println(count1);

		System.out.println("----------------");

		// 3부터 100까지 1씩 증가할때
		// 나머지가 0이면 숫자를 센다

		int count2 = 0;
		for (int i = 3; i <= 100; i++) {
			if (i % 2 == 0) {
				count2++;
			}
		}
		System.out.println(count2);

		System.out.println("----------------");

		// 구구단을 출력할껀데 일단 2단을 나열할꺼야
		// 곱하는 값과 결과값에 곱하는 값이 동일해

		// 2 * 1 = 2
		// 2 * 1 = 2 * 1

		// 2 * 2 = 4
		// 2 * 1+1 = 2 * 2

		// 2 * 3 = 6
		// 2 * 1+1+1 = 2 * 3

		// 2 * 4 = 8
		// 2 * 4 = 2 * 4

		// 2 * 5 = 10
		// 2 * 5 = 2 * 5

		// 2 * 6 = 12
		// 2 * 6 = 2 * 6

		// 2 * 7 = 14
		// 2 * 7 = 2 * 7

		// 2 * 8 = 16
		// 2 * 8 = 2 * 8

		// 2 * 9 = 18
		// 2 * 9 = 2 * 9

		for (int i = 1; i <= 9; i++) {
			System.out.println("2 * " + i + " = " + 2 * i);
		}

		System.out.println("----------------");

		// 체력이 100, 한번 맞을때마다 17씩 생명이 줄어듬
		// 1대 맞을 경우, 100 - 17
		// 2대 맞을 경우, 100 - 17 - 17
		// 3대 맞을 경우, 100 - 17 - 17 - 17
		// 4대 맞을 경우, 100 - 17 - 17 - 17 - 17
		// 5대 맞을 경우, 100 - 17 - 17 - 17 - 17 - 17
		// 6대 맞을 경우, 100 - 17 - 17 - 17 - 17 - 17 - 17
		// 맞을 경우마다 17이 누적되서 반복돼

		// 1대 -> 17 * 1번 83
		// 2대 -> 17 * 2번 66
		// 3대 -> 17 * 3번 49
		// 4대 -> 17 * 4번 32
		// 5대 -> 17 * 5번 15 -> i >= 0 크니까 반복문 안으로 들어옴
		// 6대 -> 17 * 6번 -2

		int count5 = 0;
		for (int i = 100; i >= 0; i -= 17) {
//			if( i >= 0) {
//				count5++;
//			}
			count5++;
		}
		System.out.println(count5);
		
		System.out.println("----------------");

		// 400만원의 원금 회수
		// 일주일에 6만원씩
		
		// 7일 6만원
		// 14일 12만원
		// 21일 18만원
		// 57일 399만원
		
		// 66일때 396만원 h =4 만족이 -> for
		// 67일때 402만원 h = -2 불만족이 -> forX
		int count6 =0;
		for(int h=400; h>=0; h-=6){
			System.out.println(h);
			
			for(int i=1; i<=7; i++) {
				System.out.println(i);
			}
			System.out.println("6만원이 갚았습니다");
			System.out.println((h-6)+"만원이 남았습니다");
			System.out.println("----------------");
			count6++;
		};		
		System.out.println(count6+"번");
		
		
		
		
	}
}
