package sec04.exam05;

// 은행계좌
public class Bank {

	// 은행 계좌 개설
	String bankName;
	long money = 0;
	boolean isDebug = false; // true 일 경우, 다 출력됨

	Bank(String bankName) {
		this.bankName = bankName;
		System.out.println("은행이름 : " + this.bankName);
	}

	// 메소드
	// 입금 : 단 음수 입력 막기
	// 출금 : 단 음수, 잔액보다 큰 수 출금 막기
	// 확인 : 잔액 출력

	// 입금 메소드 생성
	// 기존의 잔액에 입금액을 더하기
	// 전달인자가 음수인 경우 더하지 않는다
	/**
	 * @param int 입금액
	 * @return void
	 */

	void income(long money) {
		System.out.println("받은돈 : " + money);
		if (money > 0) { // 전달인자가 음수인경우 더하지 않는다(조건)
			this.money += money; // 기존 잔액에 입금액 더하기
		}
	}

	/**
	 * 출금 메소드 생성 기본의 잔액에 출금액을 빼기 
	 * 단, 전달인자가 음수 또는 잔액보다 큰 경우 제외
	 * 
	 * @param int 출금액
	 * @return void
	 */

	void outcome(long money) {
		System.out.println("뺀 돈 : " + money);

		if (isDebug) {
			System.out.println("money > 0 :" + (money > 0));
			System.out.println("this.money >= money :" + (this.money >= money));
		} // true 일때 아래 if 실행, false 일땐 미실행

		if (money > 0) { // 전달인자가 -500일 경우 안되니까 (음수일경우 처리)
			if (this.money >= money) {
				this.money -= money;
			}
		}
	}

	/**
	 * 확인 : 잔액 출력
	 * 
	 * @param 없음
	 * @return long 잔액
	 */

	long view() {
		System.out.println("잔 액 : " + this.money);
		return this.money;
	}

}
