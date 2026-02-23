package sec02.quiz;

public class Tving extends OAuth {
	
	String id;
	String pw;
	
	Naver naver = new Naver();
	Kakao kakao = new Kakao();
	
//	@Override
//	boolean join(String id, String pw) {
//		if ((naver.id.equals(id)
//			&& naver.pw.equals(pw))
//			||(kakao.id.equals(id)
//			&& kakao.pw.equals(pw))
//			&& id != null 
//			&& pw != null 
//			&& id.trim() != "" 
//			&& pw.trim() != "") {
//			System.out.println("티빙 회원가입 성공");
//			return true;
//		} else {
//			System.out.println("티빙 회원가입 실패");
//			return false;
//		}
//	}
	
	
	@Override
	void login(String id, String pw) { // 로그인 실행
		if (loginCheck(id, pw)) {
			System.out.println("티빙 로그인 성공");
		} else {
			System.out.println("티빙 로그인 실패");
		}
	}

}
