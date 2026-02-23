package sec02.quiz2;

public class Wizard extends Character {
	
	void creat(int no) {
		this.no = no;
		job = "마법사";
		hp = (int)(Math.random()*20) + 81; // 80~100
		ap = (int)(Math.random()*10) + 21; // 20~30;;
		dp = (int)(Math.random()*5) + 6; // 5~10;
		wp = 10;
		amor = 5;
		System.out.println("-------------------------");
		System.out.println("캐릭터 번호: "+ no);
		System.out.println("직업: "+ job);
		System.out.println("체력: "+ hp);
		System.out.println("기본공격력: "+ ap);
		System.out.println("기본방어력: "+ dp);
		System.out.println("무기공격력: "+ wp);
		System.out.println("갑옷방어력: "+ amor);
		System.out.println("-------------------------");
	}
}
