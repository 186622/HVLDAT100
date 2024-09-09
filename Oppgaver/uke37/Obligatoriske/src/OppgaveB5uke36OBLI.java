
import static javax.swing.JOptionPane.*;

public class OppgaveB5uke36OBLI {

	public static void main(String[] args) {
		

		
     int POENG = 100;	
	final int ELEVER = 2;	
	for (int i = 0; i <= ELEVER; i++) {	
		String elevNavn = showInputDialog("Navn på Elev:");
		String elevPoeng = showInputDialog("Poengsum til Elev:");
		 POENG = Integer.parseInt(elevPoeng);
		
		 while (POENG < 0 || POENG > 100) {
			 showMessageDialog(null, "ugyldig poengsum, skriv in på nytt");
			  elevPoeng = showInputDialog("Poengsum til Elev:");
			  POENG = Integer.parseInt(elevPoeng);
		 }

		 
		if ( POENG >= 90 && POENG <= 100) {
			System.out.println( elevNavn + " Hadde " + POENG + " poeng " + " og får Karakter: A");
		} else if (POENG >= 80 && POENG <= 89) {
			System.out.println( elevNavn + " Hadde " + POENG + " poeng " + " og får Karakter: B");
		} else if (POENG >= 60 && POENG <=79) {
			System.out.println( elevNavn + " Hadde " + POENG + " poeng " + " og får Karakter: C");
		}else if (POENG >= 50 && POENG <=59) {
			System.out.println( elevNavn + " Hadde " + POENG + " poeng " + " og får Karakter: D");
		}else if (POENG >= 40 && POENG <=49) {
			System.out.println( elevNavn + " Hadde " + POENG + " poeng " + " og får Karakter: E");
		}else if (POENG >= 0 && POENG <=39) {
			System.out.println( elevNavn + " Hadde " + POENG + " poeng " + " og får Karakter: F");
		} else {
			System.out.println("Ugyldig poengsum Skriv inn på nytt");
		    elevNavn = showInputDialog("Navn på Elev:");
			elevPoeng = showInputDialog("Poengsum til Elev:");

		}
	}


		
	}

}
