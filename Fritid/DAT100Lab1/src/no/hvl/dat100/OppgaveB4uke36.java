package no.hvl.dat100;
import static javax.swing.JOptionPane.*;

public class OppgaveB4uke36 {

	public static void main(String[] args) {
		
		String pris = showInputDialog("Skriv en pris");
		String belopBetalt = showInputDialog("Skriv belop betalt");
		
		int prisInt = Integer.parseInt(pris);
		int belopInt = Integer.parseInt(belopBetalt);

		if (belopInt > prisInt) {
			int differanse = belopInt - prisInt;
			System.out.println("Vekslepenger: " + differanse);
			int tierTilbake = differanse / 10;
			int enTilbake = differanse % 10;
			
			System.out.println("Du skal få tilbake " + tierTilbake + " Tiere " + enTilbake + " Enere.");
		}
		
		
		
	}

}
