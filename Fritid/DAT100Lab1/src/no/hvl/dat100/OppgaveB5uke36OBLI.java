package no.hvl.dat100;

public class OppgaveB5uke36OBLI {

	public static void main(String[] args) {
		
		 int POENG = 20;
		if ( POENG >= 90 && POENG <= 100) {
			System.out.println("Karakter: A");
		} else if (POENG >= 80 && POENG <= 89) {
			System.out.println("Karakter: B");
		} else if (POENG >= 60 && POENG <=79) {
			System.out.println("Karakter: C");
		}else if (POENG >= 50 && POENG <=59) {
			System.out.println("Karakter: D");
		}else if (POENG >= 40 && POENG <=49) {
			System.out.println("Karakter: E");
		}else if (POENG >= 0 && POENG <=39) {
			System.out.println("Karakter: F");
		} else {
			System.out.println("Ugyldig poengsum");
		}

		
	}

}
