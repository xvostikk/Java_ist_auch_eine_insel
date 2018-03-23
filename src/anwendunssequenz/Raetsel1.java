package anwendunssequenz;

public class Raetsel1 {

	public static void main(String[] args) {
		int val = 2;
		
		switch ( val ) {
		case 1:
			System.out.println( 1 );
		case2://erkennt als Label, nicht als case
			System.out.println( 2 );

		default:
			System.out.println( 3 );
		}

	}

}
