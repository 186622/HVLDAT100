package no.hvl.dat100;

public class OppgaveB3uke36 {

	public static void main(String[] args) {

		//a)
		// Det som skjer når vi setter N til 32, er at vi til slutt vil nå den øvre grensen for heltall. 
		
		
		//b)
		int n = 1000;
		double fraVenstre = 0;
		    
		for (int i = 1; i <= n; i++) {
		    fraVenstre = fraVenstre + (1.0 / i);
		}
		System.out.println("Summen fra venstre mot høyre: " + fraVenstre);
		
		int n = 1000;
		double fraHøyre = 0;

		for (int i = n; i >= 1; i--) {
		    fraHøyre = fraHøyre + (1.0 / i);
		}

		System.out.println("Summen fra høyre mot venstre: " + fraHøyre);
		
		
		// Når jeg kjører disse to med samme N verdi, vil de ikke bli helt like. Ser det kun med store verdier for N.
		

	} 

}
