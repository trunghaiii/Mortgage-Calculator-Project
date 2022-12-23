package MortgageProject;

public class MortgageCalculator {
	public final static byte MONTHS_IN_YEAR = 12;
	public final static byte PERCENT = 100;
	
	private int Principal;
	private float annualInterestRate;
	private int Periods;
	
	public MortgageCalculator(int Principal, float annualInterestRate, int Periods) {
		this.Principal = Principal;
		this.annualInterestRate = annualInterestRate;
		this.Periods = Periods;
	}
	
	public double calculateBalance(int numberOfPaymentsMade) {
		
		float monthlyInterestRate = getmonthlyInterestRate();
		int paymentTimes = getpaymentTimes();
		
		double balance = Principal
				* ((Math.pow(1 + monthlyInterestRate, paymentTimes))
						- (Math.pow(1 + monthlyInterestRate, numberOfPaymentsMade)))
				/ ((Math.pow(1 + monthlyInterestRate, paymentTimes)) - 1);
		return balance;
	}
	
	public double calculateMortgage() {
		
		float monthlyInterestRate = getmonthlyInterestRate();
		int paymentTimes = getpaymentTimes();
		
		double mortgage = Principal * ((monthlyInterestRate * Math.pow((1 + monthlyInterestRate), paymentTimes))
				/ (Math.pow(1 + monthlyInterestRate, paymentTimes) - 1));
		return mortgage;
	}
	
	private float getmonthlyInterestRate() {
		return annualInterestRate / PERCENT / MONTHS_IN_YEAR;
	}
	
	private int getpaymentTimes() {
		return Periods * MONTHS_IN_YEAR;
	}
	
	public int getPeriods() {
		 return Periods;
	}
       
}
