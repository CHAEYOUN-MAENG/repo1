package sec01.exam01;

import java.util.Scanner;

public class WhileExam {

	public static void main(String[] args) {
		
		int i = 1;
		while(i <= 10) {
			System.out.println(i);
			i++;
		}
		
		Scanner scan = new Scanner(System.in);
//		System.out.println("메뉴를 고르세요");
//		System.out.println("1: 커피, 2: 차, 3: 음료, 0: 종료");
//		int menu = scan.nextInt();
//		if ( menu == 1) {
//			System.out.println("커피를 드리겠습니다");
//		} else if (menu == 2 ) {
//			System.out.println("차를 드리겠습니다");
//		} else if (menu == 3 ) {
//			System.out.println("음료를 드리겠습니다");
//		} else if (menu == 0 ) {
//			System.out.println("다음에 또오세요");
//		}
//		
//		if (menu != 0) {
//			System.out.println("메뉴를 고르세요");
//			System.out.println("1: 커피, 2: 차, 3: 음료, 0: 종료");
//			menu = scan.nextInt();
//			if ( menu == 1) {
//				System.out.println("커피를 드리겠습니다");
//			} else if (menu == 2 ) {
//				System.out.println("차를 드리겠습니다");
//			} else if (menu == 3 ) {
//				System.out.println("음료를 드리겠습니다");
//			} else if (menu == 0 ) {
//				System.out.println("다음에 또오세요");
//			}
//			
//			if (menu != 0) {
//				System.out.println("메뉴를 고르세요");
//				System.out.println("1: 커피, 2: 차, 3: 음료, 0: 종료");
//				menu = scan.nextInt();
//				if ( menu == 1) {
//					System.out.println("커피를 드리겠습니다");
//				} else if (menu == 2 ) {
//					System.out.println("차를 드리겠습니다");
//				} else if (menu == 3 ) {
//					System.out.println("음료를 드리겠습니다");
//				} else if (menu == 0 ) {
//					System.out.println("다음에 또오세요");
//				}
//			
//			}
		
		
		int menu = -1; // 0이면 아예 while문에 진입이 안됨
		// 0이면 끝, 0이 아니면 while문 계속 반복
		while(menu != 0) {
			// 몇번 반복될지 모를 때, 적당하다.
			System.out.println("메뉴를 고르세요");
			System.out.println("1: 커피, 2: 차, 3: 음료, 0: 종료");
			menu = scan.nextInt();
			if ( menu >= 0 && menu <=3) {
				if (menu == 1) {
					System.out.println("커피를 드리겠습니다");
				} else if (menu == 2 ) {
					System.out.println("차를 드리겠습니다");
				} else if (menu == 3 ) {
					System.out.println("음료를 드리겠습니다");
				} else if (menu == 0 ) {
					System.out.println("다음에 또오세요");
				}
			} else {
				System.out.println("메뉴를 다시 선택해주세요");
			} // 방어 코딩
		}
		System.out.println("오늘은 영업 종료하겠습니다");
	
		
		// while문 안에 내용을 그 위에 한번 더 쓰는 경우
		
		int menu2;
		do {
			System.out.println("메뉴를 고르세요");
			System.out.println("1: 커피, 2: 차, 3: 음료, 0: 종료");
			
			menu2 = scan.nextInt();
			
			if ( menu >= 0 && menu <=3) {
				if (menu == 1) {
					System.out.println("커피를 드리겠습니다");
				} else if (menu == 2 ) {
					System.out.println("차를 드리겠습니다");
				} else if (menu == 3 ) {
					System.out.println("음료를 드리겠습니다");
				} else if (menu == 0 ) {
					System.out.println("다음에 또오세요");
				}
			} else {
				System.out.println("메뉴를 다시 선택해주세요");
			}
			
		} while (menu !=0);
		
	}

}

