package coupang.DTO;

public class CartDTO {
	private int cart_seq;
	private int cart_total;
	
	public int getCart_seq() {
		return cart_seq;
	}
	public void setCart_seq(int cart_seq) {
		this.cart_seq = cart_seq;
	}
	public int getCart_total() {
		return cart_total;
	}
	public void setCart_total(int cart_total) {
		this.cart_total = cart_total;
	}
	
	@Override
	public String toString() {
		return "CartDTO [cart_seq=" + cart_seq + ", cart_total=" + cart_total + "]";
	}
	
	
}
