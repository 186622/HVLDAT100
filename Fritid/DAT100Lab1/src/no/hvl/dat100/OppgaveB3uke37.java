package no.hvl.dat100;
import javax.swing.JOptionPane;

public class OppgaveB3uke37 {

	 public static void main(String[] args) {
	        // Lese inn x og n fra brukeren
	        String xText = JOptionPane.showInputDialog("Angi verdien for x (kan være desimal):");
	        String nText = JOptionPane.showInputDialog("Angi verdien for n (positivt heltall):");

	        // Konvertere fra tekst til henholdsvis double og int
	        double x = Double.parseDouble(xText);
	        int n = Integer.parseInt(nText);

	        // Beregn x^n ved bruk av Math.pow
	        double resultatMathPow = Math.pow(x, n);

	        // Beregn x^n ved bruk av en løkke
	        double resultatLoop = 1.0;
	        for (int i = 1; i <= n; i++) {
	            resultatLoop *= x;
	        }

	        // Skriv ut resultatene
	        String respons = "Resultat ved Math.pow: " + resultatMathPow + "\n" +
	                         "Resultat ved løkke: " + resultatLoop;

	        JOptionPane.showMessageDialog(null, respons);
	    }

}
