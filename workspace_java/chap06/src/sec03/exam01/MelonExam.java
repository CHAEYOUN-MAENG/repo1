package sec03.exam01;

import java.util.ArrayList;

public class MelonExam {

	public static void main(String[] args) {

		ArrayList list = new ArrayList();

		Melon melon1 = new Melon();

		melon1.setTitle("supernova");
		String title = melon1.getTitle();
		System.out.println(title);
		melon1.setSinger("aespa");
		melon1.setGenre("k-pop");
		melon1.setLyrics("Su su su Supernova");
		melon1.setDuration(3);
		System.out.println(melon1.toString());
		list.add(melon1);

		System.out.println("----------------");

		Melon melon2 = new Melon();

		melon2.setTitle("괜찮아요");
		melon2.setSinger("BTOB");
		melon2.setGenre("k-pop");
		melon2.setLyrics("어깨가 무겁나요");
		melon2.setDuration(350);
		System.out.println(melon2.toString());
		list.add(melon2);

		Melon melon3 = (Melon) list.get(0);

//		String t1 = melon1.setTitle("보고싶다");
//		System.out.println(t1);
//
//		String s1 = melon1.setSinger("김범수");
//		System.out.println(s1);
//
//		System.out.println("==========");
//
//		Melon melon2 = new Melon();
//
//		String t2 = melon2.setTitle("Hype boy");
//		System.out.println(t2);
//
//		String s2 = melon2.setSinger("NewJeans");
//		System.out.println(s2);
	}

}
