package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
public class lokkeMedValgSettning {

	public static void main(String[] args) {
		
		
		final int NEDRE = 0;
		final int OVRE = 100;
		
		String melding = "Tenkt på tall mellom " + NEDRE + " - " + OVRE + ".";
		
		showMessageDialog(null, melding);
		
		int lav = NEDRE;
		int hoy = OVRE;
		int tall = 0;
		boolean riktigSvar = false;
		
		do {
			tall = (lav + hoy) / 2;
			melding = "Tenker du på " + tall + "? " + "Hvis det er riktig, skriv 0, For høyt skriv -1, for Lavt skriv 1.";
			int svar = Integer.parseInt(showInputDialog(melding));
			riktigSvar = (svar == 0);
			
			if (!riktigSvar) {
				if (svar == -1) {
					hoy = tall -1;
				} else {
					lav = tall +1;
				}
			}
			
		} while (!riktigSvar);
		
		System.out.println("Gratulerer");
		
	}
	
	
	
	
}
