package sec02.exam01_cafe;

public class Mega extends Coffee {

	@Override // 안해도 상관은 없음
	boolean isDT() {
		return true; // 드라이브스루가 있고 없고
	}
	
}
