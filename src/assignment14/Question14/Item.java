package assignment14.Question14;

public class Item {
	private String name;
	private int catalogNumber;
	private int quantity;
	private double price;
	public Item(String name, int catalogNumber, int quantity, double price) {
		super();
		
		this.name = name;
		this.catalogNumber = catalogNumber;
		this.quantity = getQuantity();
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getCatalogNumber() {
		return catalogNumber;
	}
	public void setCatalogNumber(int catalogNumber) {
		this.catalogNumber = catalogNumber;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder("Regular Item ");
		builder.append("{name= '");
		builder.append(name);
		builder.append("', catalogNumber=");
		builder.append(catalogNumber);
		builder.append(", quantity=");
		builder.append(quantity);
		builder.append(", price=");
		builder.append(price);
		builder.append("}");
		return builder.toString();
	}
}
