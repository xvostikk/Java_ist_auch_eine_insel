package methoden;

public class FriendlyGreet {
	
	static void greet() {//void - keine Rückgabewert, greet()-keine Parameter
		System.out.println( "Guten Morgen. Oh und falls wir uns nicht mehr" + 
	" sehen, guten Tag, guten Abend und gute Nacht!" );
	}

	public static void main(String[] args) {
		greet();
		
		int i = 1;
		System.out.println( Math.max(i++, --i));

	}

}
