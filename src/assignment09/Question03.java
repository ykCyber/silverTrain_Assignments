package assignment09;

public class Question03 {

	public static void main(String[] args) {
		String word= "ab c*8/-9*d ek";
		manupilation(word);
		
	}

	public static void manupilation(String word) {
		if(word.length()==1) {
			System.out.println(word.repeat(3));
		}
		else if (word.length()%2==1) {
			System.out.println(word.charAt(word.length()/2));
			
		}
		else if(word.length()==2) {
			System.out.println(word.repeat(2));
		}else {
			System.out.println(word.substring(word.length()/2-1,(word.length()/2)+1));
		}
		
	}

}
