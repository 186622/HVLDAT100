package no.hvl.dat100;
import static javax.swing.JOptionPane.*;

public class OppgaveG3Uke39 {
	public static void main(String[] args) {

		int breddeStr = lesInnTall(" som bredde");

		int hoydeStr = lesInnTall(" som Høyde:");

		int a = areal(breddeStr,hoydeStr);

		showMessageDialog(null,"Areal: " + a);
	}

	private static int areal(int bredde, int hoyde) {

		int flateareal = bredde * hoyde;

		return flateareal;
	}
	
	// a)
	//private static int lesInnTall(String message) {
		//String lesInn = showInputDialog("Skriv in et tall:");
	//	int lesInnInt = Integer.parseInt(lesInn);
		//showMessageDialog(null, lesInnInt + message);
	//	
		//return lesInnInt;
		
		
	//}
	
	
	// Oppgave C)
	private static int lesInnTall(String message) {
		
		int lesInnInt = 0;
		do {
	
			String lesInn = showInputDialog("Skriv in et tall:");
			lesInnInt = Integer.parseInt(lesInn);
			showMessageDialog(null, lesInnInt + message);
			
	
		} while (lesInnInt < 0);
		return lesInnInt;
		
		
		
	}
	
	
	
}