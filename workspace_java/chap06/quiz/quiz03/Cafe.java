package quiz03;

public class Cafe {

	String name;
	double cost;
	String menu1; // = "아아";
	String menu2; // = "따아";
	
	
	Cafe(String name, double cost){ // 생성자
		if(cost <= 0 || cost > 40) {
			System.out.println("다시 입력해 주세요(금액 : 억원)");
			return;
		} 
		this.name = name;
		this.cost = cost;
		this.menu1 = "아아";
		this.menu2 = "따아";
		
		System.out.println("상호명 : "+ name);
		System.out.println("필요자본금 : "+ cost + " 억원");
		System.out.println("메뉴1 : "+ menu1);
		System.out.println("메뉴2 : "+ menu2);		
		System.out.println("");
	}
	
	
	
}
