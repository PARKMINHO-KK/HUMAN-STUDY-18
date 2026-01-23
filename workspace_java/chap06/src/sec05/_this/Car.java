package sec05._this;

public class Car {

	String model;
	

	void setModel(String model) {
//		String model;
//		model = model;

//		int a = 10;
//		a = a;
		
		// this
		// new 된 나를 뜻한다
		this.model = model;
	}
	
	Car(String model){
		this.model = model;
	}
	
}
