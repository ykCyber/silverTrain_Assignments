package assignment14.Question14;

public class OnSaleItem extends Item {
	private double discount;

	public OnSaleItem(String name, int catalogNumber, int quantity, double price, double discount) {

		super(name, catalogNumber, quantity, price);

		if (discount > 100) {
			this.discount = 100;
		} else if (discount < 0) {
			discount = 0;
		} else
		this.discount=discount;
		this.setPrice(getPrice() - getPrice() * this.discount / 100);
	}

	@Override
	public String toString() {

		StringBuilder builder = new StringBuilder();
		builder.append("OnSaleItem {discount=");
		builder.append(discount);
		builder.append("%, name=");
		builder.append(getName());
		builder.append(", price=");
		builder.append(getPrice() + "}");
		return builder.toString();
	}

	public double getDiscount() {
		return discount;
	}

}
