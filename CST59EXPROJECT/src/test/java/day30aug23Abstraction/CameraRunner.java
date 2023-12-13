package day30aug23Abstraction;

public class CameraRunner extends Camera {
	
	@Override
	void clickPhoto() {
		System.out.println("Click photo");
	}

	
	public static void main(String[] args) {
		CameraRunner cr;
		CameraRunner CR = new CameraRunner();
		CR.clickPhoto();
	}
}
