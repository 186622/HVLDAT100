package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class Login {

	public static void main(String[] args) {
		String riktigBrukernavn = "Marius";
		String riktigPassord = "secret";
		
		String brukernavn = showInputDialog("Brukernavn :");

		String passord = showInputDialog("Passord :");

		if (brukernavn.equals(riktigBrukernavn) && passord.equals(riktigPassord)) {
			System.out.println("Riktig Informasjon inngitt");
			System.out.println(brukernavn);
			System.out.println(passord);
		} else {
			System.out.println("Ugyldig brukernavn eller passord, prøv igjen");
		}
		

	
	}

}
