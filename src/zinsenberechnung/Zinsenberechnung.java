package zinsenberechnung;
import java.util.*;

public class Zinsenberechnung {

	public static void main(String[] args) {
		System.out.println("Was ist deine Kapital?");
		double capital = new Scanner(System.in).nextDouble();
		
		System.out.println("Zinssatz?");
		double percent = new Scanner(System.in).nextDouble();
		
		System.out.println("Anlagedauer in Monaten?");
		int month = new Scanner(System.in).nextInt();
		
		double totalPercent = capital * percent * month / (12*100);
		System.out.printf("Zinsen: %g%n", totalPercent);
	
		

	}

}
