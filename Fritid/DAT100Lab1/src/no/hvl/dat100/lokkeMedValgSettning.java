package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
public class lokkeMedValgSettning {

	public static void main(String[] args) {
		
		final int NEDRE = 0;
		final int OVRE = 100;
		
		
		int lav = NEDRE;
		int hoy = OVRE;
		int tall = 0;
		boolean riktigSvar = false;
		
		String melding = "Tenk på et tall mellom " + NEDRE + " - " + OVRE + ".";
		showMessageDialog(null, melding);
		
		do {
			tall = (lav + hoy) / 2;
			melding = "Tenker du på tallet " + tall + "?" + "Hvis riktig, skriv 0. lav: 1. Hoyt: -1";
			int svar = Integer.parseInt(showInputDialog(melding));
			riktigSvar = (svar == 0);
			
			
			if (!riktigSvar) {
				if (svar == 1) {
					lav = tall +1;
					
				} else {
					hoy = tall -1;
				}
			}
			
			
		} while (!riktigSvar);
		System.out.println("Gratulerer");
		 
		
		
	}
	
	
	
	
}
