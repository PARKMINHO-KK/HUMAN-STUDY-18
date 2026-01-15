package chap05;

import java.util.Scanner;

public class ArrayExam_02 {

	public static void main(String[] args) {

		/*
		 *  배열 array
		 *  
		 *  한번에 여러 변수를 만드는 방법
		 *  같은 타입만 선언할 수 있다
		 *  생성할 때 전체 크기를 지정해줘야 함
		 *  생성된 여러 변수들은 index로 관리한다
		 *  	index는 0번부터 시작
		 */
		
		// 선언 방법
		int[] a1; // java 스타일
		int a3[]; // c 언어 스타일
		
		// 배열 변수는 참조 타입이라서 null을 넣을 수 있다
		a1 = null; 
		
		int score_0 = 90;
		int score_1 = 85;
		int score_2 = 70;
		
		/*
		 *  첫번째 [] : int[]
		 *  	int만으로 구성된 배열 변수 타입
		 *  두번쨰 [] : new int[30];
		 *  	배열의 크기. 즉, 한번에 만들 변수의 개수
		 *  세번째 [] : score[0]
		 *  	만들어진 변수 중에서 몇번째인지를 의미
		 *  	index는 0부터 시작한다
		 */
		int[] score = new int[30];
		score[0] = 90; 
		score[1] = 85;
		score[2] = 70;
//		score[3] = null; // int라서 null을 넣을 수 없음
		
		System.out.println("score[0]: "+ score[0]);
		
		//Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 30 out of bounds for length 30
//		길이가 30 이라서 0~29까지 가능한데 50은 범위를 벗어났다
//		score[30] = 2;
		
		// 배열을 선언하는 첫번째 방법 
		
		String[] str = new String[3];
		System.out.println("str[0]: "+ str[0]);
		System.out.println("score[5]: "+ score[5]);
		
//		int a;
//		System.out.println(a);
		
		// 배열 생성 후 기본값
		// 0, false, null
		
		// 배열을 선언하는 두번째 밥법
		// 넣을 값을 모두 알고 있는 경우
		int[] i1 = new int[] {90, 85, 70};
		System.out.println("i1[1]: "+ i1[1]);
		
		// 선언과 초기화를 따로 할 수 있다
		int[] i2 = null;
		i2 = new int[] {90, 85, 70};
		
		// 배열을 선언하는 세번째 방법
		// 선언과 동시에 초기화 하는 경우만 사용 가능
		// new int[]를 생략할 수 있다
		int[] i3 = {90, 85, 70};
//		i3 = {90, 85, 70}; // new가 있어야 한다
		
		int sum = 0;
//		sum = sum + i3[0];
//		sum = sum + i3[1];
		
		for(int i=0; i<3; i++) {
			sum = sum + i3[i];
		}
		System.out.println("총합: "+ sum);
		System.out.println("평균: "+ (sum/3.0));
		System.out.println("배열의 길이: "+ i3.length);
		
		sum = 0;
		for(int i=0; i<i3.length; i++) {
			sum = sum + i3[i];
		}
		System.out.println("총합: "+ sum);
		
		// 5개 변수를 한번에 만들기
		// 5개 크기의 int 배열 만들기
		int[] a5 = new int[5];
		// 첫번째 변수에 1 넣기
		a5[0] = 1;
		// 두번째 변수에 2 넣기
		a5[1] = 2;
		
		// 문제1
		// 첫번째 반복문에서
		// 		10개의 변수에 각 1~10값 담기
		// 두번째 반복문에서 
		//		모든 값을 순서대로 출력
		
		int[] i4 = new int[10];
		for(int i=0; i<i4.length; i++) {
			i4[i]=i+1;
		}
		for(int i=0; i<i4.length; i++) {
			System.out.println(i4[i]);
		}
		
		System.out.println("args: "+ args);
		// args의 개수 출력
		if(args != null) {
			System.out.println("args lengrh: "+ args.length);
			// args의 모든 내용 출력
			for(int i = 0; i < args.length; i++) {
				System.out.println(args[i]);			
			}
		}
		
		// 문제2
		// 7,12,8을 순서대로 저장한 배열이 있을 때
		// 다른 배열에도 7,12,8으로 저장되게 복사
		// 단 b=a 안됨
		int[] q2 = new int[3];
		q2[0] = 7;
		q2[1] = 12;
		q2[2] = 8;
		
//		int[] qq2 = new int[3];
		int[] qq2 = new int[q2.length];
//		for(int i=0; i<qq2.length; i++) {
//			qq2[i] = q2[i];
//			System.out.println("문제2: qq2["+ i +"] => "+  qq2[i]);
//		}
		System.out.println("------------------------------");
		
		// 문제3
		// 7,12,8을 순서대로 저장한 배열이 있을 때
		// 다른 배열에 거꾸로 8, 12, 7로 저장되게 
//		for(int i=0; i<qq2.length; i++) {
//			qq2[(qq2.length)-1-i] = q2[i];
//			//qq2[2] = q2[0]
//			//qq2[1] = q2[1]
//			//qq2[0] = q2[2]
//		}
//		for(int i=0; i<qq2.length; i++) {
//			System.out.println("문제3: qq2["+ i +"] => "+  qq2[i]);
//		}
		
		// 문제4
		// {3, 4, 7, 5, 1, 4, 6}
		// 4-1. 위 배열에서 홀수의 개수 구하기
		// 4-2. 4보다 큰 수의 개수 구하기
//		int[] q4 = {3, 4, 7, 5, 1, 4, 6};
//		int count = 0;
//		for(int i=0; i<q4.length; i++) { // 문제 4-1
//			if(q4[i]%2 == 1) {
//				count++;
//			}
//		}
//		System.out.println("문제4-1: "+count);
//		
//		count = 0;
//		for(int i=0; i<q4.length; i++) { // 문제 4-2
//			if(q4[i] > 4) {
//				count++;
//			}
//		}
//		System.out.println("문제4-2: "+count);
		
		
		// ---- 응용문제----
		// 문제5
		/*
		 * 마라톤에 5명의 선수사 참여했음
		 * 선수들은 1번부터 5번까지 등번호를 부여받음
		 * 대회가 끝났을 때 완주하지 못한 선수가 1명 있다
		 * 그 선수를 찾으시오
		 * 완주 목록 {2, 4, 5, 1}
		 */
		
//		int[] input = {1,2,3,4,5};
//		int[] finish = {2,4,5,1};
//		
//		
//		for(int i=0; i<input.length; i++) {
//			boolean flag = false;
//			for(int j=0; j<finish.length; j++) {
//				if(input[i] == finish[j]) {
//					flag = true;				
//				} 
//			}
//			if(flag != true){
//				System.out.println("완주 실패 선수: "+ input[i] + "번");
//				break;
//			}
//		}
//			if(input[i] != finish[i]) {
//				System.out.println("완주 실패 선수: "+ input[i] + "번");
//			}
//		}
		
		
		// 문제6
		// {3, 4, 7, 5, 1, 4, 6}
		// 여기서 가장 큰 수 찾기
		//for(int i=0; i<num7.length; i++) { // 잘못한거
		//for(int j=0; j<num7.length; j++) { // 잘못한거
//			if(num7[i]>num7[j]) {					
//				System.out.println(num7[i]>num7[j]); // 값이 너무많이 나옴 변수도 하나더 있어야
//			}
		//}
		//}
		int[] num7 = {3, 4, 7, 5, 1, 4, 6};
//		int big = 0;
//		for(int i=0; i<num7.length; i++) {
//			if(num7[i] > big) {
//				big = num7[i];
//			}
//		}
//		System.out.println("가장 큰 수는: "+ big);
		
		// 문제7
		// {3, 4, 7, 5, 1, 4, 6}
		// 여기서 두번째 큰 수 찾기
		
//		int big = 0;
//		for(int i=0; i<num7.length; i++) {
//			if(num7[i] > big) {
//				big = num7[i];
//			}
//		}
//		int second = 0;
//		for(int i=0; i<num7.length; i++) {
//			if(num7[i] < big && num7[i] > second) {
//				second = num7[i];
//			}
//		}
//		System.out.println("문제8 두번째 큰 수는: "+ second);
		
		
		// 문제8
		// 오른쪽으로 한칸 씩 밀기 (왼쪽은 0으로 채우기)
		// 예 :
		// 1라운드 : {3, 4, 7, 5, 1, 4, 6}
		// 2라운드 : {0, 3, 4, 7, 5, 1, 4}
		// 3라운드 : {0, 0, 3, 4, 7, 5, 1}
		
		// for문으로 1라운드 출력 => 안쪽 for문 
		// [0] [0+1] [0+2] [0+3] ... => num7[i] = num7[i++] 2중 for문 필요(바깥쪽)
		// [0] [0] [0+1] [0+2] ... => num7[0] = 0(2라운드), num7[1](3라운드) = 0.. 로 바꿔야함
		// else{num7[] = null or num7[] = 0}
		int i = 0;
//		System.out.print("1라운드 : {"); // 정답
//		for(i=0; i<=(num7.length-1); i++) { // 원본출력
//			System.out.print(num7[i] +", ");
//		}
//		System.out.println("}");
//		for(i=0; i<num7.length; i++) { // 2라운드부터 출력
//			System.out.print((i+2) + "라운드 : {");
//			for(int j=(num7.length-1); j>=0; j--) {
//				if (j > 0) {
//					num7[j] = num7[j-1];
//				} else {
//					num7[j] = 0;
//				} 
				
				
//			for(int j=0; j<num7.length; j++) { // 오답
//				if(i == (j-1)) {뒤가 전부 같은 값을 가져서 안됨
//					num7[j-1] = 0;
//				} 
//				else if (i<j) { 
//					num7[j] = num7[j-1];
//				}
//				System.out.print(num7[j]+ ", "); // 여기에서 출력하면 거꾸로 나오잖아!
//			}
//			System.out.println("}");
			
			
//			for(int j=0; j<num7.length; j++) { // 정답 : 형제로 출력해야 나온다
//				System.out.print(num7[j]+ ", ");
//			}
//			System.out.println("}");
//		}
		
		// 문제9
		// 오른쪽으로 한칸 씩 밀기
		// 맨 끝 값은 맨 처음으로 보내기
		// 1라운드 : {3, 4, 7, 5, 1, 4, 6}
		// 2라운드 : {6, 3, 4, 7, 5, 1, 4}
//		int q9[] = {3, 4, 7, 5, 1, 4, 6};
//		System.out.print("1라운드 : {");
//		for(i=0; i<=(q9.length-1); i++) { // 원본출력
//			System.out.print(q9[i] +", ");
//		}
//		System.out.println("}");
//		for(i=0; i<=q9.length; i++) { // 2라운드부터 반복
//			System.out.print((i+2) + "라운드 : {");
//			for(int j=(q9.length-1); j>=0; j--) { // 앞 2개가 6으로 나오고 6이 라운드마다 늘어남
//				if (j == (q9.length-1)) {
//					q9[0] = q9[(q9.length-1)];
//				} else if(j > 0) {
//					q9[j] = q9[j-1];
//				} else {
//					
//				}
//			}
//			for(int j=0; j<q9.length; j++) { // 정답 : 형제로 출력해야 나온다
//				System.out.print(q9[j]+ ", ");
//			}
//			System.out.println("}");
//		}
		
//		for(i=0; i<q9.length; i++) { // 정답 : 2라운드부터 출력
//			System.out.print((i+2) + "라운드 : {");
//			int fi = q9[q9.length-1];
//			for(int j=(q9.length-1); j>=0; j--) {
//				if (j > 0) {
//					q9[j] = q9[j-1];
//				} else {
//					q9[j] = fi;
//				} 
//			}
//			for(int j=0; j<q9.length; j++) { // 정답 : 형제로 출력해야 나온다
//				System.out.print(q9[j]+ ", ");
//			}
//			System.out.println("}");
//		}
				
		// 문제10
		// 임시 비밀번호 8자리
		// 10-1 : 숫자만
		
		// 랜덤으로 한자리수 뽑아서
		// 8자리 배열만들고
		// for문으로 8번 반복
		
		int q10[] = new int[8];
//		System.out.print("문제10 임시비밀번호: ");
//		for(i=0; i<q10.length; i++) {
//			q10[i] = (int)(Math.random()*10);
//			System.out.print(q10[i]);
//		}
//		System.out.println("");
		
		// 10-2 : 소문자만
		String alpa[] = { // 알파벳 소문자 전부
				"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k",
				"l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v",
				"w", "x", "y", "z"
				};
		
		System.out.print("문제10-2 임시비밀번호(소문자): ");
		for(i=0; i<q10.length; i++) {
			q10[i] = (int)((Math.random()*26)-1);
			System.out.print(alpa[q10[i]]);
		}
		System.out.println("");
		
		// 10-3 : 숫자 2개 이상, 대/소문자 각 1개 이상
		System.out.print("문제10-3 임시비밀번호(섞어서): ");
		String balpa[] = { // 알파벳 대문자 전부
				"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K",
				"L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V",
				"W", "X", "Y", "Z"
				};
		
		for(i=0; i<q10.length; i++) {
			if(i>=0 && i<(q10.length-2)) {
				q10[i] = (int)(Math.random()*10);
				System.out.print(q10[i]);
			} else if (i == (q10.length-2)) {
				q10[i] = (int)((Math.random()*26)-1);
				System.out.print(alpa[q10[i]]);
			} else {
				q10[i] = (int)((Math.random()*26)-1);
				System.out.print(balpa[q10[i]]);
			}
		}
		System.out.println("");
		
		
		// 문제11
		// 자리가 10개 있는 소극장의 예약 시스템
		// 자리 번호는 1~10번 까지 번호의 자리가 있다
		// 메뉴 : "1.예약 2.모든 좌석 현황 3.잔여 좌석 0.종료"
		// 조건1 : 예약이 가능하다면 "n번 자리 예약 되었습니다"
		// 조건2 : 예약이 되어있다면 "이미 예약 되어 있습니다"
		
//		int seat[] = new int[10];
////		for(i=0; i<seat.length; i++) {
////			seat[i] = i+1;
////		}
//		boolean run = true;
//		
//		while(run) {
//			
//			System.out.println("------------------------------------------");
//			System.out.println("1.예약 2.모든 좌석 현황 3.잔여 좌석 0.종료");
//			System.out.println("------------------------------------------");
//			System.out.print("메뉴를 입력하세요");
//			Scanner rev = new Scanner(System.in);
//			int menu = rev.nextInt();
//			
//			if(menu == 1) {
//				System.out.println("희망 좌석을 입력하세요");
//				Scanner menu1 = new Scanner(System.in);
//				int input = menu1.nextInt();
//				if(seat[input-1] == 0) {
//					seat[input-1] = input;					
//				} else {
//					System.out.println("이미 예약된 좌석입니다");
//				}					
//				System.out.println();
//				
//			} else if(menu == 2) {
//				System.out.print("예약된 좌석: ");
//				for(i=0; i<seat.length; i++) {
//					if(seat[i] != 0) {
//						System.out.print(seat[i]+",");
//					}
//				}
//				System.out.println("");
//				System.out.print("남아있는 좌석: ");
//				for(i=0; i<seat.length; i++) {
//					if(seat[i] == 0) {
//						System.out.print(i+1+ ",");
//					}
//				}
//				System.out.println("");
//				
//			} else if(menu == 3) {
//				System.out.print("잔여 좌석 수: ");
//				int count = 0;
//				for(i=0; i<seat.length; i++) {
//					if(seat[i] == 0) {
//						count++;
//					}
//				}
//				System.out.println(count);
//				
//			} else if(menu == 0) {
//				System.out.println("시스템 종료");
//				run = false;
//			} else {
//				System.out.println("정확히 입력하세요");
//			}
//		}
		
		// 문제12
		// 로또 번호 6개 배열에 저장
		// 단, 중복 없이!
		
		// 로또번호 6개 for문으로 출력
		// 0번 번호와 나머지 번호 같은지 비교 후 같지않으면 저장
		// 1번 번호와 나머지 번호 같은지 비교 후 같지않으면 저장
		// 5번까지 반복 배열 6개 짜리에 저장
		
		int lotto[] = new int[6];
		boolean run = true;
		
		lotto[0] = (int)(Math.random()*45+1);
		int j = 0;
//		for(i=1; i<lotto.length; i++) { 원래 내꺼
//			while(run) {
//				for(j=0; j<lotto.length; j++) {
//					lotto[i] = (int)(Math.random()*45+1);
//					if(lotto[i] != lotto[j]) {
//						run=false;													
//					}
//				}
//			}
//		}
		for (i = 1; i < lotto.length; i++) { // gpt
		    run = true;   // ★ 여기 추가
		    while (run) {
		        lotto[i] = (int)(Math.random() * 45 + 1);
		        run = false;

		        for (j = 0; j < i; j++) {
		            if (lotto[i] == lotto[j]) {
		                run = true;
		                break;
		            }
		        }
		    }
		}
		for(i=0; i<lotto.length; i++) {
			System.out.print(lotto[i]+",");
		}
		// 문제13
		// 0: 주차되어 있음
		// 1: 비어있음
		/* 
		 * {
		 * 		{0, 0, 0, 0},	// 1층
		 * 		{0, 0, 0, 1},	// 2층
		 * 		{1, 0, 1, 0},
		 * 		{1, 0, 1, 1},
		 * 		{1, 1, 1, 1},
		 * }
		 */
		// 13-1 : 2층에 주차된 차량 수 출력
		// 12-2 : 전체 남은 자리 수 출력
		
	}

}
