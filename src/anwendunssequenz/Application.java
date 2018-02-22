package anwendunssequenz;

public class Application {
	public static void main(String[] args) {
		System.out.println("Wer morgens total zerknittert aufsteht, ");
		System.out.println("hat am Tag die besten Entfaltungsmöglichkeiten.");
		;// Endloswiederholung?
		System.out.println();// Leere Zeile
		;

		// Overloaded println
		System.out.println("Verhaften Sie die üblichen Verdächtigen!");// print line=Zeilenvorschubzeichen ausgegeben
		System.out.println(true);
		System.out.println(-273);
		System.out.println();
		System.out.println(3.14729483049805467587);// ausgibt nicht alle Zahlen!! aufrundet

		// variable Argumentlisten
		System.out.printf("Was sagst du?%n");// %n = Zeilenumbruch
		System.out.printf("%d Kanäle und überall nur %s.%n", 220, "Katzen");// %d = Platzhalter für den ganze Zahl, %f=
																			// float, %s= platzhalter für den
																			// Zeichenkette(string)
		System.err.println("Das ist Fehlermeldung");
		
		System.out.println(Byte.MIN_VALUE);
		System.out.println(Byte.MAX_VALUE);
		System.out.println(Character.MIN_VALUE);
		System.out.println(Character.MAX_VALUE);
		System.out.println(Double.MIN_VALUE);
		System.out.println(Double.MAX_VALUE);
		
		boolean sendSMS = true,
				bungaBungaParty = true;
		String person1 = "Silvio",
				person2 = "Bussi";
		double x, y, //uninitialisiert
		bodyHeight = 162 /*cm*/;
		
		if(sendSMS) {
			System.out.println("Wann " + person1 + " ruft " + person2 + " dann " + bodyHeight + " cm ;)");
		}
		
		System.out.println(20000000000F == 20000000000F +1); // true
		System.out.println(20000000000D == 2000000000D +1); //false
		
		System.out.println(Float.toHexString(2000000000F));
		System.out.println(Float.toHexString(20000000000F +1F));
		System.out.println(Double.toHexString(2000000000D));
		System.out.println(Double.toHexString(20000000000D +1D));
		
		System.out.println(123456789 + 5432l);
		
		byte b = (byte) 200;
		System.out.println(b);
	}

}
