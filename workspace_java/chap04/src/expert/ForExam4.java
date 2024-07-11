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

		// 앞자리는 0부터 시작이야
		// 첫번째줄은 0이야
		// 근데 가로방향은 앞자리가 고정이고
		// 뒷자리는 0부터 1씩 증가돼
		// 00 01 02 03 04 05 06

		// 두번째줄은 1이야
		// 뒷자리는 똑같이 0부터 1씩 증가돼
		// 10 11 12 13 14 15 16

		// 앞자리 열(세로)가 늘어날 수록 0부터 1씩 증가되고 있어 -> 반복문1
		// 뒷자리 행(가로)이 늘어날 수록 0부터 1씩 증가되고 있고 -> 반복문2
		// 근데 전체 개수는 행과 열을 곱한 개수와 똑같아 (가로 * 세로)

		// 나는 앞자리와 뒷자리를 더해서 두자리수를 만들꺼야

		// 행의 개수가 2이고 열의 개수가 2이면
		// 00 01
		// 10 11
		// 20 21

		// 행의 개수가 3이고 열의 개수가 3이면
		// 00 01 02
		// 10 11 12
		// 20 21 22

	}

}
