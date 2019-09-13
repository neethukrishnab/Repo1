package oops;

public class Employee {
	String Ename;
	int Eid;
	int Esalary;
	int Bonus;

	public int totalsalary() {
		int Totalsal = Esalary + Bonus;
		return Totalsal;
	}
	
	 public void setData(String Ename, int Eid, int Bonus, int ESalary)
	{
		this.Ename=Ename;
		this.Eid=Eid;
		this.Bonus=Bonus;
		this.Esalary=Esalary;
		
	} 

	
	Employee(){
	}
	
	
	Employee(String name, int id, int bonus, int salary)
	{
		Ename=name;
		Eid=id;
		Bonus=bonus;
		Esalary=salary;
		

	}
}
