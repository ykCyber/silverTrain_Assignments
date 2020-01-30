package assignment_7_ForLoop.copy;

public class Question06_Pattern6 {
	public static void main(String[] args) {
/***	1
		2 6
		3 7 10
		4 8 11 13
		5 9 12 14 15**/
		for (int i = 1; i <= 5; i++) {
			String str = "";
			int num = i;
			
				for (int j = 1; j <=i; j++) {
					
					str = str + (num) +" ";
					num =num + 5-j;
				}
				System.out.println(str);
//				
//			String str= "";
//		
//			for (int num=1;num<10;num++) {
//			str = str + (num)+"";
//			System.out.println(str);
//			}
//			System.out.println();
		}
	}
}

