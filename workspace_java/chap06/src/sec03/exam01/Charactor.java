package sec03.exam01;

public class Charactor {

	// 체력 100에서 시작
	// 방어력: 특정 범위 안에서 random
	// 메소드
	// attack (% 또는 수치)
	// heal (% 또는 수치)
	//
	// 내성이 있어서 회복 수치가 점점 줄어들 수도 있다
	// 남은 체력을 출력
	// defence : 방어력을 제외한 상대의 attack 수치를 체력에서 깎음
	//
	// 체력이 0 이하가 되면 "사망" 출력
	//
	// main에서 두 캐릭터를 생성해서 서로 싸워라!

	private String name; // 캐릭터 이름
	private int hp; // 체력
	private int def; // 방어력

	Charactor(String name) {
		this.name = name;
		this.hp = 100;
		this.def = (int) (Math.random() * 5) + 3;
	}

	/**
	 * attack : 내가 공격할 수치를 돌려줌
	 * 
	 * @param 없음
	 * @return int 공격수치
	 */

	int attack() {
		int damage = 10 + (int) (Math.random() * 5); // 10 ~ 14
		System.out.println(this.name + "이(가)" + damage + "만큼 공격합니다 ");
		return damage;
	}

	/**
	 * hit : 내가 맞아서 체력이 줄어듬
	 * 
	 * @param int 공격당한 수치
	 * @return boolean 살아있는지 여부
	 */

	boolean hit(int damage) {
		System.out.println(this.name + "이(가)" + (damage - def) + "만큼 공격을 받았습니다");
		boolean isAlive = true;
		hp -= (damage - def); // 체력 - 공격받은 수치에서 방어력을 제외한 체력
		getHp(); // 남은 체력을 출력하는 기능이 있기 때문에
		if (hp <= 0) {
			System.out.println(this.name + "이가 죽었습니다");
			isAlive = false;
		}
		return isAlive;
	}

	/**
	 * heal : hp를 일정량 회복
	 * 
	 * @param 없음
	 * @return int hp
	 */

	int heal() {
		int heal = 5 + (int) (Math.random() * 5);
		System.out.println(this.name + "이(가)" + heal + "만큼 회복됬습니다");
		this.hp += heal;
		getHp(); // 남은 체력을 출력하는 기능이 있기 때문에
		return this.hp;
	}

	int getHp() {
		System.out.println(this.name + "의 현재 체력은" + this.hp + "입니다");
		return this.hp;
	}

}
