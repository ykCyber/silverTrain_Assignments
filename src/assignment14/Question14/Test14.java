package assignment14.Question14;

import java.util.List;

public class Test14 {

	public static void main(String[] args) {
		TJMAxx tjmAxx = new TJMAxx();
	
		Item it2 = new Item("Phone", 2, 20, 200);
		Item it3 = new Item("Hat", 3, 20, 30);
		Item it4 = new Item("laptop", 4, 20, 40);
		Item it5 = new Item("computer", 5, 20, 50);
		Item it6 = new Item("camera", 6, 20, 60);
		Item osi1 = new OnSaleItem("pencil", 7, 20, 35.5, -100);
		Item osi2 = new OnSaleItem("pen", 8, 20, 35.5, 88);
		Item osi3 = new OnSaleItem("book", 9, 20, 35.5, 10);
		OnSaleItem osi4 = new OnSaleItem("bag", 10, 20, 35.5, 10);
		OnSaleItem osi5 = new OnSaleItem("note", 11, 20, 355, 50);
		OnSaleItem osi6 = new OnSaleItem("knife", 12, 20, 355, 50);
		tjmAxx.addRegularItem(new Item("Watch", 1, 2, 100));
		tjmAxx.addRegularItem(new Item("Watch", 1, 2, 100));
		tjmAxx.addRegularItem(it3);
		tjmAxx.addRegularItem(it4);
		tjmAxx.addRegularItem(it5);
		tjmAxx.addRegularItem(it6);
		tjmAxx.addOnSaleItem((OnSaleItem) osi1);
		tjmAxx.addOnSaleItem((OnSaleItem) osi2);
		tjmAxx.addOnSaleItem((OnSaleItem) osi3);
		tjmAxx.addOnSaleItem(osi4);
		tjmAxx.addOnSaleItem(osi5);
		tjmAxx.addOnSaleItem(osi6);
	//	System.out.println(tjmAxx.getItem(1).getName());
		tjmAxx.addRegularItem("car", 55, 5, 100);
		System.out.println(tjmAxx.getItem(55).getName());
//		System.out.println("find by name " + tjmAxx.getOnSaleItem("pencil").getCatalogNumber());
//		System.out.println("find by name " + tjmAxx.getOnSaleItem("pencil").getQuantity());
//		for (int i = 0; i < 25; i++) {
//			tjmAxx.buyItem(7);
//			System.out.println("find by name " + tjmAxx.getOnSaleItem("pencil").getQuantity());
//			
		}
//		System.out.println(osi5.getCatalogNumber());
//		System.out.println(tjmAxx.getItem(11).toString());
//		System.out.println(tjmAxx.onSaleItems.indexOf(tjmAxx.getItem(2)));
//		System.out.println(tjmAxx.getAllItemNames());
//		System.out.println(tjmAxx.getAllItemNames());
//		tjmAxx.removeItem(6);
//		System.out.println(tjmAxx.getAllItemNames());
//		tjmAxx.removeItem(11);
//		System.out.println(tjmAxx.getAllItemNames());
//		tjmAxx.buyItem(1);
//		tjmAxx.buyItem(1);
//		System.out.println(tjmAxx.getAllItemNames());
	}


