package coupang.DTO;

public class ItemsDTO {
	private int items_seq;
	private String items_name;
	private int items_price;
	private String items_company;
	
	public int getItems_seq() {
		return items_seq;
	}
	public void setItems_seq(int items_seq) {
		this.items_seq = items_seq;
	}
	public String getItems_name() {
		return items_name;
	}
	public void setItems_name(String items_name) {
		this.items_name = items_name;
	}
	public int getItems_price() {
		return items_price;
	}
	public void setItems_price(int items_price) {
		this.items_price = items_price;
	}
	public String getItems_company() {
		return items_company;
	}
	public void setItems_company(String items_company) {
		this.items_company = items_company;
	}
	
	@Override
	public String toString() {
		return "ItemsDTO [items_seq=" + items_seq + ", items_name=" + items_name + ", items_price=" + items_price
				+ ", items_company=" + items_company + "]";
	}
	
	

}
