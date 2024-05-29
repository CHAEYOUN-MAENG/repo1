package sec01.exam01;

public class BreakExam {

	public static void main(String[] args) {

		System.out.println("게임을 시작하지");
		int count = 0;
		while (true) {
//			count++; // 무조건 새는거
			int num = (int) (Math.random() * 6) + 1;
			System.out.println(num);

			if (num == 6) {
				break; // 가장 가까운 반복문을 종료
			}
			count++; // break를 안만났을때만 세는거
		}
		System.out.println("게임종료 : 총 " + count + "회");

		for (int i = 1; i <= 10; i++) {
			System.out.println(i);

			// >= 으로 해놓으면 혹시 숫자를 건너뛰더라도 for문 종료가 됨
			if (i == 7) {
				break;
			}
			System.out.println("한 턴 종료");
		}
		System.out.println("for문 종료"); // 7나오면 break를 만나서 "한턴종료"가 안나오고 "for문 종료"가 나옴

		for (int i = 0; i < 5; i++) {
			System.out.println("i : " + i);

			for (int j = 0; j < 3; j++) {
				System.out.println("j : " + j);

				if (j >= 1) {
					break; // 안에있는게 break가 걸리고 1까지 찍히고 안나옴
				}
			}
			System.out.println();
		}

		for (int i = 0; i < 10; i++) {
			if (i % 2 != 0) {
				continue; // 이후 실행문은 무시
			}
			System.out.println("짝수? " + i);
		}

	}

}
