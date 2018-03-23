package kassenbonAuto;

public class KassenbonAuto {

	public static void main(String[] args) {
		
		int bier = 0;
			
		double preisBier = 1.20,
				startGeld = 70.0,
				brieftasche = startGeld,
				gesamt = 0;
		
		while (brieftasche >= preisBier){
			gesamt = gesamt + preisBier;
			brieftasche = brieftasche - preisBier;
			bier++;
		}
			
			System.out.println(String.format("%-9s %2d x %5.2f EUR", "Bier", bier, preisBier));
			System.out.println(String.format("%30.2f EUR", bier * preisBier));

			System.out.println("___________________________________");

			System.out.println(String.format("%-9s %20.2f EUR", "Gesamt", gesamt));
			System.out.println(String.format("%-9s %20.2f EUR", "Gegeben", startGeld));
			System.out.println();
			System.out.println(String.format("%-9s %20.2f EUR", "Zurück", brieftasche));

		}
	}
