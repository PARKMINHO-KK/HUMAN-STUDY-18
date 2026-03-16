import java.util.ArrayList;
import java.util.List;

public class MesService {
	
	int orderNo;
	
	List workOrderList = new ArrayList();

	Material body = new Material("BODY", 30);
	Material lid = new Material("LID", 30);
	Material straw = new Material("STRAW", 20);
	Material box = new Material("BOX", 40);
	
	Product basicGrade = new Product(1, "BASIC 텀블러", 1, 1, 0, 1, 0);
	Product premiumGrade = new Product(2, "PREMIUM 텀블러", 1, 1, 0, 1, 0);
	Product strawGrade = new Product(3, "STRAW 텀블러", 1, 1, 1, 1, 0);
	
//	WorkOrder wo = new WorkOrder(0, 0, null, 0);
	
	void addOrder(int pNo, String pName, int orderAmount) {
		orderNo++;
		
		WorkOrder workOrder = new WorkOrder(orderNo, pNo, pName, orderAmount);
		workOrderList.add(workOrder);
		
	}
	
	
}
