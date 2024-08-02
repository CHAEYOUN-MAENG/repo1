package sec01.exam01;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class OutputExam {

	public static void main(String[] args) {

		String path = "c:\\tempo";
		String fileName = "test.txt";

		OutputStream os = null;
		try {
			// stream 열기
			os = new FileOutputStream(path + "\\" + fileName); // 1번

			String data = "abc\n한글\n123";
			byte[] datas = data.getBytes();

			os.write(datas); // 쓰기 2번
			os.flush(); // 싹 물을 내려줌~, 남은거 내보내기
//			os.close(); // 닫기

		} catch (FileNotFoundException e) { // 1번
			e.printStackTrace();
		} catch (IOException e) { // 2번
			e.printStackTrace();
		} finally {
			if (os != null) {
				try {
					os.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

		// try-with-resources
		// () 안에 AutoClosable 인터페이스를 구현한 클래스를 선언하면
		// 알아서 close() 실행해줌
		try (OutputStream os2 = new FileOutputStream(path + "\\" + fileName);) {

			String data = "abc\n한글\n123";
			byte[] datas = data.getBytes();

			os.write(datas); // 쓰기
			os.flush(); // 남은 것 내보내기

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
