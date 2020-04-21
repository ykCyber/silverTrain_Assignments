package assignment14.Question12;

public class CameraPhone extends Phone {
	private int imageSize=0;

	public CameraPhone(int memorySize, int imageSize) {
		this.memorySize = memorySize;
		this.imageSize = imageSize;
	}

	public int numPictures() {
		return (memorySize*1000)/imageSize;
	}

}
