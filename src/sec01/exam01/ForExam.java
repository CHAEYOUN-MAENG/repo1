package sec01.exam01;

public class ForExam {

	public static void main(String[] args) {

		// 1씩 증가하는 걸 5번 할꺼임
		int sum = 0;
		sum = sum + 1;
//		sum += 1;
//		sum++;
		sum = sum + 1;
		sum = sum + 1;
		sum = sum + 1;
		sum = sum + 1;
		System.out.println("sum : "+ sum);
		
		// 1 + 2 + 3 + 4 + 5
		sum = 0;
		sum = sum + 1;
		sum = sum + 2;
		sum = sum + 3;
		sum = sum + 4;
		sum = sum + 5;
		System.out.println("sum : "+ sum);
		
		// 1,2,3 .. 에 해당하는 걸 변수에 넣어보자
		sum = 0;
		int i = 1;			// +1
//		sum = sum + i+1;	// +2
		i++; // i == 2
		sum = sum + i;
		
		i++; // i == 3
		sum = sum + i;		//+3
		
	}

}
