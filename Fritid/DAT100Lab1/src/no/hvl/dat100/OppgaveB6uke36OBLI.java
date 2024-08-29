package no.hvl.dat100;
import static javax.swing.JOptionPane.*;

public class OppgaveB6uke36OBLI {

	public static void main(String[] args) {
		String brutto = showInputDialog("Skriv inn brutto beløp");
		int bruttoInt = Integer.parseInt(brutto);
		final int IKKEBETALE = 208050;
		int totalInntekt = bruttoInt;
		
		double trinnEn = 1.7 / 100; // inntekt fra 208051 - 292850
		double trinnTo = 4.0 / 100;// Inntekt fra 292851 - 670000
		double trinnTre = 13.6 / 100; // inntekt fra 670001 - 937900
		double trinnFire = 16.6 / 100; // inntekt fra 937901 - 1350000
		double trinnFem = 17.6 / 100; //Inntekt fra 1350001

 
		double skatt = 0.0;
		while (totalInntekt > IKKEBETALE) {
				if (totalInntekt > 208051 && totalInntekt < 292850) { // Trinn 1
					 skatt = totalInntekt * trinnEn;
					System.out.println("Du haver i Trinn 1 og må betale: " + skatt + " kroner i skatt");
					break;
				} else if (totalInntekt > 292851 && totalInntekt <670000) { // Trinn 2
					skatt = totalInntekt * trinnTo;
					System.out.println("Du haver i Trinn 2 og må betale: " + skatt + " kroner i skatt");
					break;

					
				} else if (totalInntekt > 670001 && totalInntekt < 937900) { // Trinn 3
					skatt = totalInntekt * trinnTre;
					System.out.println("Du haver i Trinn 3 og må betale: " + skatt + " kroner i skatt");
					break;

				} else if (totalInntekt > 937901 && totalInntekt < 1350000) { // Trinn 4
					skatt = totalInntekt * trinnFire;
					System.out.println("Du haver i Trinn 4 og må betale: " + skatt + " kroner i skatt");
					break;

				} else if (totalInntekt > 1350001) { // Trinn 5
					skatt = totalInntekt * trinnFem;
					System.out.println("Du haver i Trinn 5 og må betale: " + skatt + " kroner i skatt");
					break;

				} else {
					System.out.println("Inntekten din er lavere enn " + IKKEBETALE + " og du trenger ikke å skatte");

				}


			}
			
			
		
	
		
	}

}
