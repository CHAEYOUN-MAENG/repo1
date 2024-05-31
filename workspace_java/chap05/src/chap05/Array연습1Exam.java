package chap05;

public class Array연습1Exam {

	public static void main(String[] args) {

		int[][] array = { { 95, 86 }, { 83, 92, 96 }, { 78, 83, 93, 87, 88 } }; // int[i][f] array = new int [3][10]

		// 모두출력
		int[] array1 = array[0];
		System.out.println(array[0][0]);
		System.out.println(array[1][0]);

		for (int i = 0; i < array.length; i++) {
			for (int f = 0; f < array[i].length; f++) {
				System.out.println(array[i][f]);
			}
		}

		// 합계출력
		int sum = 0;
		int count = 0;
		for (int i = 0; i < array.length; i++) {
			for (int f = 0; f < array[i].length; f++) {
				sum = sum + array[i][f];
				count++; // 더할때마다 개수세기
			}
		}
		System.out.println("총합 : " + sum);

		// 개수세기
		System.out.println("개수 : " + count); // 위에 참고

		count = 0;
		for (int f = 0; f < array.length; f++) {
			count = count + array[f].length;
		}
		System.out.println("개수 : " + count);

		// 평균 출력
		System.out.println("평균 : " + sum / count);
		System.out.println("평균 : " + (double) sum / count);

		// 주어진 배열에서 최대값 찾기
		// 전략 : 배열의 첫번째 값부터 혹은 절대 나올 수 없는 최저치를 기준으로
		// 기준과 비교해서
		// 큰 값을 새로운 기준으로 정한다
		// 그렇게 살아 남은 값이 최대 값이다

		int[] abc = { 1, 5, 3, 8, 2 };
		int max = Integer.MIN_VALUE; // int가 가질 수 있는 최소값, 최대값은 MAX_VALUE;

		for (int z = 0; z < abc.length; z++) {
			if (abc[z] > max) {
				max = abc[z];
			}
		}
		System.out.println("최댓값 : " + max);

	}

}
