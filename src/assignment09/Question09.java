package assignment09;

public class Question09 {

	public static void main(String[] args) {
		swapFirstNameLastName("miketyson@gmail.com");
		swapFirstNameLastName("mike_tyson@gmail.com");
	}

	public static void swapFirstNameLastName(String string) {
		int split = string.indexOf('@');
		String []arr1 =new String[2];
		String []arr2=new String[2];
		arr1 = string.split("@");
		String swaped ="";
		if(string.substring(0,split).contains("_")) {
			arr2=arr1[0].split("_");
			swaped = arr2[1]+"_"+arr2[0];
		System.out.println(swaped+"@"+arr1[1]);
		}else System.out.println(string);
		
	}

}
