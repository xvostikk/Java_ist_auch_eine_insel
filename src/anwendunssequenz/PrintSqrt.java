package anwendunssequenz;

public class PrintSqrt {
	static void printSqrt( double d ) {
	    if ( d < 0 ) {
	      System.out.println( "Keine Wurzel aus negativen Zahlen!" );
	      return;
	    }
	    System.out.println( Math.sqrt( d ) );
	  }
	
		static double avg( double x, double y ) {
		  return (x + y) / 2;
		}
		
		public static void main(String[] args) {
			printSqrt(999);
		}

}

