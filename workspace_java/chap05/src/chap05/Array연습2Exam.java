package chap05;

public class Array연습2Exam {

	public static void main(String[] args) {

		// {1, 5, 2, 4}
		// 1. 배열 뒤집기 : {4, 2, 5, 1}
		int[] array = new int[4];
		array[0] = 1;
		array[1] = 5;
		array[2] = 2;
		array[3] = 4;

		// array1[0]=array[3]
		// array1[1]=array[2]
		// array1[2]=array[1]
		// array1[3]=array[0]
		int[] array1 = new int[array.length];
		for (int i = 0, j = 3; i < array1.length; i++, j--) {
			array1[i] = array[j];
			System.out.println(array1[i]);
		}

		System.out.println();

		// 2. 첫번째 자리에 0 넣기 : {0, 1, 5, 2, 4}
		int[] zero = { 1, 5, 2, 4 };
		// zero[0] = 1;
		// zero[1] = 5;
		// zero[2] = 2;
		// zero[3] = 4;

		// int[] zero1 = new int[5];
		// zero1[0] = 0;
		// zero1[1] = zero[0];
		// zero1[2] = zero[1];
		// zero1[3] = zero[2];
		// zero1[4] = zero[3];
		int[] zero1 = new int[zero.length + 1];
		zero1[0] = 0;
		for (int z = 1; z < zero1.length; z++) {
			zero1[z] = zero[z - 1];
		}
		for (int z = 0; z < zero1.length; z++) {
			System.out.println(zero1[z]);
		}

		System.out.println();

		// 3. 마지막 숫자를 첫번째에 넣기(회전하는 느낌) : {1, 5, 2, 4}
		// (원형큐 Circular Queue)
		int[] rep = { 1, 5, 2, 4 };

		// rep[0]= 1;
		// rep[1]= 5;
		// rep[2]= 2;
		// rep[3]= 4;

		int[] rep1 = new int[rep.length];
		// rep1[0] = rep[3];
		// rep1[1] = rep[0];
		// rep1[2] = rep[1];
		// rep1[3] = rep[2];
		rep1[0] = rep[3];
		for (int g = 1; g < rep1.length; g++) {
			rep1[g] = rep[g - 1];
		}
		for (int g = 0; g < rep1.length; g++) {
			System.out.println(rep1[g]);
		}

		System.out.println();

		// {3, 4, 7, 5, 1, 4, 6, 4, 7}
		// 4. 홀/짝수의 각각 개수를 출력
		int[] contain = { 3, 4, 7, 5, 1, 4, 6, 4, 7 };

		int one = 0;
		int two = 0;

		for (int k = 0; k < contain.length; k++) {
			if (k % 2 == 1) {
				one++;
			} else if (k % 2 == 0) {
				two++;
			}
		}
		System.out.println("홀수 : " + one + "개");
		System.out.println("짝수 : " + two + "개");
		
		System.out.println();

		// 5. 주어진 수(예를 들어 4)보다 큰 숫자의 개수
		int[] big = { 3, 4, 7, 5, 1, 4, 6, 4, 7};
		//            0, 1, 2, 3, 4, 5, 6, 7, 8			  	

		int four = 0;

		for (int p = 0; p < big.length; p++) {
			if (big[p] > 4) {
				four++;
//				System.out.println("O : "+ p);
			} else if (big[p] <= 4) {
				System.out.println("X(인덱스) : "+ p);
				System.out.println("X(배열요소값) : "+ big[p]);
			}
		}
		System.out.println("주어진 수보다 큰 숫자의 개수 : "+ four +"개");
		
		// 6. 두번째 최대값
		
		System.out.println();
		
		// 7. 내림차순으로 정렬(큰 수부터 작은 수 순으로)
		
		
		
		// 로또 6개 번호(1~45)
		// 8. 중복되지 않게 숫자 선정

		// 9. 자리 예약
		// 자리가 10개인 소극장 예약 시스템을 만들자
		// 1번부터 10번(0~9)까지 번호의 자리가 있음 (예약할 자리는? 하고 입력받음)
		// 9-1. 예약이 가능하면 "예약했습니다"
		// 9-2. 예약 불가능하면 "이미 예약 되어있습니다"
		// 9-3. 모든 자리의 예약 가능 여부 출력
		// 9-4. 예약 가능한 자리만 출력

		// 10. 임시 비밀번호 8자리 만들기
		// 10-1. 모두 다 숫자로
		// 10-2. 모두 다 소문자로(힌트: char ascii)
		// 10-3. 솟자 2개 이상, 대문자 1개 이상, 소문자 1개 이상 조합

	}

}
