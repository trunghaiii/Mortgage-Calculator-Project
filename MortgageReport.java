package MortgageProject;

import java.text.NumberFormat;

public class MortgageReport {
	public final static byte MONTHS_IN_YEAR = 12;
	public final static byte PERCENT = 100;
	
	private MortgageCalculator calculator;
	
	public MortgageReport(MortgageCalculator calculator){
		this.calculator = calculator;
	}
	
	public void printPaymentSchedule() {
		System.out.println("Payments Schedule: ");
		System.out.println("====================");
		for(int month = 1; month <= calculator.getPeriods()*MONTHS_IN_YEAR; month++) {
			double balance = calculator.calculateBalance(month);
			System.out.println(NumberFormat.getCurrencyInstance().format(balance));
		}
	}
	public void printMortgage() {
		double mortgage = calculator.calculateMortgage();
		String mortgageFormat = NumberFormat.getCurrencyInstance().format(mortgage);
		System.out.println("MORTGAGE: ");
		System.out.println("-----------");
		System.out.println("Monthly Payments: " + mortgageFormat);
		System.out.println();
	}

}
