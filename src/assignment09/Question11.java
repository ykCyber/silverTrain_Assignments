package assignment09;


public class Question11 {
	public String sender;
	public String phoneNunmer;
	public static String messageBody;



	public static void main(String[] args) {
		String str = "Sender:<Mike Smith>. From Number:[202-123-3456]. Message:{I love programming and problem solving}";
		Question11 sms1 = new Question11(str);
		System.out.println("Sender       : " + sms1.sender);
		System.out.println("Phone Number : " + sms1.phoneNunmer);
		System.out.println("Message      : " + sms1.messageBody);
	
		String str2 = "Sender:<Smith Brown>. From Number:[13-154-456]. Message:{I love programming and problem solving}";
		Question11 sms2 = new Question11(str2);
		System.out.println(sms2.sender);
	}

		public  Question11(String oldMessage){
		int senderStart = oldMessage.indexOf("<") + 1;
		int senderEnd = oldMessage.indexOf(">");
		this.sender = oldMessage.substring(senderStart, senderEnd);
		int phoneNumberStart = oldMessage.indexOf("[") + 1;
		int phoneNumberEnd = oldMessage.indexOf("]");
		this.phoneNunmer = oldMessage.substring(phoneNumberStart, phoneNumberEnd);
		int messageStart = oldMessage.indexOf("{") + 1;
		int messageEnd = oldMessage.indexOf("}");
		this.messageBody = oldMessage.substring(messageStart, messageEnd);
	}
}
