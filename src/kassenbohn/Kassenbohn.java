package kassenbohn;

import java.util.*;

public class Kassenbohn {

	public static void main(String[] args) {
		
		Date dt = new Date(); 
		
		int windeln = 3, 
			bier = 4, 
			seife = 1, 
			whiskas = 1;
		
		double preisWindeln = 13.20, 
				preisBier = 1.20,
				preisSeife = 0.80,
				preisWhiskas = 4.25;
		
		double brieftasche = 50.0;
		
		double gesamt = ((preisWindeln * windeln) + (preisBier * bier) + (preisSeife * seife) + (preisWhiskas * whiskas));
		
		if(brieftasche > 50) {
			System.out.println("Nicht genug Geld!");
		}
		else {
		/*System.out.println("ALDI Kassenbon " + dt);
		System.out.printf("Windeln  %s x " + preisWindeln + " EUR" + "\r\n", windeln );
		System.out.printf("Bier  %s x " + preisBier + " EUR" + "\r\n", bier);
		System.out.printf("Seife  %s x " + preisSeife + " EUR" + "\r\n", seife);
		System.out.printf("Whiskas  %s x " + preisWhiskas + " EUR" + "\r\n", whiskas);
		System.out.println("-------------------------------------");*/
			
			System.out.println("ALDI Kassenbon " + dt);
			System.out.println("");
			
			System.out.println(String.format("%-9s %2d x %5.2f EUR", "Wurst", windeln, preisWindeln));
			System.out.println(String.format("%30.2f EUR", windeln * preisWindeln));
			
			System.out.println(String.format("%-9s %2d x %5.2f EUR", "Bier", bier, preisBier));
			System.out.println(String.format("%30.2f EUR", bier * preisBier));
			
			System.out.println(String.format("%-9s %2d x %5.2f EUR", "Seife", seife, preisSeife));
			System.out.println(String.format("%30.2f EUR", seife * preisSeife));
			
			System.out.println(String.format("%-9s %2d x %5.2f EUR", "Whiskas", whiskas, preisWhiskas));
			System.out.println(String.format("%30.2f EUR", whiskas * preisWhiskas));
			
			System.out.println("-----------------------------------");
			
			System.out.println(String.format("%-9s %20.2f EUR", "Gesamt", gesamt));
			System.out.println(String.format("%-9s %20.2f EUR", "Gegeben", brieftasche));
			System.out.println(String.format("%-9s %20.2f EUR", "Zurück", brieftasche - gesamt));

		}
		

	}

}
