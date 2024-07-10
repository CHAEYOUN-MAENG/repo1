package sec03.exam01;

public class CharactorExam {

	public static void main(String[] args) {

		Charactor hong = new Charactor("홍길동");
		Charactor lee = new Charactor("이순신장군");

//		int dam = hong.attack(); 홍길동의 공격
//		boolean isAlive = lee.hit(dam); 이순신의 체력

//		boolean isAlive = lee.hit(hong.attack());
//		if (isAlive) {
//			lee.hit(hong.attack());
//		}

		boolean isAlive_hong = true, isAlive_lee = true;

		while (isAlive_hong && isAlive_lee) {
			isAlive_hong = hong.hit(lee.attack());
			if (isAlive_hong) {
				isAlive_lee = lee.hit(hong.attack());
			}
		}

	}

}
