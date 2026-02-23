package sec02.quiz2;

public class Character {

	// 캐릭터명
	int no; // 캐릭터 번호
	String job; // 직업
	int hp; // 생명력
	int ap; // 기본공격력
	int dp; // 기본방어력
	int wp; // 무기공격력
	int amor; // 갑옷방어력

	int attack = ap + wp + (int) (Math.random() * 6); // 공격력 + 추가랜덤공격력 0~5
	int depend = dp + amor; // 방어력

	void creat(int no) {
		this.no = no;
		job = "";
		hp = 100;
		ap = 10;
		dp = 10;
		wp = 10;
		amor = 10;
		System.out.println("-------------------------");
		System.out.println("캐릭터 번호: " + no);
		System.out.println("직업: " + job);
		System.out.println("체력: " + hp);
		System.out.println("기본공격력: " + ap);
		System.out.println("기본방어력: " + dp);
		System.out.println("무기공격력: " + wp);
		System.out.println("갑옷방어력: " + amor);
		System.out.println("-------------------------");
	}
	
	void info() {
		System.out.println("-------------------------");
		System.out.println("현재 상태 정보창");
		System.out.println("캐릭터 번호: " + this.no);
		System.out.println("직업: " + this.job);
		System.out.println("현재 공격력: " + this.attack);
		System.out.println("현재 방어력: " + this.depend);
		System.out.println("현재 체력: " + this.hp);
		System.out.println("-------------------------");
	}

}
