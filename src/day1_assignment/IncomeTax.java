package day1_assignment;

//Program to calculate Income Tax

public class IncomeTax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int taxableincome;
		double taxPayable;
		taxableincome = 67891;
		if (taxableincome <= 20000) {
			taxPayable = 0;
		} else if (taxableincome > 20000 && taxableincome <= 40000) {
			taxPayable = ((taxableincome - 20000) * 0.1);
		} else if (taxableincome > 40000 && taxableincome <= 60000) {
			taxPayable = ((taxableincome - 40000) * 0.2) + (20000 * 0.1);
		} else {
			taxPayable = ((taxableincome - 60000) * 0.3) + (20000 * 0.2)
					+ (20000 * 0.1);
		}

		System.out.println("For Taxable Income--" + taxableincome);
		System.out.println("Income Tax Payable is " + taxPayable);
	}

}
