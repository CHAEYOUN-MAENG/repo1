package sec01.exam01;

public class VarExam {

	public static void main(String[] args) {

		/*
		 * 변수 명을 정하는 규칙
		 * 
		 * 1. 숫자로 시작하면 안됨 
		 * 2. 예약어 사용 금지 (int, double)
		 * 3. 특수문자는 _, $만 사용할 수 있음 (ex. int_a;, int my_name, int $a;)
		 * 4. 소문자로 시작하는게 좋다
		 */
		

		// 변수 선언: 자료의 종류(Type) 한칸띄고 이름표
		int score; // 선언부
		score = 90; // 할당, 값을 넣기

//		int value;
//		value = 30;
		int value = 30; // 선언과 동시에 초기화

		value = 31; // 값 변경 : 그래서 "변"수

//		score + value -> 90 + 31
//		value = score + value;
//		
		int value2 = score + value;

//		int val;
//		int val2 = val + 10; 
//		선언후에 값을 넣지 않으면 변수를 사용하지 못한다
//		int val; 같은 이름의 변수를 선언할 수 없다

		System.out.println(value2);

		int val1 = 10;
		int val2 = 20;

		System.out.println("val1 : " + val1);
		System.out.println("val2 : " + val2);

		int x = 10;
		int y = x;

		int x1;
		int x2;
		int x3;
		int y1, y2, y3;

		int j = 1;
		{ // 변수는 자손 중괄호 {}에도 영향을 미친다
			// int j = 2; 못쓴다 왜냐하면 위에 j가 살아있기 때문에
			System.out.println(j);
		}
		{
			// 변수는 선언된 중괄호 {}이 끝나면 사라진다
			int i = 0;
		}
		// 위의 i는 사라졌기 때문에 또 i로 선언할 수 있다.
		int i = 1;

	}

}
