package sec02.exam01;

public class DriverExam {

	public static void main(String[] args) {

		Avante avante = new Avante();
		Car car = (Car) avante;

		Driver driver = new Driver();
		driver.run(avante);

		System.out.println("----------");

		Spark spark = new Spark();
		driver.run(spark);

		// run이 spark를 받았고
		// spark가 drive를 실행시킴

	}

}
