package chap04;

import java.util.Scanner;

public class BreakExam_05 {

	public static void main(String[] args) {

//		int count = 0;
//		while(true) {
//			int num = (int)(Math.random()*6)+1;
//			System.out.println("주사위: "+ num);
//			count++;
//			if(num == 6) {
//				break;
//			}
//		}
//		System.out.println(count);
//		System.out.println("프로그램 종료");
		
		// 총 5명이 순차적으로 주사위를 던져서
		// 각자 6이 나올 때 까지. 6이 나오면 다음사람
//		for(int i=1; i<=5; i++) {
//			System.out.println(i+"번: 아이");
//			while(true) {
//				int num = (int)(Math.random()*6)+1;
//				System.out.println("주사위: "+ num);
//				
//				if(num == 6) {
//					break;
//				}
//			}
//		}
		
		// 총 4층의 주차건물이 있음
		// 각 층에는 10대의 자리가 있음
		// 내 차는 1층 첫번째부터 17번째에 있음
//		int count2 = 0;
//		boolean flag = false;
//		for(int i = 1; i <= 4; i++) {
//			
//			for(int j=1; j<=10; j++) {
//				count2++;
//				System.out.println(i +", "+ j);
//				if(count2 >= 17) {
//					System.out.println("!!!!!!!!!!!!");
//					flag = true;
//					break;
//				}
//			}
//			
//			if(flag) {
//				break;
//			}
//		}
//		
//		for(int i=1; i<=10; i++) {
//			if(i%2 == 1) {
//				continue;
//			}
//			System.out.println(i);
//		}
		
		// 문제 1-1
		// 1단계 : 183페이지 7번 그대로
		// 문제 1-2
		// 2단계 : 1~4 이외에 입력시 "똑바로해라"
		// 3단계 : 예금이 -는 안된다
		// 4단계 : 출금액이 잔고보다 높지않게 잔고 다시 그대로, -도 안됨
		
		boolean run = true;
		int balance = 0;
		
		
		while(run) {
			System.out.println("---------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("---------------------------------");
			System.out.print("선택> ");
			
			Scanner scanner = new Scanner(System.in);
			int input = scanner.nextInt();
			
			if(balance >= 0 && input == 1) { // 입금 관련
				Scanner bscan = new Scanner(System.in);
				int cbal = bscan.nextInt(); // 입금액 스캔
				if(cbal <= 1000000 && cbal >= 0) { // 입금액이 0 ~ 1,000,000일 때
					balance = balance + cbal; // 입금 후 잔액
					System.out.println("예금액>"+ cbal);					
				} else if(cbal >= 1000000) { // 1회 최대 입금액 초과
					System.out.println("1회 최대 입금액 1,000,000");
				} else { // 음수 입력 시
					System.out.println("금액이 잘못 입력되었습니다");
				}
			} else if (balance >= 0 && input == 2) { // 출금 관련
				Scanner cscan = new Scanner(System.in);
				int cout = cscan.nextInt(); // 출금액 스캔
				if(balance >= cout && cout <= 1000000 && cout >= 0) { // 출금액이 잔액보다 작고 1,000,000 이하
					System.out.println("출금액>"+ cout); // 출금한 금액
					balance = balance - cout; // 출금 후 잔액
				} else if(balance >= cout && cout > 1000000 && cout >= 0) { // 출금액이 잔액보다 작고 1,000,000 초과
					System.out.println("1최 최대 출금액 1,000,000");
				} else if(balance < cout && cout >= 0 && cout <= 1000000) { // 출금액이 잔액보다 많을 때
					System.out.println("잔액이 부족합니다");
				} else {
					System.out.println("정확히 입력해 주세요");
				}
			} else if (balance >= 0 && input == 3) {
				System.out.println("잔고>"+ balance);
			} else if (input == 4) {
				System.out.println("프로그램 종료");
				run = false;
			} else {
				System.out.println("정확히 입력해 주세요");
				System.out.println("도움이 필요할 땐 강사님께...");
			}
			
		}
		
	}

}
