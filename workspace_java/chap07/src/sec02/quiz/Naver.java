package sec02.quiz;

public class Naver extends OAuth {
	
	String id;
	String pw;
	
	@Override
	boolean join(String id, String pw) {
		this.id = id;
		this.pw = pw;
		if (id != null 
			&& pw != null 
			&& id.trim() != "" 
			&& pw.trim() != "") {
			System.out.println("네이버 회원가입 성공");
			return true;
		} else {
			System.out.println("네이버 회원가입 실패");
			return false;
		}
	}
	
	@Override
	void login(String id, String pw) { // 로그인 실행
		if (loginCheck(id, pw)) {
			System.out.println("네이버 로그인 성공");
		} else {
			System.out.println("네이버 로그인 실패");
		}
	}

}
