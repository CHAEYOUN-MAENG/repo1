package sec01.exam01;

import java.util.Scanner;

public class TypeCastingExam {

	public static void main(String[] args) {

		int a = 2 + (2 * 2);
		long b = (long) a; // 형 변환 연산자 괄호, int인 a를 long 타입으로 바꿔라
							// long이 long 타입에 들어가는건 문제가 되지 않는다

		long c = a; // 작은거에서 큰걸로 바뀔 때에는 손실이 없으므로
					// 형 변환을 생략할 수 있다
					// 자동 형변환
					// 묵시적, 암시적 형변환 (암묵적으로 누구나 다 알 수 있게)

		System.out.println("c :" + c);

		a = (int) c; // 큰거에서 작은거로 바뀔때는 손실이 있을 수 있다
						// 형변환을 생략할 수 없다
						// 명시적 형변환 (눈에 보이듯이 명확하게)

		long d = 3000000000L;
		int a2 = (int) d;
		System.out.println("a2 :" + a2);

		double d2 = 3.14;
		int i = (int) d2;
		System.out.println("i :" + i);
		// double 이나 float은 int로 변환하면 소숫점을 떼고 출력한다
		// 예측 할 수 있어서 이러한 속성을 많이 쓴다

//		int result = (double)43;
//		int와 int를 계산하면 소숫점을 때고 출력
//		double result = (double)43;
		double result = 43;
		int count = 10;
		System.out.println("(double)count :" + (double) count);
		System.out.println(result / (double) count);
		System.out.println(result / count);

//		double과 int 연산할 때 int가 double로 자동 형 변환되서 연산됨 (낮은게 높은 걸로 바뀌어서 출력)
//		int count = (double)43; -> double 이 생략

		int i2 = 2100000000;
		int i3 = i2 * 2;
		System.out.println("i3 :" + i3);
//		결과값이 int의 범위를 벗어나므로 다른 값이 출력됨 (overflow됨)
//		int끼리 연산해서 자바는 문제 없다고 판단하여 실행 하지만 (윗내용)

		System.out.println(3 + "문자");
		System.out.println(3 + 4 + "문자");
		System.out.println("" + 1 + 300 + "px");
		System.out.println("" + (1 + 300) + "px");
		System.out.println("--------------hr---------------");
		System.out.print("첫번째줄");
		System.out.print("두번째줄");
		// \n을 자동으로 출력해주는 속성
		System.out.print("i3의 값은");
		System.out.print("100이다");
		
		System.out.println(); //한줄 띄고(br)
		System.out.println("--------------hr---------------");

		System.out.printf("i3의 값은 : %d", i3);
		System.out.println();
		System.out.printf("i2의 값은 : " + i2 + ", i3 : " + i3);
//		System.out.printf("i2의 값은 : %d", "i3 : %d", i2, i3);
		
		System.out.println();//br
		System.out.println("-----------------------------");
		
		System.out.println("아무거나 입력하세요");
		Scanner scan = new Scanner(System.in); // 입력 받으려고 준비
		String input = scan.nextLine();
		System.out.println("input :" + input);
		
		

	}

}
