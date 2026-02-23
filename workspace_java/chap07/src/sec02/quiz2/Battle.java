package sec02.quiz2;

import java.util.Scanner;

public class Battle {
		
	Character c1 = new Character();
	Character c2 = new Character();
	
	Character battle(){
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		System.out.println("-----------------------------");
		System.out.println("첫 번째 선수번호를 입력하세요");
		System.out.println("-----------------------------");
		c1.no = sc.nextInt(); 
		System.out.println("-----------------------------");
		System.out.println("두 번째 선수번호를 입력하세요");
		System.out.println("-----------------------------");
		c2.no = sc.nextInt();
		System.out.println("--------------------");
		System.out.println("배틀을 시작합니다");
		System.out.println("--------------------");
		int count = 1;
		int damage1 = c2.attack-c1.depend;
		int damage2 = c1.attack-c2.depend;
		do {
			System.out.println("라운드: "+ count++);
			if(c1.hp > 0 && c2.hp > 0) {
				c1.hp = c1.hp - damage1;
				c1.info();
				c2.hp = c2.hp - damage2;
				c2.info();
			} else {
				flag = false;
			}
		} while(flag);
		
		sc.close();
		System.out.println("배틀종료");
		if(c1.hp > c2.hp
			&& c1.hp > 0 
			&& c2.hp > 0) {
			return c1;
		} else {
			return c2;
		}
	}
	
}
