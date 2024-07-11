package expert;

import java.util.Scanner;

public class ForExam4 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int sc = scan.nextInt();

		// 첫번째줄
		// 앞자리는 0으로 고정
		// 뒷자리는 0부터 1씩 증가됨

		// 두번째줄
		// 앞자리는 1로 고정
		// 뒷자리는 0부터 1씩 증가됨

		for (int i = 0; i < sc; i++) { // 세로줄수
			for (int p = 0; p < sc; p++) { // 가로줄수
				System.out.print(i); // 세로 0부터 1씩 커지는거
				System.out.print(p); // 가로 1부터 1씩 커지는거
				System.out.print(" ");
			}
			System.out.println();
		}

	}

}
