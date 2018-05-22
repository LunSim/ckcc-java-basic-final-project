package cart;

public class Product {

	private String id;
	private String name;
	private String description;
	private double price;
	private double qtyInStock;
	
	public Product(String id, String name, String description, double price, double qtyInStock) {
		this.id = id;
		this.name = name;
		this.description = description;
		this.price = price;
		this.qtyInStock = qtyInStock;
	}
	
	public double getPrice() {
		return this.price;
	}
	
	public String getName() {
		return this.name;
	}
	
	public double getQtyInStock() {
		return this.qtyInStock;
	}
	
	public boolean isValidStock(double qty) {
		if(qty > this.qtyInStock) return false;
		return true;
	}
	
	public String toString() {
		return "[" + this.id + "\t'" + this.name + "'\t" + this.price + "\t" + this.qtyInStock + "\t'" + this.description + "']" + "\n"; 
	}
	
}
