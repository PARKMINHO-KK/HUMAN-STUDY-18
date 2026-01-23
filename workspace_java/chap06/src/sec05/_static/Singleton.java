package sec05._static;

public class Singleton {

////	Singleton singleton = null;
//	static Singleton singleton = null;
//	
////	Singleton get() {
//	static Singleton get() {
//		if(singleton == null) {
//			singleton = new Singleton();
//		}
//		
//		return singleton;
//	}
	
	static Singleton singleton = new Singleton();
	
	private Singleton() { }
	
	static Singleton get() {
		
		System.out.printf("%d, %d, %d", 1,2,3);
		
		return singleton;
	}
	
	
}
