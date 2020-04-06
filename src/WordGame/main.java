//package WordGame;
//
//import java.util.Random;
//import java.util.Scanner;
//
//public class main {
//	public static void main(String[] args)  {
//		System.out.println("----Welcome to the WordGame----");
//		for (int i = 1; i < 5; i++) {
//			System.out.println("soru " + questions(i));
//			String dummy = "-".repeat(answers(i).length());
//			Scanner sc = new Scanner(System.in);
//			Random rn = new Random();
//			System.out.println(dummy);
//			label1: while (true) {
//				System.out.println("Harf Almak Ã�stiyormusun e/h");
//				StringBuilder sb = new StringBuilder(dummy);
//				String harfAlayÃ½m = sc.nextLine();
//				if (harfAlayÃ½m.equalsIgnoreCase("h")) {
//					System.out.println("10 saniyelik sÃ¼reniz baÃ¾ladÃ½:");
//					Thread.sleep(5000);
//					System.out.println("cevabÃ½nÃ½z:");
//					String cevap = sc.nextLine();
//					System.out.println("sÃ¼re doldu");
//					System.out.println("cevap:" + answers(i));
//					break;
//				} else if (harfAlayÃ½m.equalsIgnoreCase("e")) {
//					int hintNumber = rn.nextInt(answers(i).length()) + 0;
//					while (sb.charAt(hintNumber) != '-') {
//						hintNumber = rn.nextInt(answers(i).length()) + 0;
//					}
//					sb.setCharAt(hintNumber, answers(i).charAt(hintNumber));
//					dummy = "" + sb;
//					System.out.println(sb);
//					if (dummy.equals(answers(i))) {
//						break label1;
//					}
//				}
//			}
//		}
//	}
//
//	public static String answers(int i) {
//		String[] answers = new String[16];
//		answers[1] = "blue";
//		answers[2] = "komi";
//		answers[3] = "Ãžasi";
//		answers[4] = "bakÃ½r";
//		answers[5] = "cÃ¼bbe";
//		answers[6] = "ritim";
//		answers[7] = "desen";
//		answers[8] = "sunucu";
//		answers[9] = "mentol";
//		answers[10] = "ibadet";
//		answers[11] = "Ankara";
//		answers[12] = "ispanya";
//		answers[13] = "vatikan";
//		answers[14] = "gezegen";
//		answers[15] = "Alabora";
//		return answers[i];
//	}
//
//	public static String questions(int i) {
//		String[] questions = new String[16];
//		questions[1] = "GÃ¶kyÃ¼zÃ¼ rengi nedir?";
//		questions[2] = "Garson KalfasÃ½";
//		questions[3] = "Motorlu taÃ¾Ã½t iskeleti";
//		questions[4] = "Madeni para, kablolar,cezve yapÃ½mÃ½nda kullanÃ½lÃ½r.";
//		questions[5] = "YargÃ½Ã§, papaz gibi gÃ¶revlilerin giydiÃ°i kÃ½yafet";
//		questions[6] = "Bateri, kalp atÃ½Ã¾Ã½, davul vb. Ã§Ã½kan dÃ¼zenli ses";
//		questions[7] = "Tekerlek, duvar kaÃ°Ã½dÃ½, kara kalem Ã§alÃ½Ã¾masÃ½ gibi durumlarda ortaya Ã§Ã½kan resim";
//		questions[8] = "Anchorman olarakta adlandÃ½rÃ½lÃ½r,haber sunar.";
//		questions[9] = "Nane,mendil,polo Ã¾ekerden yayÃ½lan ferahlatÃ½cÃ½ koku";
//		questions[10] = "Dindar insanlarÃ½n dini vecibelerini yerine getirdiÃ°i Ã¶dev";
//		questions[11] = "Ã¼lkemizin baÃ¾kenti";
//		questions[12] = "Ã–nceden endÃ¼lÃ¼s olarak bilinen Ã¼lkenin gÃ¼nÃ¼mÃ¼zdeki ismi";
//		questions[13] = "Ã�talya sÃ½nÃ½rlarÃ½ iÃ§inde bulunan PapanÃ½nda yaÃ¾adÃ½Ã°Ã½ ayrÃ½ bir Ã¼lke";
//		questions[14] = "SatÃ¼rn,VenÃ¼z,Marsa verilen ad";
//		questions[15] = "Gemilerin yan yatmÃ½Ã¾ veya ters dÃ¶nmÃ¼Ã¾ hali";
//		return questions[i];
//	}
//}
