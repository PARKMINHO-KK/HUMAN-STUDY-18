import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class OutputExam {

	public static void main(String[] args) {

		String path = "c:\\tmp";
		String fileName = "secret.txt";

//		String fullFileName = path + "\\" + fileName;
		String fullFileName = path + System.getProperty("file.separator") + fileName;

		FileOutputStream os = null;
		try {
			// 스트림 열기
//			FileOutputStream os = new FileOutputStream(fullFileName);
			os = new FileOutputStream(fullFileName);

			// 파일에 쓸 데이터
			String data = "엔터\nEnter\n1234";
			byte[] datas = data.getBytes();

			// 쓰기(덮어쓰기)
			os.write(datas, 0, datas.length);

			// 버퍼에 남은 데이터 모두 출력
			os.flush();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (os != null) {
				// 스트림 닫기
				try {
					os.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

	}

	void saveTxt(String data) {
		// try-with-resource
		// close()를 자동으로 해줌

		String path = "c:\\tmp";
		String fileName = "secret.txt";

//		String fullFileName = path + "\\" + fileName;
		String fullFileName = path + System.getProperty("file.separator") + fileName;

		try (
				FileOutputStream os = new FileOutputStream(fullFileName);
				) {

			byte[] datas = data.getBytes();

			// 쓰기(덮어쓰기)
			os.write(datas, 0, datas.length);

			// 버퍼에 남은 데이터 모두 출력
			os.flush();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
