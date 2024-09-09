import static javax.swing.JOptionPane.*;
public class Oppgave03Fakultet {

	public static void main(String[] args) {

		String nStreng = showInputDialog("Skriv in heltall, større enn 0");
		
		int n = Integer.parseInt(nStreng);
		if (n <= 0 ) {
			showMessageDialog(null, "Må være større en 0");
			return;
		}
		
		
		int fakultet = 1;
		for (int i =1; i <=n; i++) {
			fakultet *= i;
		}
		
		
		String resultat = "Fakultet av " + n + "(" + n + "! " + ") " +  " = " +  fakultet;
		showMessageDialog(null, resultat);
		

	}

}
