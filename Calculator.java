package week1.day2;

public class Calculator {

	public void sub(int a, float b) {
		System.out.println(a - b);
		System.out.println(a + b);
	}

	public void add(int a, int b) {
		System.out.println(a + b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator cal = new Calculator();
		cal.sub(10, 9.7f);
		cal.add(10, 69);
	}

}
