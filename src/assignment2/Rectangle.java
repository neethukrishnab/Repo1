package assignment2;

public class Rectangle {
	int length;
	int breadth;

	Rectangle() {
		length = 0;
		breadth = 0;
	}

	Rectangle(int l, int b) {
		length = l;
		breadth = b;
	}

	public void area() {
		System.out.println("The area of the rectangle is " + (length * breadth));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle r1 = new Rectangle();
		r1.area();
		Rectangle r2 = new Rectangle(10, 20);
		r2.area();
	}

}
