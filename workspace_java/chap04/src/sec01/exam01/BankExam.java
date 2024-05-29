package sec01.exam01;

import java.util.Scanner;

public class BankExam {

	public static void main(String[] args) {

		// 은행 계좌의 잔고 관리 시스템
		// 1. 입금, 2. 출금, 3. 조회, 4. 종료
		// 입금 : 잔고에 더하기
		//			* 0, 음수는 실행되지 않게 - 금액을 확인하세요
		// 출금 : 잔고에서 빼기
		//			* 잔액보다 큰 금액은 실행되지 않게 - 잔고가 부족합니다
		// 조회 : 잔고출력
		// 종료 : 종료
		
		Scanner scan = new Scanner(System.in);
//		System.out.println("입금 잔액을 입력하세요");
		int money = scan.nextInt();
		while(money != 4) {
				if (money == 1) {
					System.out.println("입금금액을 입력해주세요");
					int i = scan.nextInt();
					System.out.println("입금금액 : "+ i);
					break;
				}
			}
		System.out.println("종료");

		
		System.out.println();
		
		
	}

}
