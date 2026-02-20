package sec01.quiz;

//JAVA
//상속
//문제 1
//일반적인 로그인 정보를 가지는 부모 클래스 만들기
//id, password
//생성할 때 받아서 저장
//
//boolean loginCheck(...){
//    ...
//}
//
//... login(...)
//1. 전달인자로 받은 id, pw를 
//2. loginCheck로 보내고
//3. 결과 출력
//3-1. "로그인 성공", "로그인 실패"
//
//
//상속받은 네이버, daum 만들기
//@Override
//... login(...)
//출력 결과만 변경
//"네이버 로그인 성공", "네이버 로그인 실패"
//"Daum 로그인 성공", "Daum 로그인 실패"

public class Login {

	private String id;
	private String pw;
	
	Login(String id, String pw) { // 생성자
		
		if(id == null) {
			this.id = "아이디 없음";
		}
		this.id = id;
		this.pw = pw;
	}
	
	void login(String id, String pw) { // 로그인 실행
		if(loginCheck(id, pw)) {
			System.out.println("로그인 성공");
		} else {
			System.out.println("로그인 실패");
		}
	}
	
	boolean loginCheck(String id, String pw) { // 로그인 성공실패 여부
		if(id.equals(this.id) 
				&& pw.equals(this.pw) 
				&& id != null 
				&& pw != null
				&& id != "" 
				&& pw != "" ) {
//			System.out.println("로그인 성공");
			return true;
		} else {
//			System.out.println("로그인 실패");
			return false;
		}
	}
	
	
}
