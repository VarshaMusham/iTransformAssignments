package cg.lamda.a2;

public class Order {
	
	int id;
	double price;
	String status;
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Order(int id, double price, String status) {
		super();
		this.id = id;
		this.price = price;
		this.status = status;
	}
	@Override
	public String toString() {
		return "Order [id=" + id + ", price=" + price + ", status=" + status + "]";
	}
	
	

}
