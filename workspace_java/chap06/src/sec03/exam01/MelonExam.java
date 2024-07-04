package sec03.exam01;

public class MelonExam {

	public static void main(String[] args) {

		Melon melon1 = new Melon();
		Melon melon2 = new Melon();
		Melon melon3 = new Melon();
		melon1.setTitle("보고싶다");
		melon2.setTitle("초연");
		melon3.setTitle("자극점");

		//
		System.out.println("==========");
		melon1.print();
		melon2.print();

	}

}
