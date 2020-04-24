package telephone;

public class Test {

	public static void main(String[] args) {
		MobilePhone Nokia = new MobilePhone();
		//Nokia.call("mike");
		
		
		MobilePhone iphoneX = new iPhone("13.5");
		
		MobilePhone android = new GooglePhone("Pie");
		android.call("Smith");
		 
	}

}
