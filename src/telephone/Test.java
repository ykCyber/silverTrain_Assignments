package telephone;




public class Test {

	public static void main(String[] args) {

		MobilePhone mp1 = new MobilePhone();

		MobilePhone mp2 = new iPhone("13.5");

		MobilePhone mp3 = new GooglePhone("Pie");

//		mp2.call("mommy");
//		((Smartphone) mp2).navigation("HOME");
//		((iPhone) mp2).appStore();
		((iPhone)mp2).music();
//		mp1.call("mom");
//		mp2.call("Dad");
//		((iPhone) mp2).music();
//		((iPhone) mp2).appStore();

	}

}
