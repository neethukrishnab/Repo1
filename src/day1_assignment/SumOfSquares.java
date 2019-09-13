package day1_assignment;

//Program to find the Sum of Squares from 1 to 10

public class SumOfSquares {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			sum = sum + i * i;
		}
		System.out.println("The sum of squares of numbers from 1 to 10 is " + sum);
	}
}
