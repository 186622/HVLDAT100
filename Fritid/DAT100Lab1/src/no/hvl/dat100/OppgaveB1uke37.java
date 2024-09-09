package no.hvl.dat100;
import javax.swing.*;
public class OppgaveB1uke37 {

	  public static void main(String[] args) {

	      String fortekst = "Areal av en sirkel med radius ";

	      double pi = Math.PI;

	      String radiustext = JOptionPane.showInputDialog("Angi radius:");

	      int radius = Integer.parseInt(radiustext);
	      double areal = pi * radius * radius;

	      String respons = fortekst + "er " + areal;

	      JOptionPane.showMessageDialog(null,respons);
	    }

}


// Jeg merker at når jeg har flere breakpoints. Vil den ikke steppe over når vi har kommet forbi et breakpoint.
// Dette er nok fordi at eclipse stopper koden ved hvert pause punkt for å inspisere variablene. Som er nyttig i debugging.