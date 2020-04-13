package assignment14.Question01;



public class TestAtts extends Atts{

	public static void main(String[] args) {
	      
		Atts test = new Atts() ;
		test.name = "table";
		test.color = "brown";
		test.amount = 1;

		System.out.println(test.asString());
	}

}
