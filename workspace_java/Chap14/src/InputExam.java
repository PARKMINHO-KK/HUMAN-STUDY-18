import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class InputExam {

	public static void main(String[] args) {

		String fullPath = "c:\\tmp\\secret.txt";
		
		
		
		try(
			InputStream is = new FileInputStream(fullPath);
		){
			
			// 바가지의 크기(한번에 읽을 크기)
//			int BUFFER_SIZE = 1024 * 8;
//			int BUFFER_SIZE = 10;
			int BUFFER_SIZE = 1;
			
			byte[] buffer = new byte[BUFFER_SIZE];
			
//			int result = is.read(buffer);
//			System.out.println("읽은 byte 수 : "+ result);
//			String data = new String(buffer, 0, result);
//			System.out.println("읽은 내용 : "+ data);
			
			int result = 0;
			String data = "";
			
//			result = is.read(buffer);
//			if(result != -1) {
//				data += new String(buffer, 0, result);
//			}
			
			// 정석
			while(result != -1) {
				result = is.read(buffer);
				
				if(result != -1) {
					data += new String(buffer, 0, result);
//					System.out.println("-----------");
//					System.out.println(data);
				}
			}
			System.out.println("읽은 내용 : "+ data);
			
			// 압축형 위에랑 같은 코드
			while( (result = is.read(buffer)) != -1 ) {
				data += new String(buffer, 0, result);
			}
			System.out.println("읽은 내용 : "+ data);
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
