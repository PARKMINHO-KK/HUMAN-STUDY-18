package coupang.DTO;

import java.sql.Date;

public class UserDTO {
	private int user_seq;
	private String user_id;
	private String user_pw;
	private String user_name;
	private String user_phone;
	
	public int getUser_seq() {
		return user_seq;
	}
	public void setUser_seq(int user_seq) {
		this.user_seq = user_seq;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getUser_pw() {
		return user_pw;
	}
	public void setUser_pw(String user_pw) {
		this.user_pw = user_pw;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getUser_phone() {
		return user_phone;
	}
	public void setUser_phone(String user_phone) {
		this.user_phone = user_phone;
	}
	
	@Override
	public String toString() {
		return "UserDTO [user_seq=" + user_seq + ", user_id=" + user_id + ", user_pw=" + user_pw + ", user_name="
				+ user_name + ", user_phone=" + user_phone + "]";
	}
	
	
	
}
