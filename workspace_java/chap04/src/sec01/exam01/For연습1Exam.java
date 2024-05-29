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
		
		System.out.println();
		System.out.println("---------");
		
		// 1단계
//		System.out.print("+");
//		System.out.print("+");
		
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
//		System.out.println("+    ");
//		System.out.println("++   ");
//		System.out.println("+++  ");
//		System.out.println("++++ ");
//		System.out.println("+++++");
		
		System.out.println("---------");
		for(int i=1; i<=5; i++ ) {
			for(int q=1; q<=i; q++) {
				System.out.print("+");
			}
			System.out.println();	
		}
		
//		3번 문제 안에 for문 참고
//		for(int q=1; q<=2; q++) {
//			System.out.print("+");
//		}

		
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
		
		/*
		 * # 구구단 출력 문제


		 1단계
		 구구단 한단을 옆으로 출력
		 2x1=2 2x2=4...
		 3x1=3 3x2=6...
		 ...
		 
		 2단계
		 구구단 옆으로 3단씩 출력
		 2x1=2 3x1=3 4x1=4
		 ...
		 
		 5x1=5...
		 ...
		 */
		
		// 1단계	
		for(int z=2; z<=9; z++) {
			for(int y=1; y<=9; y++) {
				System.out.print(z +" * "+ y +" = "+ y*z);
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("---------");
		
		
		// 2단계
//		int y=1;
//		for(int z=2; z<=4; z++) {
//			System.out.print(z +" * "+ y +" = "+ y*z);
//		}
//		
//		System.out.println();
//		y = 2;
//		for(int z=2; z<=4; z++) {
//			System.out.print(z +" * "+ y +" = "+ y*z);
//		}
//		
//		System.out.println();
//		y = 3;
//		for(int z=2; z<=4; z++) {
//			System.out.print(z +" * "+ y +" = "+ y*z);
//		}
//		
//		System.out.println();
//		
//		for (int y=1; y<=9; y++) {
//			for(int z=2; z<=4; z++) {
//				System.out.print(z +" * "+ y +" = "+ y*z);
//			}
//			System.out.println();
//		}
//		System.out.println();
//		
//		for (int y=1; y<=9; y++) {
//			for(int z=5; z<=7; z++) {
//				System.out.print(z +" * "+ y +" = "+ y*z);
//			}
//			System.out.println();
//		}
//		System.out.println();
//		
//		for (int y=1; y<=9; y++) {
//			for(int z=8; z<=10; z++) {
//				System.out.print(z +" * "+ y +" = "+ y*z);
//			}
//			System.out.println();
//		}
//		System.out.println();
		
		
		for (int f=2; f<=8; f++) {
			for (int y=1; y<=9; y++) {
				for(int z=f; z<=(f+2); z++) {
					System.out.print(z +" * "+ y +" = "+ y*z);
				}
				System.out.println();
			}
			System.out.println();
		}
		
		
	}

}
