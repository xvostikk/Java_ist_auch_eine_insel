package Superstar;

public class pyramide {
	
	public static void pyramide( int hoehe ) {
		for (int i = 0; i <= hoehe; i++) {
			for (int space = hoehe - i; space > 0; space--) {
				System.out.print(" ");
			}
			for (int j = 0; j < i * 2 + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		pyramide(15);

	}

}
