package coupang.service;

import coupang.DAO.CoupangDAO;
import coupang.DTO.UserDTO;

public class CoupangService {
	public int insertUser(UserDTO userDTO) {
		CoupangDAO coupangDAO = new CoupangDAO();
		int result = coupangDAO.insertUser(userDTO);
		return result;
	}
	
	public boolean checkLogin(UserDTO userDTO) {
		CoupangDAO coupangDAO = new CoupangDAO();
		boolean result = coupangDAO.checkLogin(userDTO);
		return result;
	}
	
}
