package expert;

import java.util.Scanner;

public class IfforExam {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

//		if (num % 2 == 0) {
//			System.out.println("EVEN");
//		} else if (num % 2 == 1) {
//			System.out.println("ODD");
//		}

//		if (num > 0) {
//			System.out.println("Positive");
//		} else if (num < 0) {
//			System.out.println("Negative");
//		} else if (num == 0) {
//			System.out.println("Zero");
//		}

//		switch (num) {
//		case 1:
//			System.out.println("one");
//			break;
//		case 2:
//			System.out.println("two");
//			break;
//		case 3:
//			System.out.println("three");
//			break;
//		default:
//			System.out.println("other");
//		}

//		for (int i = 1; i < 11; i++) {
//			System.out.print(i);
//			System.out.print(" ");
//		}
//
//		int x = 11;
//
//		while (x > 1) {
//			x--;
//			System.out.print(x);
//			System.out.print(" ");
//		}

		// i = 1, p = 1
		// i = 2, p = 2
		// i = 3, p = 3

//		for (int i = 1; i <= num; i++) {
//			for (int p = 0; p < i; p++) {
//				System.out.print("*");
//			}
//			System.out.println("");
//		}

//		for (int i = 1; i <= num; i += 1) {
//			if (i % 2 == 0) {
////				System.out.println("짝");
//				continue;
//			}
//			for (int p = 0; p < i; p++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}

		int time = scan.nextInt();
		int minute = scan.nextInt();
//		System.out.println(time + " " + minute);

		if (minute >= 0 && minute < 60 && time >= 0 && time < 24) {

			minute += 35;
			if (minute >= 60) {
				time += 1;
				minute -= 60;
			}
			if (time >= 24) {
				time = 0;
			}
			System.out.println(time + " " + minute);

		} else {
			System.out.println("0 0");
		}

	}

}
