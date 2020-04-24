package lab3Cont;

import javax.management.RuntimeErrorException;

public class ThrowAcceptions {

	public static void main(String[] args) {
		
		String alfa = "";
		if(alfa.isEmpty()) {
			
			try {
				throw new RuntimeErrorException(null, " isEmpty");
				
			} catch (Exception e) {
				throw new RuntimeErrorException(null, " isEmpty");
			}
			finally {
				System.out.println("final");
			}
		}
		else {
			System.out.println("valid");
		}
	}

}
