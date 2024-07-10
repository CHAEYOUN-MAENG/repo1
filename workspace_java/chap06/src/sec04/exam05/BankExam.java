package sec04.exam05;

public class BankExam {

	public static void main(String[] args) {

		// 따로따로 관리가 된다
		
		Bank bank1 = new Bank("국민");
		// 변수에 담아서 출력하지 않는 이유 : void 이기 때문에
		bank1.view();
		bank1.income(10000);
		bank1.outcome(4000);
		bank1.view();
		
		System.out.println("------------");
		
		Bank bank2 = new Bank("카카오뱅크");
		bank2.view();
		bank2.outcome(500);
		bank2.view();
		bank2.income(5000);
		bank2.view();
		bank2.outcome(500);
		bank2.view();
		
		

	}

}
