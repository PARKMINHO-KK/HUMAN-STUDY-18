package sec02.quiz2;

public class Knight extends Character {

	void creat(int no) {
		this.no = no;
		job = "전사";
		hp = (int)(Math.random()*20) + 101; // 100~120
		ap = (int)(Math.random()*10) + 11; // 10~20;
		dp = (int)(Math.random()*5) + 11; // 10~15;;
		wp = 10;
		amor = 10;
		System.out.println("-------------------------");
		System.out.println("캐릭터 번호: "+ no);
		System.out.println("직업: "+ job);
		System.out.println("체력: "+ hp);
		System.out.println("기본공격력: "+ ap);
		System.out.println("기본방어력: "+ dp);
		System.out.println("무기공격력: "+ wp);
		System.out.println("갑옷방어력: "+ amor);
		System.out.println("attack: "+ attack);
		System.out.println("-------------------------");
	}
	
}
