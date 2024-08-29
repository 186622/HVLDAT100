package no.hvl.dat100;
import static javax.swing.JOptionPane.*;
public class OppgaveG4uke36 {

	public static void main(String[] args) {
		//del 1)
		String tallEn = showInputDialog("Skriv in et heltall");
		String tallTo = showInputDialog("Skriv in et heltall till.");
		
		int svar = Integer.parseInt(tallTo) + Integer.parseInt(tallTo);		
		
		System.out.println(tallEn +  " + " + tallTo + " Er: " +  svar);
		
		//Del 2
		String lengde = showInputDialog("Skriv inn lengde");
		String bredde = showInputDialog("Skriv inn bredde."); 
		
		int resultat = (Integer.parseInt(lengde) * Integer.parseInt(bredde));
		
		showMessageDialog(null, resultat);
		
		
		
	}

}
