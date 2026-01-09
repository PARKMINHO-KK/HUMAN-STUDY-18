package chap04;

import java.util.Scanner;

public class ForExam_03 {

	public static void main(String[] args) {

		// for문의 기본 형식 false 값이 존재하지 않아서 무한반복된다
//		for( ; ; ) {
//			
//		}
		int sum = 0;

//		for(int i=1; i<=100; i = i + 1) { // 1++와 같은 식
//		for(int i=1; i<=100; i = i + 2) { // 1~100까지 홀수의 합
//		for(int i=1; i<=100; i++) {
		int i=0;
		i=1;
		for(i=1; i<=100; i++) {
			sum = sum + i;
//			sum += 1;
		}
		System.out.println(sum);
		System.out.println(i);
		
		// 깜짝퀴즈 1~10까지 출력
		int num = 1;
		for(num=1; num<=10; num++) {
			System.out.println(num);
		}
		
		// 1+1+1+1+1 
		// 1씩 더하는거 5번 하고 싶다
		int sum1 = 0;
		sum1 = sum1 + 1;
		sum1 = sum1 + 1;
		sum1 = sum1 + 1;
		sum1 = sum1 + 1;
		sum1 = sum1 + 1;
		System.out.println(sum1);
		
		// 반복이 변경되지 않았을 때 시작 값
		// 종료 조건
		int sum2 = 0;
		for(int j=1; j<=5; j++) {
			sum2 = sum2 + 1;
		}
		System.out.println(sum2);
		
		
		// 1~5까지 합을 구하기
		sum = 0;
		sum = sum + 1;
		sum = sum + 2;
		sum = sum + 3;
		sum = sum + 4;
		sum = sum + 5;
		
		sum = 0;
		int k = 1;
		sum = sum + k; // k == 1
		k++;
		sum = sum + k; // k == 2
		k++;
		sum = sum + k; // k == 3
		
//		for(k=1; k<=5 ; ) {
		for(k=1; k<=5 ; k++) {
			sum = sum + k; // k == 1
//			k++;
		}

		/*
		 * 반복문 만드는 원리
		 * 
		 * 1. 반복 되는 것 찾기
		 * 		컨트롤+C, V 했을 때 바뀌지 않는 것 찾기
		 * 2. 반복 되지 않는 것의
		 * 		2-1. 규칙(패턴) 찾기
		 * 		2-2. 변수로 바꿔서 더이상 바뀌지 않게 만들기
		 * 
		 * 3. 시작 값 찾기
		 * 4. 종료 조건 파악
		 */
		
		 // 깜짝 퀴즈
		// 구구단 2단 출력
		// 2x1=2
		// 2x2=4
		
		//1. 반복되는것 찾기
		int x2 = 1; // 초기값
		int xsum;
//		xsum = 2 * x2;
		
//		for( x2=1 ; x2<=9; x2++) {
//			xsum = 2 * x2;
//			System.out.println("2 x " + x2 + " = "+ xsum);
//		}
		for( x2=1 ; x2<=9; x2++) {
			xsum = 2 * x2;
			System.out.println("2 x " + x2 + " = "+ xsum);
		}
		
		// 10부터 1까지 출력
//		System.out.println(b);
//		System.out.println(b);
//		System.out.println(b);
		int a = 10;
//		int b = a--;
//		b = 1<=b<=10
		
		for(a=10 ; a >= 1 ; a--) {
			System.out.println(a);
		}
		
		// 10부터 2까지 짝수만 출력
		for(int c = 10; c >= 1; c-- ) {
			if(c%2 == 0) {
				System.out.println(c);
			}
		}
		for(int c = 10; c >= 1; c = c - 2 ) {
			System.out.println(c);
		}
		
		// --- 꼭 풀 수 있어야 함 ---
        // 문제1
        // 1~5까지 출력하되 홀수인지 짝수인지 같이 출력
        // 예) 1:홀수
        //     2:짝수
		System.out.println("five");
		int five = 5;
		for(five=5 ; five > 0 ; five--) {
			System.out.print(five + ":");
			if(five%2==1) {
				System.out.println("홀수");
			} else {System.out.println("짝수");}
		}
        
        // 문제2
        // 1~100까지 홀수의 합과 개수
		int n1 = 1;
		sum = 0;
		int count = 0;
		for(n1=1 ; n1 <= 100 ; n1++) {
			if(n1%2 != 0) {
				System.out.println(n1);
				sum = sum + n1;
				
				count++;
			}
		}
		System.out.println("홀수의 합은: " + sum);
		System.out.println("홀수의 개수는: " + count);
        
        // 문제3
        // 1 ~ 입력 받은 수 까지 더하기
		Scanner num1 = new Scanner(System.in);
		int num2 = num1.nextInt();
		n1 = 1;
		sum = 0;
		for(n1=1 ; n1 <= num2 ; n1++ ) {
			sum = sum + n1;
		}
		System.out.println("1부터 "+ num2 + "까지의 합은: " + sum);
        
        // --- 조금 난이도 있는 ---
        // 문제4
        // 1~10까지 3개씩 옆으로 찍
        //    1  2  3
        //    4  5  6 
        //    7  8  9
        //    10
		for(int d=1; d<=10; d++) {
			if(d%3 == 0) {
				System.out.print(d);
				System.out.println();	// 엔터			
			} else {
				System.out.print(d +"\t");							
			}
		}
        
        // --- 이중 for 문 ---
        // 문제1
        // 구구단 모든 단 출력		
		// 2단
		int dan = 2;
		for( x2=1 ; x2<=9; x2++) {
			System.out.println("2 x " + x2 + " = "+ (dan * x2));
		}
		dan++;
		for( x2=1 ; x2<=9; x2++) {
			System.out.println("3 x " + x2 + " = "+ (dan * x2));
		}
		
		for(dan=2; dan<=9; dan++) {
			System.out.println(dan+"단-------");
			for( x2=1 ; x2<=9; x2++) {
				System.out.println(dan + " x " + x2 + " = "+ (dan * x2));
			}
		}
		
		// 문제2
		// 구구단 단마다 옆으로 출력
		
		// 문제3
		// 구구단 3단씩 옆으로 출력
		
		// 문제4
		// 주사위 2개를 굴려서
		// 나올 수 있는 모든 조합
		// [1,2] [1,2] .. [6,6]
		
		// 문제5
		// 주사위 2개를 굴려서 
		// 합 별로 출력
		// 합2 : [1,1]
		// 합3 : [1,2] [2,1]
		
		// 문제6
		// 주사위 2개를 굴려서 나올 조합에서
		// 중복 없이 출력
		// 예 : [1,2] [2,1] 중복이라서 [1,2]
		
	}
}
