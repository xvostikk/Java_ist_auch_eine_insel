package interestRates;

public class InterestRates {

	public static void main(String[] args) {
		double capital = 20000; //euro
		double interestRate = 3.6; //prozent
		double totalInterestRate = capital * interestRate / 100; //Jahr 1
		System.out.println("Zinsen im Jahr 1 sind " + totalInterestRate + " Euro");

	}

}
