package assignment2;

public class Calculation implements A, B {

	public void add() {
		System.out.println("The added result of a and b is " + (a + b));
	}

	public void multiply() {
		System.out.println("The multiplied result of c and d is " + (c * d));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculation c = new Calculation();
		c.add();
		c.multiply();
	}

}
