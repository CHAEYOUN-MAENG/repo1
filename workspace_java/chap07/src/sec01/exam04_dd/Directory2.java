package sec01.exam04_dd;

import java.util.ArrayList;

public class Directory2 {

//	@Override
//	String love(String a) {
//		System.out.println(a + "를 일본어로 변역하겠습니다");
//		return "愛";
//	}

	ArrayList ko_words = new ArrayList();
	ArrayList words = new ArrayList();

	Directory2() {
		// 한글 세팅도 자식이 해도 되겠다
		ko_words.add("사랑");
		ko_words.add("우정");
	}

	String translate(String word) {

		for (int i = 0; i < ko_words.size(); i++) {

			if (ko_words.get(i).equals(word)) {
				return (String) words.get(i);
			}

		}

		return "그런 단어는 모릅니다";
	}

}
