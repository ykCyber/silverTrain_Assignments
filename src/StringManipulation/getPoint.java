package StringManipulation;

public class getPoint {
    public static void main(String[] args) {
        String result = "Trabzonspor 26 15 8 3 59 28 +31 53 B G B G B";
        System.out.println("result.length() = " + result.length());
        String[] resultArray = result.split(" ");
        System.out.printf("Takım İsmi = %s Puan = %s" + resultArray[0],resultArray[8]);

    }

}
