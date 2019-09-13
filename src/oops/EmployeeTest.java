package oops;

public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Employee Linda = new Employee();
		Linda.Eid = 1215;
		Linda.Ename = "Linda Smith";
		Linda.Bonus = 2000;
		Linda.Esalary = 50000;
		Linda.totalsalary();*/
		
		Employee Linda = new Employee();
		Linda.Eid = 1215;
		Linda.Ename = "Linda Smith";
		Linda.Bonus = 7000;
		Linda.Esalary = 40000;
		int t=Linda.totalsalary();
		System.out.println("The total salary is "+ t);
		
		Employee E1=new Employee();
		E1.setData("E1", 5, 85000, 100000);
		Employee E2=new Employee();
		E2.setData("E2", 15, 65000, 100000);
		Employee E3=new Employee();
		E3.setData("E3", 25, 95000, 100000);
		Employee E4=new Employee("4", 35, 45000, 100000);
		E4.setData("4", 35, 45000, 100000);
		System.out.println(E1.Eid);
		


	}

}
