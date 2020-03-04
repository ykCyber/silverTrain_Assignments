package assignment10;

public class Question23_Sandwich {

	public static void main(String[] args) {
		System.out.println(isSandwich("xxbreadjamyy"));
		System.out.println(isSandwich("xxbreadjamyybreadyy"));
	}

	public static String isSandwich(String string) {
		String ingrent="nothing";
		if((string.length()-string.replace("bread","").length())/5==2) {
			String arr[]=string.split("bread");
			ingrent=arr[1];
		}
		return ingrent;
	}

}
