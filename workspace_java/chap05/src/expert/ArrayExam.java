package expert;

public class ArrayExam {

	public static void main(String[] args) {

		int max = 0;
		int[] array = { 1, 5, 3, 8, 2 };

		for (int i = 0; i < array.length; i++) {
			if (array[i] > max) { // 왜냐 0보다 1이크면 아 1이 크네 저장
				max = array[i];
			}
		}
		System.out.println(max);

	}

	// super는 생성자에서만
	// 부모한테 올라가서 해결해야함

}
