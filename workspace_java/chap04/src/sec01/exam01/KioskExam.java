package sec01.exam01;

import java.util.Scanner;

public class KioskExam {

	public static void main(String[] args) {

		int i = 0; // 커피 선택 담는 변수
		int z = 0; // 커피 옵션 선택
		int h = 0; // 논커피 선택 담는 변수
		int y = 0; // 티 선택 담는 변수
		int p = 0; // 티 옵션 선택
		int u = 0; // 디저트 선택 담는 변수
		int total = 0; // 전체금액 담는 변수
		Scanner scan = new Scanner(System.in);
//		System.out.println("메뉴를 선택해주세요");
//		System.out.println("1.커피 2.논커피 3.티 4.디저트 5.종료");
//		int menu = scan.nextInt();
		while (true) {
			System.out.println("구매하실 메뉴를 선택해주세요");
			System.out.println("1.커피 2.논커피 3.티 4.디저트 5.종료");
			int menu = scan.nextInt();

			if (menu == 1) {
				System.out.println("아래의 메뉴를 추가로 선택해주세요");
				System.out.println("1.아메리카노 2.카페라떼 3.모카라떼 4.돌체라떼");
				i = scan.nextInt();
				int coffee = 0;

				if (i == 1) {
					coffee = 3500;
					System.out.println("아메리카노의 가격은 3500원입니다");
				} else if (i == 2) {
					coffee = 4000;
					System.out.println("카페라떼의 가격은 4000원입니다");
				} else if (i == 3) {
					coffee = 4500;
					System.out.println("모카라뗴의 가격은 4500원입니다");
				} else if (i == 4) {
					coffee = 5000;
					System.out.println("돌체라떼의 가격은 5000원입니다");
				} else {
					System.out.println("다시 선택해주세요");
					continue;
				}

				System.out.println("추가옵션을 선택해주세요");
				System.out.println("1.샷추가 2.ICE 3.HOT");
				
				z = scan.nextInt();

				if (z == 1) {
					coffee += 500;
					System.out.println("샷추가 비용 500원 발생하였습니다");
				} else if (z == 2 || z == 3) {
					System.out.println("추가비용 없습니다");
				}

				total += coffee;
				System.out.println("총 금액은 " + total + "원입니다");
//				break;

			} else if (menu == 2) {
				System.out.println("아래의 메뉴를 추가로 선택해주세요");
				System.out.println("1.블루베리스무디 2.딸기라떼 3.복숭아아이스티 4.토피넛라뗴");
				h = scan.nextInt();
				int nonecoffee = 0;

				if (h == 1) {
					nonecoffee = 6500;
					System.out.println("블루베리스무디의 가격은 6500원입니다");
				} else if (h == 2) {
					nonecoffee = 6000;
					System.out.println("딸기라떼의 가격은 6000원입니다");
				} else if (h == 3) {
					nonecoffee = 5000;
					System.out.println("복숭아아이스티의 가격은 5000원입니다");
				} else if (h == 4) {
					nonecoffee = 5500;
					System.out.println("토피넛라떼의 가격은 5500원입니다");
				} else {
					System.out.println("다시 선택해주세요");
					continue;
				}

				total += nonecoffee;
				System.out.println("총 금액은 " + total + "원입니다");
//				break;

			} else if (menu == 3) {
				System.out.println("아래의 메뉴를 추가로 선택해주세요");
				System.out.println("1.수제자몽티 2.히비스커스티 3.캐모마일티 4.쌍화차");
				y = scan.nextInt();
				int tea = 0;

				if (y == 1) {
					tea = 6000;
					System.out.println("수제자몽티의 가격은 6000원입니다");
				} else if (y == 2) {
					tea = 5500;
					System.out.println("히비스커스티의 가격은 5500원입니다");
				} else if (y == 3) {
					tea = 5000;
					System.out.println("캐모마일티의 가격은 5000원입니다");
				} else if (y == 4) {
					tea = 6500;
					System.out.println("쌍화차의 가격은 6500원입니다");

					System.out.println("추가 옵션을 선택해주세요");
					System.out.println("1.계란 2. 없음");

					p = scan.nextInt();

					if (p == 1) {
						tea += 1000;
						System.out.println("계란 추가 비용 1000원 발생했습니다");
					}

				} else {
					System.out.println("다시 선택해주세요");
					continue;
				}

				total += tea;
				System.out.println("총 금액은 " + total + "원입니다");
//				break;

			} else if (menu == 4) {
				System.out.println("아래의 메뉴를 추가로 선택해주세요");
				System.out.println("1.초코케이크 2.생크림케이크 3.레몬마들렌 4.소금빵");
				u = scan.nextInt();
				int dessert = 0;

				if (u <= 2) {
					dessert = 6500;
					System.out.println("가격은 6500원입니다");
				} else if (u == 3) {
					dessert = 4000;
					System.out.println("레몬마들렌의 가격은 4000원입니다");
				} else if (u == 4) {
					dessert = 3000;
					System.out.println("소금빵의 가격은 3000원입니다");
				} else {
					System.out.println("다시 선택해주세요");
					continue;
				}

				total += dessert;
				System.out.println("총 금액은 " + total + "원입니다");
//				break;

			} else if (menu == 5) {
				System.out.println("총 금액은 " + total + "원입니다");
				System.out.println("종료되었습니다");
				break;
				
			} else {
				System.out.println("다시 선택해주세요");
				continue;
			}

		}

	
	}

}
