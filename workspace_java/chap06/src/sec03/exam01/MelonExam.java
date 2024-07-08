package sec03.exam01;

public class MelonExam {

	public static void main(String[] args) {

		Melon melon1 = new Melon();

		String t1 = melon1.setTitle("보고싶다");
		System.out.println(t1);

		String s1 = melon1.setSinger("김범수");
		System.out.println(s1);

		System.out.println("==========");

		Melon melon2 = new Melon();

		String t2 = melon2.setTitle("Hype boy");
		System.out.println(t2);

		String s2 = melon2.setSinger("NewJeans");
		System.out.println(s2);
	}

}
