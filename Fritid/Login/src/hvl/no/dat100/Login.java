package hvl.no.dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.Double.*;
public class Login {

	public static void main(String[] args) {
		String Text = showInputDialog("Skriv inn beløp");
	
		double moms = parseDouble(Text) * 0.25;
		
		String UtText = "Beløp" + Text + "

	}

}
