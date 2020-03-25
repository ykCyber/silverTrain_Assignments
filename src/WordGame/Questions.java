package WordGame;

import java.util.ArrayList;

public class Questions {

	public static void main(String[] args) {
		/*
		 * 15  questions at data base
		 * no1/no2/no3                 3 of them 	  4 letter
		 * no4 no5 no6 no7    	       4 of           5
		 * no8 no9 no10 no11 		   4 of           6
		 * no11 no 12 no13 no14 no15   4 of           7
		 *
		 *
		 *user have to answer only 5 questions
		 *
		 *q.1 with 4 letter( 400 points)
		 *q.2 with 5 letter( 500 points)
		 *q.3 with 6 letter
		 *q.4 with 6  
		 *q.5 with 7 letter(no10/n09
		 *
		 *but these will be random
		 * 
		 *point == size of word*100
		 *
		 *user can use hint char ( takeLetter)
		 *if user use hint he can not take letter points (100pts)
		 *
		 *....Welcome to WordGame!....
		 *  your question is  with X letters 
		 * 1.question =  What is the bigger type of mice?
		 * 
		 * ---
		 * user use hint takeLetter 
		 * -a-(randomly)(points== 300-100);
		 * if user again use hint 
		 * ra-	(points = 300-100-100);
		 *
		 *Your point = 100;
		 *program now we have word with X letters 
		 *
		 *2. question What is the virus nowadays..(answer corona)
		 *
		 *  ------
		 *if user types corona	 points== 600
		 *points+ previosly gained points; 
		 *
		 *if user use hint 
		 *
		 *out: ---o-- Point ( 600-100);
		 *
		 */
		String []questions = new String[16];
		questions[1]="The color of sky";
		String []answers = new String[16];
		answers[1]="blue";
		
		//pick 5 of them 
		
	}

}
