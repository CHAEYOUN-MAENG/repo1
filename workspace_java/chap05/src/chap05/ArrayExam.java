package chap05;

import java.util.ArrayList;

public class ArrayExam {

	public static void main(String[] args) {

//		int a = null; -> 기본타입에는 null을 넣을 수 없음

		// 배열
		// 한번에 여러 변수를 만드는 방법
		// 같은 타입만 선언할 수 있음
		// 생성된 여러 변수들은 index로 관리할 수 있다. (ex. 책 쪽수)

		// 선언 방법
		int[] score; // int로 이루어진 배열이다 java style
		int score2[]; // c style

		score = null;

		int[] score3 = null;

		int score_0 = 90;
		int score_1 = 80;
		int score_2 = 70;

		// 배열을 생성할 때 크기를 알려줘야 한다.
		// 첫번째 [] : int[]는 배열인데 int로 이루어진 배열이다
		// 두번째 [3] : 배열의 크기; 한번에 만들 변수의 개수
		// 연달아서 타입의 크기만큼 메모리 할당 (ex. 자리 3자리 있으니까 오세요!)
		// 첫번째 변수부터 index 0으로 시작
		// 세번째 [0] : 만들어진 변수들 중 첫번째 변수를 뜻함 (ex. index 0/1/2자리가 있는데 0은 첫번째니까)
		int[] intArray = new int[3]; // ex. 3명 예약을 했고(3명의 자리를 미리 만듬), 예약자명이 intArray이다
		intArray[0] = 90;
		intArray[1] = 80;
//		intArray[2] = 70;

		System.out.println("intArray : " + intArray[1]);
		// 기본값은 0 또는 false(boolean)으로 초기화 된다 즉, 사용이 가능하다
		System.out.println("intArray : " + intArray[2]);
//		System.out.println("intArray : " + intArray[3]);

		// 배열의 모든값을 1로 바꾼다
		intArray[0] = 1;
		intArray[1] = 1;
		intArray[2] = 1;
		int a = 1;
		a++;
		intArray[a] = 1;

		// for(int i=0 ; i<=3-1 ; i++)
		for (int i = 0; i < 3; i++) {
			intArray[i] = 1;
		}
		for (int i = 0; i < 3; i++) {
			System.out.println(intArray[1]);
		}

		System.out.println(intArray); // 출력결과 [I@6c49835d 깨진 것처럼 보이지만 깨진 건 아님(메모리주소기반)
		System.out.println(intArray.length); // 배열의 크기
		// 한번 선언된 배열의 크기는 바꿀 수 없다
		// intArray.length = 4;

		// 배열을 선언하는 두번째 방법
		// 값을 미리 알고 있을때
		// 크기는 알아서 계산된다
		int[] intArray2 = new int[] { 10, 20, 30, 40 };
		for (int i = 0; i < intArray2.length; i++) {
			System.out.println(intArray2[i]);
		}

		// 세번째 방법
		int[] intArray3 = { 100, 200, 300, 400 };
		for (int i = 0; i < intArray2.length; i++) {
			System.out.println(intArray3[i]);
		}

		String[] strArray = new String[5];
		for (int i = 0; i < strArray.length; i++) {
			strArray[i] = "맹채윤" + (i + 1);
		}

		for (int i = 0; i < strArray.length; i++) {
			System.out.println(strArray[i]);
		}
		// 배열은 따로 빼서 출력을 하는 것이 좋다

		// 1 ~ 10까지 배열에 넣고
		// 배열의 총 합을 출력
		// 배열의 평균값 출력
		int[] score5 = new int[10];
		for (int i = 0; i < score5.length; i++) {
			score5[i] = i + 1;
		}

		int sum = 0;
		for (int i = 0; i < score5.length; i++) {
			sum += score5[i];
		}
		System.out.println("총합 : " + sum);

		double avg = (double) sum / score5.length;
		System.out.println("평균 : " + avg);

		System.out.println();
		System.out.println("-------------");

		int student1 = 90;
		int student2 = 85;
		// 22개를 담을 수 있는 변수를 만들어 달라

		int[] class1 = new int[22];
		int[] class2 = new int[22];
		int[] class3 = new int[22];
		int[] class4 = new int[22];

		// 맨뒤에 []는 배열을 뜻하고 그 앞에 있는 모든건 배열의 내용물을 뜻함
		// int[]을 변수로 관리하는 배열이 된다는 뜻
		// [4]는 "천안"의 크기 즉, "천안"으로 관리되는 변수의 개수
		int[][] 천안 = new int[4][22];

		System.out.println(천안); // [[I@67205a84
		System.out.println(천안[0]); // [I@7d0587f1
		System.out.println(천안[0][0]); // 0

		int[] 클래스1 = 천안[0];
//		int 학생1 = 클래스1[0];
		int 학생1 = 천안[0][0];

		int[][] test = new int[3][2];
		int[][] test2 = { { 5, 6 }, { 23, 54 }, { 56, 34 } };

		int[][] 수원 = new int[4][22];
		int[][] 서울 = new int[4][22];

		int[][][] 휴먼 = new int[3][4][22];
		System.out.println(휴먼); // [[[I@16f65612 -> 스택(stack) 영역의 주소값

		System.out.println("휴먼.length: " + 휴먼.length);
		System.out.println("휴먼[0].length: " + 휴먼[0].length);
		System.out.println("휴먼[0][0].length: " + 휴먼[0][0].length);

		int[][] 달력 = new int[12][31];
		for (int i = 0; i < 달력.length; i++) {
			for (int j = 0; j < 달력[i].length; j++) {
				System.out.println("i :" + i + "j :" + j + "달력[i] : " + 달력[i]);
			}
		}

		// list
		ArrayList list = new ArrayList();
		list.add(1); // 0번방
		list.add("문자"); // 1번방
		list.add(true); // 2번방

		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));

		// 배열의 length
		System.out.println(list.size());
		System.out.println(1);

		String[] study = { "박규태", "이제섭", "김아영", "박경민", "정근승", "현준수", "남현우", "김승환", "조민정", "이정은" };
		System.out.println("총 : " + study.length);

		// 배열에서 random 으로 뽑기
//		double rand = Math.random() * study.length;
//		// 0 ~ 9.9999
//		int index = (int) rand; // 0 ~ 9
//		System.out.println(study[index]);

		/*
		 * 랜덤으로 100번 뽑아서 가장 많이 나온 사람을 선택
		 */

		// 이부분 이해 다시하기
		int[] vote = new int[study.length];
		for (int i = 0; i < 1000; i++) {
			double rand = Math.random() * study.length;
			int index = (int) rand; // 0 ~ 9

			vote[index] += 1; // ..?
		}

		for (int i = 0; i < vote.length; i++) {
			System.out.println("index :" + i + " 득표수" + vote[i]);
		}
		for (int i = 0; i < study.length; i++) {
			System.out.println("index :" + i + " 이름 :" + study[i]);
		}

		// 6개의 lotto 번호를 저장하고 싶다
		int[] lotto = new int[6];
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = (int) (Math.random() * 45) + 1;
		}

		for (int i = 0; i < lotto.length; i++) {
			System.out.println(i + "번호 : " + lotto[i]);
		}

	}

}
