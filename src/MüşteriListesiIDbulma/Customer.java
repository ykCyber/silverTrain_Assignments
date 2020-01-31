package MüþteriListesiIDbulma;

public class Customer {
	//müþterinin id,telno isim soy isimi var
	public int id;
	public int phoneNumber;
	public String name;
	public String surname;

	public static void main(String[] args) {
		//bir müþteri listesi oluþturdum 
		Customer[] list = new Customer[4];
		for (int i = 0; i < list.length; i++) {
			list[i] = new Customer();
		}
		list[1].setDatas(11, 11111, "ali", "can");
		list[2].setDatas(22, 222, "veli", "tan");
		list[3].setDatas(33, 333, "ayþe", "þan");
		
		///bir for döngüsünün içine find costumer ( telefonNumarasý ve isim yazýyorm bana idsini söylüyro)
		for (int i = 0; i < list.length; i++) {

			findIdOfCustomer(list[i], 333, "ayþe");
		}
	}

	public static void findIdOfCustomer(Customer i, int phoneNumber2, String isim) {
		if (i.phoneNumber == phoneNumber2 && i.name.equalsIgnoreCase(isim)) {
			System.out.println("Name " + i.name);
			System.out.println("id " + i.id);
		}
	}

	public static void findIdOfCustomer(int phoneNumber) {
		// over load edip farklý parametrelerlede
		// bana hangi müþteri olduðunu söylesin
	}

	public void setDatas(int ID, int PHONE, String NAME, String SURNAME) {
		this.id = ID;
		this.phoneNumber = PHONE;
		this.name = NAME;
		this.surname = SURNAME;
	}
}
