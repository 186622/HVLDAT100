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
