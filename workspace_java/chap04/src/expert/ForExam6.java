package expert;

import java.util.Scanner;

public class ForExam6 {

	public static void main(String[] args) {

		// 1부터 1씩 증가한 수를 곱할꺼야
		// 근데 입력한 값이 만약 20이라면
		// 1부터 1씩 증가한 수의 곱에서
		// 20을 넘게한 마지막 수를 출력하게 할꺼야

		// 자 입력값이 20이라고 가정하면
		// 1*2*3*4 = 24이지?
		// 그럼 20을 넘게한 마지막 곱한 수 4를 출력하게 하는거야

		// 입력값이 100인 경우
		// 1*2*3*4*5 = 120이지?
		// 그럼 100을 넘게한 마지막 곱한 수는 5가 되는거야

		// 자 숫자 입력값을 받아 20
		// 자 1부터 1씩 증가된 수를 순차적으로 곱할꺼야 -> 반복문을 통해서

		// 근데 여기서 몇번을 곱하면 | 입력한수보다 바로 넘긴 수까지
		// 곱한 횟수를 변수 b라고 해볼께 4
		// 입력한 수보다 바로 넘긴 수를 c라고 해볼께 24

		// a < c -> b가 출력되는거야
		// 우리는 b를 찾아야해

		// 곱할 수 있을까?

		Scanner scan = new Scanner(System.in);
		int sc = scan.nextInt();

		int p = 1;

		for (int i = 1; i <= sc; i++) {
			p *= i;
//			System.out.println("i : " + i); // 곱하기한 수
			if (sc <= p) {
				System.out.println("정답 : " + i);
				break;
			}
		}
		System.out.println("전체 곱한값 : " + p); // 그 곱한 값이야

		// 20 입력값이
		// 24 곱한 결과값보다
		// 20 <= 24 이때만 출력이 되야됨

		// 출력이 되면 딱 한번만 출력하고
		// 그 뒤로 break를 사용해서 반복이 안되서 출력이 안되도록

		// 반복을 그만두게 해보자

		// 입력값을 받아 20
		// 1*2*3*4 24
		// 입력값이 증가된 수보다 작으면
		// 1씩 증가된 수 중에 제일 큰 수가 출력돼

		// 50
		// 1*2*3*4*5 120
		// 입력값이 증가된 수보다 작으면
		// 5가 출력돼

		// 1*2 = 2
		// 2(1*2)*3 = 6
		// 6(2*3)*4 = 24
		// 24(6*4)*5 = 120
		// 120(24*5)*6 = 720

	}

}
