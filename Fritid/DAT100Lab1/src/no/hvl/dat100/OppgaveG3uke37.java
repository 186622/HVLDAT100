package no.hvl.dat100;
import static javax.swing.JOptionPane.*;

public class OppgaveG3uke37 {

	public static void main(String[] args) {

		 String nedre = showInputDialog("Nedre: ");
		String ovre = showInputDialog("ØVre:" );
		
		int nedreInt = Integer.parseInt(nedre);
		int ovreInt = Integer.parseInt(ovre);
		
		
        StringBuilder resultatet = new StringBuilder("Oddetall mellom " + nedreInt + " og " + ovreInt + ": ");
        // Her bruker vi obejtket StringBuilder for å effektiv samle alle tallene i en streng.

	
		for (int i = nedreInt; i <= ovreInt; i++) {
			if (i % 2 == 1) {
				resultatet.append(i).append(" ");			}
		}
			
		
		
		  showMessageDialog(null, resultatet.toString());
	}

}
