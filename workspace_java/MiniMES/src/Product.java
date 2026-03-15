
public class Product {

	int pNo;
	String pName;
	int bodyReq;
	int lidReq;
	int strawReq;
	int boxReq;
	int pStock;
	
	Product(int pNo, String pName, int bodyReq, int lidReq, int strawReq, int boxReq, int pStock){
		this.pNo = pNo;
		this.pName = pName;
		this.bodyReq = bodyReq;
		this.lidReq = lidReq;
		this.strawReq = strawReq;
		this.boxReq = boxReq;
		this.pStock = pStock;
	}
	
	void printInfo() {
			System.out.println("제품번호: "+ pNo);
			System.out.println("제품명: "+ pName);			
			System.out.println("BODY 필요수량: "+ bodyReq);			
			System.out.println("LID 필요수량: "+ lidReq);			
			System.out.println("STRAW 필요수량: "+ strawReq);			
			System.out.println("BOX 필요수량: "+ boxReq);			
			System.out.println("재고: "+ pStock);			
	}
	
	void addStock(int add) {
		pStock += add;
	}
	
}
