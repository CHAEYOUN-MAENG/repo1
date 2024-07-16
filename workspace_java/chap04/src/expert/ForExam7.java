package expert;

public class ForExam7 {

	public static void main(String[] args) {

		// 1부터 10까지 출력할꺼야
		// 1씩 증가하겠지?
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}

		System.out.println("---------------");

		for (int i = 1; i <= 9; i++) {
			System.out.print(i);
		}

		System.out.println();
		System.out.println("--------------");

		// 3개씩 출력이 될꺼야
		// 한줄 뛸꺼야

//		int p=1;
//		int i=3;

//		p = 1
//		p+i = 4
//		p+i+i = 7
//		p+i+i+i = 10

//		for (int i=1; i<=3; i++) {
//			System.out.print(i);
//		}
//		System.out.println();
//		
//		for (int i=4; i<=6; i++) {
//			System.out.print(i);
//		}
//		System.out.println();
//		
//		for (int i=7; i<=9; i++) {
//			System.out.print(i);
//		}
//		System.out.println();

		for (int i = 1; i <= 9; i++) {
			System.out.print(i);
			if (i % 3 == 0) {
				System.out.println();
			}
		}

		System.out.println("--------------");

		// 짝수만
		for (int i = 2; i <= 20; i += 2) {
			System.out.println(i);
		}

		// 짝수의 합
		System.out.println("--------------");
		int sum = 0;
		for (int i = 2; i <= 20; i += 2) {
//			System.out.println(i);
			sum += i;
		}
		System.out.println("sum :" + sum);

		// 짝수의 개수
		int count = 0;
		for (int i = 2; i <= 20; i += 2) {
			count++;
		}
		System.out.println("count :" + count);

		// if문 써서 풀기
		int p = 0;
		for (int i = 2; i <= 20; i++) {
			if (i % 2 == 0) {
//				p += i;
				p++;
			}
		}
		System.out.println("p:" + p);

	}

}
