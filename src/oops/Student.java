package oops;

public class Student {
	String Sname;
	int Sid;
	
	public Student(String name,int id) {
		}
		
		public void methodoverloading(int a) {
			System.out.println("Insode method with int argument");
		}

		public void methodoverloading(int a, String b) {
			System.out.println("INSIDE METHODS WITH TWO ARGUEMNTS");
		}
		public void methodoverloading(String b,int a) {
			System.out.println("INSIDE METHODS WITH TWO ARGUEMNTS string and int");
		}
		public void methodoverloading() {
			System.out.println("INSIDE METHODS WITH no ARGUEMNTS");
		
		
		

	}
}
