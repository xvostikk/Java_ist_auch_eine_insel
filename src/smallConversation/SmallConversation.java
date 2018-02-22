package smallConversation;

public class SmallConversation {

	public static void main(String[] args) {
		System.out.println("Guten Tag, wie heißt du?");
		String name = new java.util.Scanner(System.in).nextLine();
		System.out.printf("Hallo %s. Wie alt bist du?%n", name);
		int age = new java.util.Scanner(System.in).nextInt();
		System.out.printf("Aha, %s Jahre, das ist ja Hälfte von %s.%n", age, age*2);
		System.out.println("Sag mal, was ist deine lieblings Fließkomazahl?");
		double value = new java.util.Scanner(System.in).nextDouble();
		System.out.printf("%s? Aha, meine ist %s.", value, Math.random() * 100000);
	}

}
