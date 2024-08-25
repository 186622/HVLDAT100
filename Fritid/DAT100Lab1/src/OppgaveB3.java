import static javax.swing.JOptionPane.*;
public class OppgaveB3 {

	public static void main(String[] args) {
		String inputBruker = showInputDialog("Skriv inn sekunder");
		int inputHeltall = Integer.parseInt(inputBruker);
		
		
		int timer = inputHeltall / 3600; //Beregner hvor mange timer det er i sekundene. 3600sek = 1 time.
		int minutter = (inputHeltall % 3600) / 60; //Bregner minutter ETTER at hele timene er trukket ifra. Det er det % 3600 gjør. Deretter får du resterende skeunder som du deler på 60 for å få minutter
		int sekunder = inputHeltall % 60; // Tar ud minuttene slik at vi får resterende i sekunder.
		
		
		String resultat = "Input; " + inputHeltall + " sekunder " + " Tilsvarer: " + timer + " timer " + minutter + "min " + sekunder + "sek";
		showMessageDialog(null, resultat); //Vi skriver null som en paramter/argument som tilhørere metoden ShoeMessageDialog. 
		//Paramere til metoden messageDialog er JOptionPane.showMessageDialog(Component parentComponent, Object message);
		// Siden vi ikke har noen paraent COmponent skriver fi null. Skriv at metoden ikke har et spesifik eier.ø
	}

}
