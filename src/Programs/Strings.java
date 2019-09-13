package Programs;

public class Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

String c="Hello Hi";
String s="Hello Hi"
String d=new String("hello")
System.out.println(s);
System.out.println(s.concat("hai"));
System.out.println(s.concat(s));
System.out.println(s.length());
System.out.println(s.charAt(4));
System.out.println(s.substring(1, 6));//begins at 1st index position and until the 5th character
System.out.println(s.substring(1));
System.out.println(s.trim()); //trim white space at both ends
System.out.println(s.replace('l','j'));
System.out.println(s.replaceFirst("Hello123", "are"));
Sysout.println(s.equals(c));
System.out.println(s==c);

	
	String a;
	a="abcdefghi";
	int l = a.length();
	for (int i=(l-1);i>=0;i--) {
		System.out.print(a.charAt(i));   
	
	}
			
	}
}

