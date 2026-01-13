package chap05;

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
		
		int[] qq2 = new int[3];
//		for(int i=0; i<qq2.length; i++) {
//			qq2[i] = q2[i];
//			System.out.println("문제2: qq2["+ i +"] => "+  qq2[i]);
//		}
		System.out.println("------------------------------");
		
		// 문제3
		// 7,12,8을 순서대로 저장한 배열이 있을 때
		// 다른 배열에 거꾸로 8, 12, 7로 저장되게 
		for(int i=0; i<qq2.length; i++) {
			qq2[(qq2.length)-1-i] = q2[i];
			//qq2[2] = q2[0]
			//qq2[1] = q2[1]
			//qq2[0] = q2[2]
		}
		for(int i=0; i<qq2.length; i++) {
			System.out.println("문제3: qq2["+ i +"] => "+  qq2[i]);
		}
		
		// 문제4
		// {3, 4, 7, 5, 1, 4, 6}
		// 4-1. 위 배열에서 홀수의 개수 구하기
		// 4-2. 4보다 큰 수의 개수 구하기
		int[] q4 = {3, 4, 7, 5, 1, 4, 6};
		int count = 0;
		for(int i=0; i<q4.length; i++) { // 문제 4-1
			if((q4[i]+2)%2 == 1) {
				count++;
			}
		}
		System.out.println("문제4-1: "+count);
		
		count = 0;
		for(int i=0; i<q4.length; i++) { // 문제 4-2
			if(q4[i] > 4) {
				count++;
			}
		}
		System.out.println("문제4-2: "+count);
		
		
		// ---- 응용문제----
		// 문제5
		/*
		 * 마라톤에 5명의 선수사 참여했음
		 * 선수들은 1번부터 5번까지 등번호를 부여받음
		 * 대회가 끝났을 때 완주하지 못한 선수가 1명 있다
		 * 그 선수를 찾으시오
		 * 완주 목록 {2, 4, 5, 1}
		 */
		
		int[] input = {1,2,3,4,5};
		int[] finish = {2,4,5,1};
		
		while () {}
		
//		for(int i=0; i<input.length; i++) {
//			for(int j=0; j<finish.length; j++) {
//				if(input[i] == finish[j]) {
//					input[i] = 0;					
//				} else if(input[i] != 0){
//					System.out.println("완주 실패 선수: "+ input[i] + "번");
//				}
//			}
//		}
//			if(input[i] != finish[i]) {
//				System.out.println("완주 실패 선수: "+ input[i] + "번");
//			}
//		}
		
		
		// 문제6
		// {3, 4, 7, 5, 1, 4, 6}
		// 여기서 가장 큰 수 찾기
		int[] num7 = {3, 4, 7, 5, 1, 4, 6};
		for(int i=0; i<num7.length; i++) {
			for(int j=0; j<num7.length; j++) {
				if(num7[i]>num7[j]) {					
					System.out.println(num7[i]>num7[j]);
				}
			}
		}
		
		
	}

}
