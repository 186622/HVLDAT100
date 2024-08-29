package no.hvl.dat100;

import static javax.swing.JOptionPane.showInputDialog;

public class OppgaveB1uke36 {

	public static void main(String[] args) {
		
		String inputEn = showInputDialog("Dagnummer:");
		String inputTo = showInputDialog("Månedsnummer:");
		String inputTre = showInputDialog("Årstall:");
		
		int intEn = Integer.parseInt(inputEn);
		int intTo = Integer.parseInt(inputTo);
		int intTre = Integer.parseInt(inputTre);
		
		System.out.println(intEn + "." + intTo + "." + intTre);
		

	}

}
