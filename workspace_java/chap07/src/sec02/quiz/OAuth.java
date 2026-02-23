package sec02.quiz;

public class OAuth {

	private String id;
	private String pw;

	
	boolean join(String id, String pw) {
		this.id = id;
		this.pw = pw;
		if (id != null 
			&& pw != null 
			&& id.trim() != "" 
			&& pw.trim() != "") {
			System.out.println("회원가입 성공");
			return true;
		} else {
			System.out.println("회원가입 실패");
			return false;
		}
	}

	void login(String id, String pw) { // 로그인 실행
		if (loginCheck(id, pw)) {
			System.out.println("로그인 성공");
		} else {
			System.out.println("로그인 실패");
		}
	}

	boolean loginCheck(String id, String pw) { // 로그인 성공실패 여부
		if (id.equals(this.id) 
				&& pw.equals(this.pw) 
				&& id != null 
				&& pw != null 
				&& id != "" 
				&& pw != "") {
//			System.out.println("로그인 성공");
			return true;
		} else {
//			System.out.println("로그인 실패");
			return false;
		}
	}

}
