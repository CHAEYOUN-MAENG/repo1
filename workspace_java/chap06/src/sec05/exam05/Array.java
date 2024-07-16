package sec05.exam05;

public class Array {
	
	// super는 생성자에서만
	// 부모한테 올라가서 해결해야함

	final int length;
	int[] arr;

	// 생성자 를 통해 딱 한번만 바꿀 수 있음
	Array(int length) {
		this.length = length;
		arr = new int[this.length];
	}

	int get(int index) {
		return arr[index];
	}

}
