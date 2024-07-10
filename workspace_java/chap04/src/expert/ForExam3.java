package expert;

import java.util.Scanner;

public class ForExam3 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
//		int scan = scanner.nextInt();
//
//		int count = 0;
//
//		for (int i = 1; i < scan; i++) {
//			int num = scanner.nextInt(); // scan만큼 내가 입력한 숫자의 합을 출력
//			count += num;
//		}
//		System.out.println("count : " + count);

//		int num1 = scanner.nextInt();
//		int num2 = scanner.nextInt();
//
//		int a = num1;
//
//		for (int i = 1; i < num2; i++) {
//
//			a *= num1;
//
//		}
//		System.out.println(a);

//		int num = scanner.nextInt();
//
//		for (int i = 0; i < num; i++) {
//			for (int p = 0; p < num; p++) {
//				System.out.print(i);
//				System.out.print(p);
//				System.out.print(" ");
//			}
//			System.out.println();
//		}

		int num = scanner.nextInt();

		for (int i = 0; i < num; i++) {
			System.out.print("*");
		}
		System.out.println(" ");

		for (int i = 0; i < num - 2; i++) { // 줄수
			System.out.print("*");
			for (int p = 0; p < num - 2; p++) { // 공백수
				System.out.print(" ");
			}
			System.out.println("*");
		}

		for (int i = 0; i < num; i++) {
			System.out.print("*");
		}

//		int num = scanner.nextInt();
//
//		for (int t = 0; t < num; t++) {
//			for (int i = 0; i < num; i++) {
//				System.out.print("A");
//			}
//			for (int i = 0; i < num; i++) {
//				System.out.print("B");
//			}
//			System.out.println();
//		}
//
//		for (int t = 0; t < num; t++) {
//			for (int i = 0; i < num; i++) {
//				System.out.print("B");
//			}
//			for (int i = 0; i < num; i++) {
//				System.out.print("A");
//			}
//			System.out.println();
//		}

//		int num = scanner.nextInt();
//		for (int p = 0; p < num; p++) {
//			for (int i = 0; i < num; i++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}

		// 아스키 코드
//		int num = scanner.nextInt();
//		int a = 65;
//		int count = 0;
//		for (int i = 1; i <= num; i++) {
//			for (int p = 0; p < i; p++) {
//				System.out.printf("%c", a);
//			}
//			System.out.println();
//			a++;
//			count++;
//			for (int j = num; j > 0; j--) {
//
//			}
//		}

	}

}
