package MortgageProject;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int Principal = (int)Console.readNumber("Principal: ", 1000, 1_000_000);
		float annualInterestRate = (float)Console.readNumber("Annual Interest Rate: ",1,30);
		int Periods = (int)Console.readNumber("Period (Years): ", 1,30);
		
		var calculator = new MortgageCalculator(Principal,annualInterestRate,Periods);
		var report = new MortgageReport(calculator);
		
		report.printMortgage();
		report.printPaymentSchedule();

	}

}
