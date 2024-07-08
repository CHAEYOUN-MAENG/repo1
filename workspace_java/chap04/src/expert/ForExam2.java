package expert;

public class ForExam2 {

	public static void main(String[] args) {

//		++++*++++ 
//      +++***+++ 
//      ++*****++ 
//      +*******+ 
//      ********* 

		for (int i = 1; i < 6; i++) {
			for (int t = 5; t > i; t--) {
				System.out.print("+");
			}
			for (int p = 1; p < 2 * i; p++) {
				System.out.print("*");
			}
			for (int t = 5; t > i; t--) {
				System.out.print("+");
			}
			System.out.println(" "); // 한줄 띄어쓰기

		}

		System.out.println("------------");

		for (int i = 1; i < 6; i++) {
			for (int t = 5; t > i; t--) {
				System.out.print(" ");
			}
			for (int p = 1; p < 2 * i; p++) {
				System.out.print("*");
			}
			for (int t = 5; t > i; t--) {
				System.out.print(" ");
			}
			System.out.println(" ");
		}

		System.out.println("------------");

//		++++ 1 -> 4
//      +++ 2 -> 3
//      ++ 3 -> 2
//      + 4 -> 1

		for (int i = 1; i < 5; i++) {
			for (int p = 5; p > i; p--) {
				System.out.print("+"); // 출력을 꼭 해보자..
			}
			System.out.println(" ");
		}

		System.out.println("------------");

		// 구구단 2단
		for (int i = 1; i < 10; i++) {
			System.out.println("2 * " + i + " = " + 2 * i);
		}

	}

}
