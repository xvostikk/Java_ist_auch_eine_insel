package whatsYourNumber;
import java.util.*;

public class WhatsYourNumber {

	public static void main(String[] args) {
		int number = (int)(Math.random() * 5 + 1);
		
		System.out.println("Welche Zahl denke ich mir zwischen 1 und 5?");
		int guess = new Scanner(System.in).nextInt();
		
		if(number==guess) 
			System.out.println("Super getippt!");
		else
			System.out.println("Starte das Programm noch einmal und rate erneut!");

	}

}
