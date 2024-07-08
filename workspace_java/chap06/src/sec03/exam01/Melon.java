package sec03.exam01;

public class Melon {

	String title;
	String singer;
	String genre;
	String lyrics;
	int song;

	String setTitle(String a) {
		title = a;
		return title;
	}

	String setSinger(String b) {
		singer = b;
		return singer;
	}

//	// 하나의 메소드에 담아서 호출해보자
//	
//	void print1() {
//		title = "보고싶다";
//		System.out.println("title : " + title);
//		singer = "김범수";
//		System.out.println("singer : " + singer);
//		genre = "발라드";
//		System.out.println("genre : " + genre);
//		lyrics = "미칠듯 사랑했던 기억이";
//		System.out.println("lyrics : " + lyrics);
//		song = 4;
//		System.out.println("song : " + song + "분");
//	}

}
