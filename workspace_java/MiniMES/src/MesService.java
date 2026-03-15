import java.util.ArrayList;

public class MesService {
	
	int orderNo;
	
	ArrayList workOrder;

	Material body = new Material("BODY", 30);
	Material lid = new Material("LID", 30);
	Material straw = new Material("STRAW", 20);
	Material box = new Material("BOX", 40);
	
	Product basicGrade = new Product(1, "BASIC 텀블러", 1, 1, 0, 1, 0);
	Product premiumGrade = new Product(2, "PREMIUM 텀블러", 1, 1, 0, 1, 0);
	Product strawGrade = new Product(3, "STRAW 텀블러", 1, 1, 1, 1, 0);
	
//	WorkOrder wo = new WorkOrder(0, 0, null, 0);
	
	void addOrder() {
		orderNo++;
		
		WorkOrder workOrder = new WorkOrder(orderNo, orderNo, null, orderNo);
	}
	
	
}
