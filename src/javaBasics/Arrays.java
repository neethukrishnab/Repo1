package javaBasics;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	int primes[]= {2,3,5,11};
	//	System.out.println(primes[4]);
		int a[]=new int[10];
		a[0]=25;
		a[1]=30;
		for(int i=2;i<=9;i++) {
			a[i]=a[i-1]+5;}
		for(int j=0;j<=9;j++) {
				System.out.println(a[j]);	
		}

		}
	}


