package week1.day2;

public class Firefox {
	String name = "Firefox";
	float version = 100.2f;
	boolean visible = true;
	int year = 1998;
	char logo = 'M';

	public void edge() {
		float version = 1.0f;
		String name = "edge";
		System.out.println("This is my first script");
	}

	public void chrome() {
		int speed = 0;
	}

	public static void main(String[] args) {
		Firefox bw = new Firefox();
		bw.chrome();
		bw.edge();
	}

}
