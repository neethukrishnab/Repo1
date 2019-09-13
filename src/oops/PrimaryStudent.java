package oops;

public class PrimaryStudent extends Student{
	
	int Pgrade;
	
	public PrimaryStudent(String name,int id)
	{
		super(name, id);
		Pgrade=id;
		
	}
	
	public void methodOveriding() {
		System.out.println("Inside child class");
	}

}
