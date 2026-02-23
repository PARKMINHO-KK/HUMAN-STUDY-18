package sec02.quiz2;

public class BattleExam {

	public static void main(String[] args) {
		
//		문제2
//		[케릭터]
//		케릭명Charactor
//		hp-생명력
//		ap-공격력
//		dp-방어력
//		무기(공격수치)
//		방어구(방어수치)
//
//		공격()
//		return 내 공격력+무기공격수치+rand()
//
//		방어()
//		내 방어력+방어구 방어수치
//
//		두 개 이상의 케릭터를 만들기
//		전사(케릭터 상속)
//		마법사(케릭터 상속)
//
//		[Battle]
//		Charactor c1, Charactor c2
//		while 둘중한 죽을때 까지
//		return 승리자 명
//
//		[BattleExam]
//		캐릭터 2개 생성해서 Battle에 전달하기
//		누가 승리했는지에 따라 출력
		
		Knight k1 = new Knight();
		Wizard w1 = new Wizard();
		Battle battle = new Battle();
		
		k1.creat(1);
		w1.creat(2);
		
		battle.c1 = k1;
		battle.c2 = w1;
		
		Character winner = battle.battle();
		
		System.out.println("배틀결과 캐릭터 번호 "+ winner.no + "번 " + winner.job + " 승리");
		
		
		
		
		
		

	}

}
