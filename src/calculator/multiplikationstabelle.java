package calculator;

public class multiplikationstabelle {

	public static void main(String[] args) {
		for (int i = 1, j = 9; i <= j; i++, j--)
		System.out.printf("%d * %d = %d%n", i, j, i*j );

	}
	
//	int x, y;
//	for ( x = initX(), y = initY(), x++, y++;
//			x < 10 || y < 10;
//			x += xinc(), y += yinc() ) {
//		System.out.printf("%d * %d = %d%n", x, y, x*y );
//	}

}
