package sec02_1;

public class ChinaExam {

	public static void main(String[] args) {
		
		China china1 = new China();
		China china2 = new China();
		
		String adress1;
		china1.address = "서울점";
		china2.address = "부산점";
		china2.menus[0] = "탕수육";
		china2.menus[1] = "잡채밥";
		
		System.out.println("상호명: "+ china1.name+ " 1호점");
		System.out.println("주소: "+ china1.address);
		System.out.println("메뉴: ");
		for(int i=0; i<china1.menus.length; i++) {
			if(i == china1.menus.length-1) {
				System.out.println(china1.menus[i]);
			} else {
				System.out.print(china1.menus[i]+ ", ");				
			}
		}
		
		System.out.println("");
		System.out.println("상호명: "+ china2.name+ " 2호점");
		System.out.println("주소: "+ china2.address);
		System.out.println("메뉴: ");
		for(int i=0; i<china2.menus.length; i++) {
			if(i == china2.menus.length-1) {
				System.out.println(china2.menus[i]);
			} else {
				System.out.print(china2.menus[i]+ ", ");				
			}
		}

	}

}
