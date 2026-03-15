
public class Material {
//
//	int body = 30;
//	int lid = 30;
//	int straw = 20;
//	int box = 40;
//	
//	void addMaterial(int body, int lid, int straw, int box) {
//		this.body += body;
//		this.lid += lid;
//		this.straw += straw;
//		this.box += box;
//	}
//	
//	void useMaterial(int body, int lid, int straw, int box) {
//		this.body -= body;
//		this.lid -= lid;
//		this.straw -= straw;
//		this.box -= box;
//	}
//	
//	void printInfo() {
//		System.out.println("자재재고현황");
//		System.out.println("바디: "+ body +"EA");
//		System.out.println("뚜껑: "+ lid +"EA");
//		System.out.println("빨대: "+ straw +"EA");
//		System.out.println("박스: "+ box +"EA");
//	}
	
	String name;
	int stock;
	
	Material(String name, int stock){
		this.name = name;
		this.stock = stock;
	}
	
	void addStock(int amount) {
		this.stock += amount;
	}
	
	void useStock(int amount) {
		this.stock -= amount;
	}
	
	void printInfo() {
		System.out.println("자재명: "+ name);
		System.out.println("재고: "+ stock);
	}
}
