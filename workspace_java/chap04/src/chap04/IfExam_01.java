package chap04;

import java.util.Scanner;

public class IfExam_01 {

	public static void main(String[] args) {
		
		int score = 85;
		
		boolean over90 = score >= 90;
		
		{
			System.out.println("항상 실행되는 실행 블럭");
		}
		
		// 만약에
		if(over90) {
			System.out.println("90 이상입니다");			
		}

//		if(over90) System.out.println("90 이상입니다");			
		
		if(score < 90) {
			System.out.println("90 미만입니다");
		}
		
		if( !(score >= 90) ) {
			System.out.println("90 미만입니다");
		}
		
		if(score >= 90) {
			System.out.println("90 미만입니다");			
		} else { // 그렇지 않으면
			System.out.println("90 미만입니다");
		}
		// else가 있으면 무조건 하나는 실행되는게 보장된다
		
		score = 95;
		if(score >= 90) {
			System.out.println("90 이상");
		}
		// 이전과 관계없이 무조건 다시 판단
		if ((100>score) && (score>=80)) {
			System.out.println("80 ~ 100");
		}
		
			System.out.println("---------------");
		
		if(score >= 90) {
			System.out.println("90 이상");
//		} else if ((100>score) && (score>=80)) {
//		} else if ((90>score) && (score>=80)) {
		} else if (score>=80) {
			System.out.println("90미만 80이상");
		} else if( score >= 70 ) {
			System.out.println("80미만 70이상");
		} else {
			System.out.println("70미만");
		}
		// if 2개 이상은 독립 사건, else if는 최초의 참 밑에 언어는 읽지 않음
		// if나 else if가 거짓일 때만 판단한다 
		
		// 97점이면
		// 		90이상
		//		95이상
		// 92점이면
		if( score >= 95 ) {
			System.out.println("90 이상");
			System.out.println("95 이상");
		} else if ( score >= 90 ) {
			System.out.println("90 이상");
		}
		
		if ( score >= 90) {
			System.out.println("90 이상");
			if( score >= 95 ) {
				System.out.println("95 이상");
			}
		}
		if( score >= 90 && score >= 95 ) {
			System.out.println("95 이상");
		}
		
		int x = 3;
		if(x%2 == 0) {
			System.out.println("짝수");			
		} else {
			System.out.println("홀수");			
		}
		
		//랜덤
		double random1 = Math.random();
		System.out.println("random: "+ random1);
		
		// Math.random()
		// 0 <= Math.random() < 1
		// 0 ~ 9.9999999999

		// 0과 1을 구하는
		// 정교한 방식
		// 0*2 <= Math.random()*2 < 1*2
		// 0 ~ 1.9999999999
		// int로 형변환 해서 정수만 남기기
		double rand2 = Math.random(); // 0~0.9999~
		double temp1 = rand2 * 2; // 0~1.9999~
		int result = (int) temp1;
		if(result % 2 == 0) {
			System.out.println("짝수");
		} else {
			System.out.println("홀수");
		}
		
		// 1~6까지 구하기(주사위)
		// 0*6 <= Math.random()*6 < 1*6
		// 0 ~ 5.99999999999999
		// int로 바꾸고
		// +1 하면 1 ~ 6
		rand2 = Math.random();
		double temp2 = rand2 * 6; // 0~5.9999999~
		int result0 = (int) temp2; // 0~5
		result = result0 + 1; // 1~6
		System.out.println("주사위 결과: " + result);
		
		// 5~10까지 구하기
		rand2 = Math.random();
		result = result0 + 5;
		System.out.println("5~10 결과 : " + result);
		
		// 변수로 범위를 잡아서 보편화
		int min = 5;
		int max = 10;
		rand2 = Math.random();
		temp2 = (int) (rand2 * (max - min + 1)) + min;
		
		// 쉬운 방식
		rand2 = Math.random();
		temp2 = rand2 * 100000;
		result0 = (int) temp2;
		result = (result0 % 6) + 1;
		
		
		// 로또 번호
		// 1~45 까지 6개의 숫자로 랜덤으로 뽑아서 제출 하시오
		// 단, 중복 없이
		double lotto1 = Math.random();
		double lotto2 = Math.random();
		double lotto3 = Math.random();
		double lotto4 = Math.random();
		double lotto5 = Math.random();
		double lotto6 = Math.random();
		double lotto7 = lotto1 * 44;
		double lotto8 = lotto2 * 44;
		double lotto9 = lotto3 * 44;
		double lotto10 = lotto4 * 44;
		double lotto11 = lotto5 * 44;
		double lotto12 = lotto6 * 44;
		int lottom1 = (int) lotto7;
		int lottom2 = (int) lotto8;
		int lottom3 = (int) lotto9;
		int lottom4 = (int) lotto10;
		int lottom5 = (int) lotto11;
		int lottom6 = (int) lotto12;
		System.out.println("나의 로또 번호 1: " + (lottom1+1));
		System.out.println("나의 로또 번호 2: " + (lottom2+1));
		System.out.println("나의 로또 번호 3: " + (lottom3+1));
		System.out.println("나의 로또 번호 4: " + (lottom4+1));
		System.out.println("나의 로또 번호 5: " + (lottom5+1));
		System.out.println("나의 로또 번호 6: " + (lottom6+1));
		
		// 임의의 수를 입력받아 
		// 문제1
		// "양수"인지 "0"인지 "음수"인지 판단하여 출력
//		System.out.println("홀짝0 입력칸 :");
//		Scanner scan = new Scanner(System.in);
//		int num = scan.nextInt();
//		if (num==0) {
//			System.out.println("임의의 수는 0");
//		} else if(num > 0) {
//				System.out.println("임의의 수는 양수");
//		} else {
//			System.out.println("임의의 수는 음수");
//		}
		
		// 문제2
		// 홀수인지 짝수인지 판단하여 출력
//		System.out.println("홀짝 입력칸: ");
//		Scanner scan1 = new Scanner(System.in);
//		int num1 = scan1.nextInt();
//		if (num1%2==0) {
//			System.out.println("임의의 수는 짝수");
//		} else {
//			System.out.println("임의의 수는 홀수");
//			}
		
		// 문제3
		// 임의의 두 수 x, y를 받아서
		// 둘 중에 큰 값 출력
//		System.out.println("문제3: 두 가지의 수를 입력하시오.");
//		Scanner scan2 = new Scanner(System.in);
//		Scanner scan3 = new Scanner(System.in);
//		int xx = scan2.nextInt();
//		int yy = scan3.nextInt();
//		if (xx > yy) {
//			System.out.println(xx +"와" + yy + "중 큰 수는: "+ xx);
//		} else if (xx < yy) {
//			System.out.println(xx +"와" + yy + "중 큰 수는: "+ yy);
//		} else {
//			System.out.println(xx +"와" + yy + "는 같은 수");
//		}
		
		// 문제4
		// 임의의 money를 입력 받아서
		// 7000원 이상이면 "택시타자" 출력
		// 7000~3000 사이면 "버스타자" 출력
		// 3000 미만이면 "걸어가자" 출력
//		System.out.println("문제4: 임의의 금액을 입력하시오.");
//		Scanner scan4 = new Scanner(System.in);
//		int money = scan4.nextInt();
//		if (money >= 7000) {
//			System.out.println("지금 니 돈으로는 택시가능");
//		} else if (7000 > money && money >= 3000) {
//			System.out.println("지금 니 돈으로는 버스가능");
//		} else {
//			System.out.println("컵라면 먹어야지 걸어가라");
//		}
		
		// 문제5
		// '가위', '바위', '보' 입력 받아서 
		// 5-1 컴퓨터는 항상 '바위'만 낼 경우
//		System.out.println("가위 바위 보 한판하실? 나는 남자니까 바위만 낼게");
//		Scanner scan5 = new Scanner(System.in);
//		String game = scan5.nextLine();
//		String gawi = "가위";
//		String bawi = "바위";
//		String bo = "보";
//		if (gawi.equals(game)) {
//			System.out.println("컴이 낸것: " + bawi + ", 니가 낸것: " + gawi + ", 결과는: 졌다 사람이냐?");
//		} else if (bawi.equals(game)) {
//			System.out.println("컴이 낸것: " + bawi + ", 니가 낸것: " + bawi + ", 결과는: 비겼다 돌대가리야");
//		} else if (bo.equals(game)) {
//			System.out.println("컴이 낸것: " + bawi + ", 니가 낸것: " + bo + ", 결과는: 이겼다 정상이군");
//		} else {
//			System.out.println("잘못 내셨어요");
//		}
		
		
		// 5-2 컴퓨터도 랜덤으로 
		// '이겼다', '비겼다', '졌다' 출력
		// 컴터가 뭐냈는지도
//	System.out.println("가위 바위 보 한판하실? 이번이 찐임");
//		Scanner scan6 = new Scanner(System.in); // 스캔 선언
//		String huma = scan6.nextLine(); // 사람 입력
//		
//		
//		double ranc = Math.random(); // 컴퓨터 랜덤 0~0.99999
//		double com = ranc * 3; // 0~2.99999
//		int luckc = (int)com; // 0, 1, 2 로 바꿈
////		Scanner scan7 = new Scanner(System.in);
////		double ranh = Math.random();
////		double hum = ranh * 3;
////		int luckh = (int)hum;
//		
//		String coma; // 컴퓨터가 낼 것 변수 선언
//		if(luckc == 0) { // 0일때 가위로
//			coma="가위"; 
//		} else if(luckc == 1) { // 1일때 바위로
//			coma="바위";
//		} else {coma="보";} // 그 외
//		
//		System.out.print("내가 낸 것: " + huma + ", 컴퓨터가 낸 것: " + coma); // 낸 것 출력
//		
//		if(huma.equals(coma)) { // 컴퓨터와 입력값이 똑같을 때 비겼다 출력
//			System.out.println(", 결과: 비겼다");
//		} else if (huma.equals("가위")&&(coma.equals("보")) // 내가 이길 수 있는 경우의 수 다적음
//					|| huma.equals("바위")&&(coma.equals("가위")) // && <= 그리고로 묶어줌
//					|| huma.equals("보")&&(coma.equals("바위"))) {
//			System.out.println(", 결과: 이겼다");
//		} else if (huma.equals("가위")&&(coma.equals("바위")) // 내가 질 수 있는 경우의 수 다적음
//					|| huma.equals("바위")&&(coma.equals("보")) 
//					|| huma.equals("보")&&(coma.equals("가위"))) {
//			System.out.println(", 결과: 졌다");
//		} else {System.out.println(", 결과: 다시 입력해 주세요.");} // 나머지 모든경우를 오타로 인식하게
//	

		
		// 문제6
        // 임의 세 수 x, y, z를 받아서
        // z가 x~y 사이에 있는지(포함) 판단
		
		//-------------------xyz입력창 출력-----------------------
//		System.out.println("x값:");
//		System.out.println("y값:");
//		System.out.println("z값:");
//		//---------------------------------------------------------
//		
//		//----------------xyz 변수 scan으로--------------------
//		Scanner xscan = new Scanner(System.in);
//		Scanner yscan = new Scanner(System.in);
//		Scanner zscan = new Scanner(System.in);
//		int x0 = xscan.nextInt();
//		int y0 = yscan.nextInt();
//		int z0 = zscan.nextInt();
//		//-----------------------------------------------------
//		
//		
//		//-------------------if 구문-------------------------------
//		if ((x0 >= z0 && z0 >= y0)||(y0 >= z0 && z0 >= x0)) {
//			System.out.println("z는 x와 y사이에 존재함");
////		if (x0 > y0) { // x0 > y0 일때 무조건 들어와버림 조건 잘못설정함
////			System.out.println((x0 >= z0 && z0 >= y0)+" z는 x와 y사이에 존재함");
////		} else if (y0 > x0) { // 이것도 조건 잘못 설정함
////			System.out.println((y0 >= z0 && z0 >= x0)+" z는 y와 x사이에 존재함");
//		} else {System.out.println(" z는 x와 y사이에 존재하지 않음");}				
		//---------------------------------------------------------
        
        // 문제7
        // 月을 입력 받아서
        // 계절 출력
        // 13, -1등 입력하면 "정확히 입력해주세요" 출력
		
//		//------------------월입력창--------------------------------
//		System.out.println("월을 입력하세요");
//		//----------------------------------------------------------
//		//------------------스캔,변수-------------------------------
//		Scanner month = new Scanner(System.in);
//		int imonth = month.nextInt();
//		//----------------------------------------------------------
//		//-------------------if 구문--------------------------------
//		if ((2 >= imonth && imonth >= 1) || (12 >= imonth && imonth >= 11)) {
//			System.out.println(imonth + "월" + ", 계절은: 겨울입니다");
//		} else if (5 >= imonth && imonth >= 3) {
//			System.out.println(imonth + "월" + ", 계절은: 봄입니다");
//		} else if (8 >= imonth && imonth >= 6) {
//		System.out.println(imonth + "월" + ", 계절은: 여름입니다");
//		} else if (10 >= imonth && imonth >= 9) {
//		System.out.println(imonth + "월" + ", 계절은: 가을입니다");
//		} else {System.out.println("정확히 입력해주세요");}
//		//----------------------------------------------------------
//		
        
        // 문제8
        // 임의의 수를 입력받아서 다음과 같이 출력
        // 예 : 125
        // 입력한 수는 100보다 크고, 양수이고, 홀수입니다.
		//-----------------출력----------------------
		System.out.println("문제8번 임의의 수 입력하시오");
		//-------------------------------------------
		//-----------------스캔-----------------------
		Scanner num8 = new Scanner(System.in);
		int num81 = num8.nextInt();
		//--------------------------------------------
		//-----------------if-------------------------
		if (num81 > 100 && num81 >0 && num81%2 == 1) {
			System.out.println("입력한 수는 100보다 크고, 양수이고, 홀수입니다");
		} else if (num81 > 100 && num81 > 0 && num81%2 == 0) {
			System.out.println("입력한 수는 100보다 크고, 양수이고, 짝수입니다");
		} else if (num81 < 100 && num81 >= 0 && num81%2 == 0) {
			System.out.println("입력한 수는 100보다 작고, 양수이고, 짝수입니다");
		} else if (num81 < 100 && num81 > 0 && num81%2 == 1) {
			System.out.println("입력한 수는 100보다 작고, 양수이고, 홀수입니다");
		} else if (num81 < 100 && num81 < 0 && num81%-2 == 1) {
			System.out.println("입력한 수는 100보다 작고, 음수이고, 홀수입니다");
		} else {System.out.println("입력한 수는 100보다 작고, 음수이고, 짝수입니다");}
		//---------------------------------------------
		
        
        // 문제9
        // 온도를 입력받아서 다음과 같이 출력
        // 예 : -3
        // 영하 3도 입니다
        // 예 : 5
        // 영상 5도 입니다
        
        // 응용문제
        // 문제10
        // 시, 분을 입력 받아서 35분 후의 시, 분을 출력
        // 3, 51을 입력받으면
        // 4시 26분 출력
        
        // 문제11
        // 두자리 숫자를 입력받아서
        // 10의 자리와 1의 자리가 같은지 판단
        // 예 : 77 => 같음, 94 => 다름
        
        // 문제12
        // 1~99까지 369게임
        // 임의의 수를 받아서 3,6,9 숫자가 있으면 "박수" 출력
        // 없으면 그 숫자 그대로 출력
        // 예 : 33 => 박수, 31 => 박수, 12 => 12, 14 => 14
        
        // 문제13
        // 사각형의 한쪽 모서리 : x1:10, y1:20
        // 반대편 모서리 : x2:90, y2:100
        // 입력받은 두 수를 좌표로 하는 점이 사각형에 겹치는가
		
		
	}

}
