package challange.vending;

public class Product {
	public Product(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	private int price;
}
