package WordGame;

public class answerQuestion {

	public static String getQuestion(int i) {

		String[] questions = new String[16];
		questions[1] = "Gökyüzü rengi nedir?";
		questions[2] = "Garson Kalfasý";
		questions[3] = "Motorlu taþýt iskeleti";
		questions[4] = "Madeni para, kablolar,cezve yapýmýnda kullanýlýr.";
		questions[5] = "Yargýç, papaz gibi görevlilerin giydiði kýyafet";
		questions[6] = "Bateri, kalp atýþý, davul vb. çýkan düzenli ses";
		questions[7] = "Tekerlek, duvar kaðýdý, kara kalem çalýþmasý gibi durumlarda ortaya çýkan resim";
		questions[8] = "Anchorman olarakta adlandýrýlýr,haber sunar.";
		questions[9] = "Nane,mendil,polo þekerden yayýlan ferahlatýcý koku";
		questions[10] = "Dindar insanlarýn dini vecibelerini yerine getirdiði ödev";
		questions[11] = "ülkemizin baþkenti";
		questions[12] = "Önceden endülüs olarak bilinen ülkenin günümüzdeki ismi";
		questions[13] = "Ýtalya sýnýrlarý içinde bulunan Papanýnda yaþadýðý ayrý bir ülke";
		questions[14] = "Satürn,Venüz,Marsa verilen ad";
		questions[15] = "Gemilerin yan yatmýþ veya ters dönmüþ hali";

		return questions[i];
	}

	public static String getAnswer(int i) {
		String[] answers = new String[16];
		answers[1] = "blue";
		answers[2] = "komi";
		answers[3] = "şasi";
		answers[4] = "bakır";
		answers[5] = "cübbe";
		answers[6] = "ritim";
		answers[7] = "desen";
		answers[8] = "sunucu";
		answers[9] = "mentol";
		answers[10] = "ibadet";
		answers[11] = "Ankara";
		answers[12] = "ispanya";
		answers[13] = "vatikan";
		answers[14] = "gezegen";
		answers[15] = "Alabora";
		return answers[i];
	}

}
