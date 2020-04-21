package assignment14.Question14;

import java.util.ArrayList;
import java.util.List;

public class TJMAxx {
	private List<Item> regularItems = new ArrayList<Item>();
	private List<OnSaleItem> onSaleItems = new ArrayList<OnSaleItem>();

	public void setRegularItems(List<Item> regularItems) {
		this.regularItems = regularItems;
	}

	public void setOnSaleItems(List<OnSaleItem> onSaleItems) {
		this.onSaleItems = onSaleItems;
	}

	public List<Item> getRegularItems() {
		return regularItems;
	}

	public List<OnSaleItem> getOnSaleItems() {
		return onSaleItems;
	}

	public void addRegularItem(Item item) {
		this.regularItems.add(item);
	}

	public void addOnSaleItem(OnSaleItem onSaleItem) {
		this.onSaleItems.add(onSaleItem);
	}

	public int getCountOfRegulerItems() {
		return this.getRegularItems().size();
	}

	public int getCountOfOnsaleItems() {
		return this.getOnSaleItems().size();
	}

	public List<String> getAllItemNames() {
		List<String> nameList = new ArrayList<String>();
		for (int i = 0; i < this.getOnSaleItems().size(); i++) {
			nameList.add(this.getOnSaleItems().get(i).getName());
		}
		for (int i = 0; i < this.getRegularItems().size(); i++) {
			nameList.add(this.getRegularItems().get(i).getName().toString());
		}
		return nameList;
	}

	public double getItemPrice(int catalogNumber) {
		for (int i = 0; i < this.getOnSaleItems().size(); i++) {
			if (this.getOnSaleItems().get(i).getCatalogNumber() == catalogNumber) {
				return this.getOnSaleItems().get(i).getPrice();
			}
		}
		for (int i = 0; i < this.getRegularItems().size(); i++) {
			if (this.getRegularItems().get(i).getCatalogNumber() == catalogNumber) {
				return this.getRegularItems().get(i).getPrice();
			}
		}
		return 0;
	}

	public Item getItem(int catalogNumber) {
		for (int i = 0; i < this.getOnSaleItems().size(); i++) {
			if (this.getOnSaleItems().get(i).getCatalogNumber() == catalogNumber) {
				return (OnSaleItem) this.getOnSaleItems().get(i);
			}
		}
		for (int i = 0; i < this.getRegularItems().size(); i++) {
			if (this.getRegularItems().get(i).getCatalogNumber() == catalogNumber) {
				return (Item) this.getRegularItems().get(i);
			}
		}
		return null;
	}

	public OnSaleItem getOnSaleItem(String name) {
		int searchNum = -1;
		for (int i = 0; i < this.getCountOfOnsaleItems(); i++) {
			if (name == this.getOnSaleItems().get(i).getName()) {
				searchNum = i;
				break;
			}
		}
		if (searchNum == -1) {
			System.err.println("no such element found :" + name);
			System.exit(0);
		}
		return this.getOnSaleItems().get(searchNum);
	}

	public void removeItem(int catalogNumber) {
		int indexOfonSale = this.onSaleItems.indexOf(this.getItem(catalogNumber));
		int indexOfRegulerItem = this.regularItems.indexOf(this.getItem(catalogNumber));
		if (indexOfonSale > -1) {
			this.onSaleItems.remove(indexOfonSale);
		}
		if (indexOfRegulerItem > -1) {

			this.regularItems.remove(indexOfRegulerItem);
		}
	}

	public void buyItem(int catalogNumber) {
		this.getItem(catalogNumber).setQuantity(this.getItem(catalogNumber).getQuantity() - 1);
		if (this.getItem(catalogNumber).getQuantity() == 0) {
			this.removeItem(catalogNumber);
		}
	}
}
