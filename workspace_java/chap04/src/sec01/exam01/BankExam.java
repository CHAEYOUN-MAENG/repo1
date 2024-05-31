package sec01.exam01;

import java.util.Scanner;

public class BankExam {
 
	public static void main(String[] args) {

		// 은행 계좌의 잔고 관리 시스템
		// 1. 입금, 2. 출금, 3. 조회, 4. 종료
		// 입금 : 잔고에 더하기
		// * 0, 음수는 실행되지 않게 - 금액을 확인하세요
		// 출금 : 잔고에서 빼기
		// * 잔액보다 큰 금액은 실행되지 않게 - 잔고가 부족합니다
		// 조회 : 잔고출력
		// 종료 : 종료
		
		int i = 0;
		int b = 0;
		int c = 0; // 잔액
		int money = 1;
		Scanner scan = new Scanner(System.in);
		System.out.println("선택하세요");
		System.out.println("1. 입금, 2. 출금, 3. 조회, 4. 종료");
//		int money = scan.nextInt();
		while (money >=1 && money <=3) {			
			money = scan.nextInt();
			if (money == 1) {
				System.out.println("입금금액을 입력해주세요");
				i = scan.nextInt();
				System.out.println("입금금액 : " + i);
			} 
			if (money == 2) {
				System.out.println("출금금액을 입력해주세요");
				b = scan.nextInt();
				System.out.println("출금금액 : " + b);
//				System.out.println("남은잔액 : " + (i-b));
			}
			if (money == 3) {
				System.out.println("잔액을 조회하겠습니다");
//				b = scan.nextInt();
				System.out.println("잔액조회 : " + (i-b));
			}
			
		}
		System.out.println("종료");
	}

}
