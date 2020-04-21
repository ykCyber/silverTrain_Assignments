package assignment14.Question12;

public class Test {

	public static void main(String[] args) {
		int memorySize=1;
		int imageSize=25;
		Phone apple = new CameraPhone(memorySize,imageSize);
		int numPictures = ((CameraPhone) apple).numPictures();
		System.out.println(numPictures);
	}

}
