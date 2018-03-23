package whatsYourNumber;

import java.util.Scanner;

public class GuessWhat {

	public static void main(String[] args) {
		int number = (int) (Math.random() * 5 + 1);

		while (true) {
			System.out.println("Welche Zahl denke ich mir zwischen 1 und 5?");
			int guess = new Scanner(System.in).nextInt();
			
			//Wertebereich von Zahlen nur zwischen 1 und 5. Ohne dieser Schleife ist angegebene Zahl egal. 
			if (guess < 1 || guess > 5) {
				System.out.println("Nur Zahlen zwischen 1 und 5!");
				continue;//springt zur Schleife Kopf und macht weiter. Kann durch else ersetzt werden.
			}
			
			if (number == guess) {
				System.out.println("Super getippt!");
				break;//Ende der Schleife wenn Zahl richtig erraten. Sonst läuft unendlich.
			} else if (number > guess)
				System.out.println("Mein Zahl ist grosser");
			else if (number < guess) {
				System.out.println("Mein Zahl ist kleiner");
			}
		}

	}

}
