package javaBasics;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n1=0,n2=1,temp,s;
System.out.println(n1+ "\n"+n2);
int n=2;
while(n<=15) {
	temp=n1+n2;
	System.out.println(temp);
	s=n1;
	n1=n2;
	n2=s+n1;;
	n++;
	
}

	}

}
