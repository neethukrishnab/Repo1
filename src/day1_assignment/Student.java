package day1_assignment;

//Program to calculate the sum of marks of two subjects

public class Student {
    String Sname;
    int Sid;
    int SEnglish;
    int SMath;
    
    public void sumMarks(String Sname,int Sid,int SEnglish,int SMath)
    {
    System.out.println("The sum of marks of English and Maths is  "+ (SEnglish+SMath));
    }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Student s1=new Student();
       s1.sumMarks("Annie",22,85,89);
       Student s2=new Student();
       s2.sumMarks("Mark",24,67,69);
       
	}}


