package forward;

import java.util.List;

public class EmpService {

	public List getList(){
		EmpDAO empDAO = new EmpDAO();
		List list = empDAO.selectAll();
		
		return list;
	}
	
}
