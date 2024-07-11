package sec01.exam04_dd;

public class DirectoryExam {

	public static void main(String[] args) {
		
//		new DirectoryExam();
//
//		Directory1 koreaEnglish = new Directory1();
//
//		String love1 = koreaEnglish.love("사랑");
//		System.out.println(love1);
//
//		System.out.println("-----------------");
//
//		Directory2 koreaJapan = new Directory2();
//
//		String love2 = koreaJapan.love("사랑");
//		System.out.println(love2);

		Directory1 dd = new Directory1();
		
		String result = dd.translate("사랑");
		System.out.println(result);
		
	}

}
