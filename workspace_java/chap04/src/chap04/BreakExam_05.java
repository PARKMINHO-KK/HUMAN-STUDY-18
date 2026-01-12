package chap04;

public class BreakExam_05 {

	public static void main(String[] args) {

		int count = 0;
		while(true) {
			int num = (int)(Math.random()*6)+1;
			System.out.println("주사위: "+ num);
			count++;
			if(num == 6) {
				break;
			}
		}
		System.out.println(count);
		System.out.println("프로그램 종료");
		
		// 총 5명이 순차적으로 주사위를 던져서
		// 각자 6이 나올 때 까지. 6이 나오면 다음사람
		for(int i=1; i<=5; i++) {
			System.out.println(i+"번: 아이");
			while(true) {
				int num = (int)(Math.random()*6)+1;
				System.out.println("주사위: "+ num);
				
				if(num == 6) {
					break;
				}
			}
		}
		
		// 총 4층의 주차건물이 있음
		// 각 층에는 10대의 자리가 있음
		// 내 차는 1층 첫번째부터 17번째에 있음
		int count2 = 0;
		boolean flag = false;
		for(int i = 1; i <= 4; i++) {
			
			for(int j=1; j<=10; j++) {
				count2++;
				System.out.println(i +", "+ j);
				if(count2 >= 17) {
					System.out.println("!!!!!!!!!!!!");
					flag = true;
					break;
				}
			}
			
			if(flag) {
				break;
			}
		}
		
		for(int i=1; i<=10; i++) {
			if(i%2 == 1) {
				continue;
			}
			System.out.println(i);
		}
		
		// 문제 1-1
		// 1단계 : 183페이지 7번 그대로
		// 문제 1-2
		// 2단계 : 1~4 이외에 입력시 "똑바로해라"
		// 3단계 : 예금이 -는 안된다
		// 4단계 : 출금액이 잔고보다 높지않게 잔고 다시 그대로, -도 안됨
	}

}
