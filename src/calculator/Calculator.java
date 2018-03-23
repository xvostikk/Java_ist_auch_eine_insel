package calculator;
import java.util.*;

public class Calculator {

	public static void main(String[] args) {
		double x = new Scanner(System.in).nextDouble();
		char operator = new Scanner(System.in).nextLine().charAt(0);
		double y = new Scanner(System.in).nextDouble();
		
		switch (operator) {
		case '+':
			System.out.println( x + y );
			break;
		case '-':
			System.out.println( x - y);
			break;
		case '*':
			System.out.println( x * y );
			break;
		case '/':
			System.out.println( x / y);
			break;

		default:
		        System.err.println( "Unbekannter Operator " + operator );
		}

	}

}
