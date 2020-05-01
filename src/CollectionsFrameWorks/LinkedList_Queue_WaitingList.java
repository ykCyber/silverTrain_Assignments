package CollectionsFrameWorks;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.SortedSet;
import java.util.TreeSet;

public class LinkedList_Queue_WaitingList {
	public static void main(String[] args) {
		// Bekleme listesi olusturalim

		Queue<String> beklemeListesi = new LinkedList<>();
		beklemeListesi.add("Ali");
		beklemeListesi.add("Veli");
		beklemeListesi.add("Cedric");
		beklemeListesi.add("Ken");
		beklemeListesi.add("Can");
		beklemeListesi.add("Canan");
		for (String bekleyenler : beklemeListesi) {
			System.out.println("bekleyenler = " + bekleyenler);
		}
		System.out.println("Ilk Sirada ki = " + beklemeListesi.element());
		System.out.println("Ilk Sirada ki = " + beklemeListesi.element());
		System.out.println("Ilk Sirada ki = " + beklemeListesi.element());
		System.out.println("Ilk Sirada ki = " + beklemeListesi.element());
		System.out.println("Ilk Sirada ki = " + beklemeListesi.element());
		System.out.println("Ilk Sirada ki = " + beklemeListesi.element());
		System.out.println("beklemeListesi.poll() = " + beklemeListesi.poll());
		System.out.println("beklemeListesi.element() = " + beklemeListesi.element());
		System.out.println("beklemeListesi.poll() = " + beklemeListesi.poll());
		System.out.println("beklemeListesi.element() = " + beklemeListesi.element());
		System.out.println("beklemeListesi.poll() = " + beklemeListesi.poll());
		System.out.println("beklemeListesi.element() = " + beklemeListesi.element());
		System.out.println("beklemeListesi.poll() = " + beklemeListesi.poll());
		System.out.println("beklemeListesi.element() = " + beklemeListesi.element());
		System.out.println("beklemeListesi.poll() = " + beklemeListesi.poll());
		System.out.println("beklemeListesi.element() = " + beklemeListesi.remove());
		System.out.println("beklemeListesi.poll() = " + beklemeListesi.poll());
		System.out.println("beklemeListesi.element() = " + beklemeListesi.poll());
		System.out.println("beklemeListesi.poll() = " + beklemeListesi.poll());
		
		beklemeListesi.add("canan");
		beklemeListesi.add("ali");
		beklemeListesi.add("bercan");
		beklemeListesi.add("dercan");
		beklemeListesi.add("alfa");
	
		
		SortedSet<String> ss = new TreeSet<String>();
		
		ss.addAll(beklemeListesi);
		for (String string : ss) {
			
			System.out.println("string = " + string);

		}
		
		System.out.println("ss = " + ss.contains("caan"));

		
		
		// hepsi ayni sadece element hata veriyor eger liste bos ise digerleri null
		// donderiyor

	}
}
