package sec01.exam01;

import java.util.Scanner;

public class For연습1Exam {

	public static void main(String[] args) {

		// 주어진 수가 양수(0포함), 음수 여부 출력
//		Scanner scan= new Scanner(System.in);
//		int a = 0;
//		System.out.println("숫자를 입력하세요");
//		int a = scan.nextInt();
//		if(a >= 0) {
//			System.out.println("양수");
//		} else {
//			System.out.println("음수");
//		}
		
		/*
		// 입력을 3번 반복
		for (int i = 1; i <= 3; i++) {
			System.out.println("숫자를 입력하세요");
			int a = scan.nextInt();
			if(a >= 0) {
				System.out.println("양수");
			} else {
				System.out.println("음수");
			}
		}
		*/
		
		// 입력받은 숫자가 0이 아닌 동안 계속 반복
//		for(int a = 1; a != 0; ) {
//			System.out.println("숫자를 입력하세요");
//			a = scan.nextInt();
//			if(a >= 0) {
//				System.out.println("양수");
//			} else {
//				System.out.println("음수");
//			}
//		}
//		System.out.println("종료되었습니다");
		
		/*
		0단계
		+
		+
		+
		+
		+
		
		1단계
		+++++
		
		2단계
		+++++
		+++++
		+++++
		
		2-1단계
		+ + + + +
		
		3단계
		+
		++
		+++
		++++
		+++++
		
		4단계
		+....
		++...
		+++..
		++++.
		+++++
		
		5단계
		....+
		...++
		..+++
		.++++
		+++++
		
		6단계
		....+
		...+++
		..+++++
		.+++++++
		+++++++++
		
		7단계
		....+....
		...+++...
		..+++++..
		.+++++++.
		+++++++++
				
		*/
		
		// 0단계
//		System.out.println("+");
//		System.out.println("+");
//		System.out.println("+");
//		System.out.println("+");
//		System.out.println("+");
		
		for (int i = 1; i <= 5; i++ ) {
			System.out.println("+");
		}
		
		// 1단계
		System.out.print("+");
		System.out.print("+");
		
		for (int i = 1; i <=5; i++) {
			System.out.print("+");
		}
		
		System.out.println();
		System.out.println("---------");
		
		// 2단계
		for (int a = 1; a <= 3; a++ ) {
			for (int i = 1; i <=5; i++) {
				System.out.print("+");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("---------");
		
		// 2-1단계
//		System.out.print("+");
//		System.out.print(" ");
		for(int i=1; i<=5; i++) {
			System.out.print("+");
			System.out.print(" ");
		}
		
		System.out.println();
		System.out.println("---------");
		
		// 3단계
		System.out.println("+    ");
		System.out.println("++   ");
		System.out.println("+++  ");
		System.out.println("++++ ");
		System.out.println("+++++");
		
		System.out.println("---------");
		for(int i=1; i<=5; i++ ) {
			for(int q=1; q<=i; q++) {
				System.out.print("+");
			}
			System.out.println();	
		}
		// 범위를 모르겠습니다
		
		System.out.println();
		System.out.println("---------");
		
		// 4단계
		for (int i=1; i<=5; i++) {
			for(int q=1; q<=i; q++) {
				System.out.print("+");
			}
			for(int p=1; p<=(5-i); p++) {
				System.out.print(".");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("---------");
		
		// 5단계
		for (int i=1; i<=5; i++) {
			for(int p=1; p<=(5-i); p++) {
				System.out.print(".");
			}
			for(int q=1; q<=i; q++) {
				System.out.print("+");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("---------");
		
		// 6단계
		for (int i=1; i<=5; i++) {
			for(int p=1; p<=(5-i); p++) {
				System.out.print(".");
			}
			for(int q=1; q<=(i * 2 - 1); q++) {
				System.out.print("+");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("---------");
		
		// 7단계
		for (int i=1; i<=5; i++) {
			for(int p=1; p<=(5-i); p++) {
				System.out.print(".");
			}
			for(int q=1; q<=(i * 2 - 1); q++) {
				System.out.print("+");
			}
			for(int p=1; p<=(5-i); p++) {
				System.out.print(".");
			}
			System.out.println();
		}
		
		
	}

}
