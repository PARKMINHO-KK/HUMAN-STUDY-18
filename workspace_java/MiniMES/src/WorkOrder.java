
public class WorkOrder {

	int orderNo;
	int pNo;
	String pName;
	int orderAmount;
	int passAmount;
	int failAmount;
	String orderStatus = "대기";
	
	WorkOrder(int orderNo, int pNo, String pName, int orderAmount){
		this.orderNo = orderNo;
		this.pNo = pNo;
		this.pName = pName;
		this.orderAmount = orderAmount;
	}
	
	void printInfo(){
		System.out.println("생산지시정보");
		System.out.println("생산지시번호: "+ orderNo);
		System.out.println("제품번호: "+ pNo);
		System.out.println("제품명: "+ pName);		
		System.out.println("생산지시량: "+ orderAmount);
		System.out.println("양품수량: "+ passAmount);
		System.out.println("불량수량: "+ failAmount);
		System.out.println("상태: "+ orderStatus);
	}
	
}
