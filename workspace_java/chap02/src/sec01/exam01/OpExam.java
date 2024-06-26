package sec01.exam01;

public class OpExam {

	public static void main(String[] args) {

		int a = 10;
//		a = 10 + 1;
		int b = a + 1;

		// a = 10 + 1
		a = a + 1;
		a += 1; // a에다가 1을 더해서 다시 a에다가 넣어줘
		a++; // a += 1과 같다 (더하기 1일 경우에만 가능)
		++a;

		a = 10;
		a++;
		System.out.println("a :" + a);

		a = a - 2;
		a -= 2; // a에다가 2를 빼서 다시 a에다가 넣어줘

		a -= 1;
		a--; // a -= 1과 같다 (빼기 1일 경우에만 가능)
		--a;

		a = 10;
		a--;
		System.out.println("a :" + a);
		// 현재 a가 9인 상태

		System.out.println("++a :" + ++a); // 출력 : 10
		System.out.println("++a :" + a++); // 출력 : 10
		System.out.println("a :" + a); // 출력 : 11
		// 현재 a가 11

		System.out.println(a++ + ++a);
		// 11 + (a가 12가 된 상태)에다가 1 더하기

		a = 11;
		int result = a; // a
		a = a + 1; // a 다음에 오는 ++
		a = a + 1; // 두번째 a 앞에 오는 ++
		result = result + a;
		System.out.println(result);

		boolean c = true;
		System.out.println("c :" + c);
		c = !c;
		System.out.println("c :" + c);

		double d = 7.0;
		// int d = (int) 7.0; 형 변환을 해줘야함
		System.out.println(d / 3);
//		System.out.println(d / 0); // 0을 주의하자 나눠줄 사람이 없는데 계속 나눠줘라 하면 못나눠줌..
		// double -> infinity, int -> by zero

		int f = 14;
		int p = 5; // 나머지는 0부터 4까지 (숫자안에 가둬버린다)
		System.out.println("몫 :" + (f / p));
		System.out.println("나머지 :" + (f % p));

		int money = 10000;
		int coffee = 4500;
		int count = money / coffee;
		System.out.println(count + "잔");
		int change = money % coffee;
		System.out.println("잔돈 :" + change);

//		int tea = 5000;
//		double dis = 5000 * 0.15;
//		double last = 5000 - (5000 *  0.15);
//		System.out.println(last);

		double percent = 0.15;
		int tea = 5000;
		double discount = tea * percent;
		System.out.println("할인 받을 금액 :" + discount);
		double pay = tea - discount;
		System.out.println("내야하는 돈 :" + pay);

		/*
		 * string left = "수박" string right = "멜론" 단, left = "멜론" 금지
		 * 
		 * 출력 값이 반대가 되야함 left = 멜론, right = 수박
		 */
		
		String left = "수박";
		String right = "멜론";
		
		String table = left;
		left = right;
		right = table;
		
		System.out.println("left : "+ left);
		System.out.println("right : "+ right);
		
		// swap 푸는 문제 방법
		

		System.out.println();
//		전체 7234
		int total = 7234;

		// 5000원이 몇개가 필요한지
		int t1 = total / 5000;
		System.out.println(t1);

		int total1 = total - (t1 * 5000);
		System.out.println(total1);

		// total1 값에서 1000이 몇장 필요한지
		int t2 = total1 / 1000;
		System.out.println(t2);

		int total2 = total1 - (t2 * 1000);
		System.out.println(total2);

		// total2 값에서 500이 몇개 필요한지
		int t3 = total2 / 500;
		System.out.println(t3);

		// total2 값에서 100원이 몇개 필요한지
		int t4 = total2 / 100;
		System.out.println(t4);

		int total3 = total2 - (t4 * 100);
		System.out.println(total3);

		// total3 값에서 10원이 몇개 필요한지
		int t5 = total3 / 10;
		System.out.println(t5);

		int total4 = total3 - (t5 * 10);
		System.out.println(total4);

		int t6 = total4 / 1;
		System.out.println(t6);

		int total5 = total4 - (t6 * 1);
		System.out.println(total5);

	}

}
