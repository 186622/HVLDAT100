package no.hvl.dat100;
import static javax.swing.JOptionPane.*;

public class OppgaveG5uke36 {

	public static void main(String[] args) {
		
		String inputEn = showInputDialog("Tall 1:");
		String inputTo = showInputDialog("Tall 2:");
		String inputTre = showInputDialog("Tall 3:");
		String inputFire = showInputDialog("Tall 4:");
		
		int intEn = Integer.parseInt(inputEn);
		int intTo = Integer.parseInt(inputTo);
		int intTre = Integer.parseInt(inputTre);
		int intFire = Integer.parseInt(inputFire);

		int minstavEnogTo = Math.min(intEn, intTo);
		int minstavTreogFire = Math.min(intTre, intFire);
		int minstAvAlle = Math.min(minstavEnogTo, minstavTreogFire);
		
		System.out.println("Tallet som er minst er: " + minstAvAlle);
		
		
	}

}
