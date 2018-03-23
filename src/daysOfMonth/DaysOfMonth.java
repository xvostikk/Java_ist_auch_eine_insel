package daysOfMonth;
import java.util.*;

public class DaysOfMonth {

	@SuppressWarnings( "resource" )
	  public static void main( String[] args ) {
	    
		System.out.println("Welche Monat?");
	    int month = new java.util.Scanner( System.in ).nextInt();
	    System.out.println("Welche Jahr?");
	    int year = new java.util.Scanner( System.in ).nextInt();
	    // Schaltjahr oder nicht?
	    boolean isLeapYear = ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0);
	    
	    switch ( month ) {
	      case 4: // Fall-through
	      case 6:
	      case 9:
	      case 11:
	        System.out.println( "30 Tage" );
	        break;
	      case 1: // Fall-through
	      case 3:
	      case 5:
	      case 7:
	      case 8:
	      case 10:
	      case 12:
	        System.out.printf( "Das %s.Monat im Jahr %s war 31 Tage", month, year);
	        break;
	      case 2:
	        if ( isLeapYear )
	          System.out.printf( "Das %s.Monat im Jahr %s war 29 Tage", month, year);
	        else
	          System.out.printf( "Das %s.Monat im Jahr %s war 28 Tage", month, year);
	        break;
	      default:
	        System.err.println( "Ungültiger Monat!" );
	    }
	  }
	

}
