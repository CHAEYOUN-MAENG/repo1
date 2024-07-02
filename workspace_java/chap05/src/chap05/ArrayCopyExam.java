package chap05;

public class ArrayCopyExam {

	public static void main(String[] args) {

		// 커피 1호점에서 판매하는 메뉴
		String[] coffee = new String[3];
		coffee[0] = "아이스 아메리카노";
		coffee[1] = "카페라떼";
		coffee[2] = "말차";

		// 커피 2호점에서 1호점과 똑같은 커피를 판매할꺼다
		/*
		 * 얕은복사 shallow copy, thin copy, call by reference stack 영역의 값만(주소) 만 족사 원본이 바뀌면
		 * 당연히 내 값도 바뀜 (원본에 있는 주소만 알고 있기 때문에)
		 */
//		String[] coffee2 = new String[3];
		String[] coffee2 = coffee;
		for (int i = 0; i < coffee2.length; i++) {
			System.out.println(coffee2[i]);
		}

		// 얕은 복사로 연결되어있기 때문에
		// coffee2를 바꿔도 원본인 coffee가 바뀜
		// 원본의 주소만 공유하고 있기 때문에 coffee나 coffee2는 같은 것(coffee=coffee2)
//		coffee2[1] = "연유라떼";
		for (int i = 0; i < coffee.length; i++) {
			System.out.println(coffee[i]);
		}

		// 크기와 내용을 동일한 새로운 배열을 만들겠다 (ex. 빽다방 천안점 말고 빽다방 불당점을 만들겠다)
		/*
		 * 깊은 복사 deep copy, deep clone, call by value heap 영역의 새로운 주소(자리)를 마련하고 Stack 영역
		 * 변수에 주소를 넣는다 그리고 원본의 값들을 복사해서 채워넣는다 그래서 원본과 동일한게 생기지만 값을 전혀 다른 주소를 가지게 된다 즉, 내
		 * 값을 바뀌어도 원본이 바뀌지 않음
		 */
		String[] coffee3 = new String[coffee.length];
//		coffee3[0] = "아이스 아메리카노"; 수동이니까 원본이 바뀌면 이것도 바꿔줘야하니까 아래처럼 작성
//		coffee3[0] = coffee[0];
		for (int i = 0; i < coffee3.length; i++) {
			coffee3[i] = coffee[i];
		}

		coffee3[2] = "아이스티";
		for (int i = 0; i < coffee3.length; i++) {
			System.out.println(coffee3[i]);
		}

		// 빽다방 천안점(원본)
		for (int i = 0; i < coffee.length; i++) {
			System.out.println(coffee[i]);
		}

		// coffee3에 "사라다빵"을 추가하려면?
//		coffee3 = new String []{"따아","카페라떼","말차","사라다빵"};
		
		// coffee3의 크기보다 하나 큰 배열을 만들어서 0~2번지까지는 동일, 3번지는 추가
		String[] coffee4 = new String[coffee3.length+1];
		for (int i = 0; i < coffee3.length; i++) {
			coffee4[i] = coffee3[i];
			coffee4[3] = "사라다빵";
		}

		for (int i = 0; i < 4; i++) {
			System.out.println(coffee4[i]);
		}
		
		
		System.out.println("------------------");
		// 향상된 for문
		System.out.println("향상된 for문");
		for( String menu : coffee4) {
			System.out.println(menu);
		}
		
		// 모든 자식 배열의 크기가 같게 선언할 수 밖에 없음
		int[][] a2 = new int[10][100];
		
		
		

	}

}
