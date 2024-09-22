package no.hvl.dat100;

public class OppgaveG2Uke39 {

	public static void main(String[] args) {

	    double[][] obs = {
	    				{1.4,1.7,1.9,2.0},
	    				{5.4,7.8,9.8,7.9,3.0},
	    				{-1.7,-1.7,-2.8}
	    		};
	    
	    double limit = 6.0; // Hører til oppgave D

	    // TODO - legg til metodekall her
	    	//skrivUt(obs); // fra Oppgave A)
	    	//skrivUtUtvidet(obs);
	    	
	    	
	    	//B)
	    	System.out.println("Lengden er "  + obs.length);
	    	// lengden blir 3 fordi at Arrayet OBS har tre tabeller inni seg, ettersom at det er to demisjonal. Lengden av OBS blir da antall 
	    	// Tabeller som er i arrayet OBS.
	    	
	    	
	    	//c)
	    	System.out.println("Obs[0] Lengde er: " + obs[0].length + "Obs[1] Lengde er: " + obs[1].length + "Obs[2] Lengde er: " + obs[2].length);
	    	// Det som skrives ut her er lengden av de 3 ulike tabellene som finnes i OBS. Altså hvor mange elementer det er i tabellene.
	    	
	    	boolean resultat = finnes(obs, limit); // Hører til oppgave D
	    	
	    	
	    	// Oppgave E)
	    	
	    	double[] temp = obs[0];
	    	obs[0] = obs[2];
	    	obs[2] = temp;
	    	
	    	skrivUt(obs);
	    	
	    	
	    	
	    	
		}

	  // TODO - legg til deklarasjon av metoder her
	
	//a)
	
	public static void skrivUt(double[][] tabell) {
	    for (int i = 0; i < tabell.length; i++) {  // Ytre løkke går gjennom radene
	        for (int j = 0; j < tabell[i].length; j++) {  // Indre løkke går gjennom kolonnene
	            System.out.print(tabell[i][j] + " ");  // Skriver ut hvert element
	        }
	        System.out.println();  // Ny linje etter hver rad
	    }
	}
	
	
	public static void skrivUtUtvidet(double[][] tabell) {
		
		for (double[] rad : tabell) {
			
			for (double element : rad) {
				System.out.print (element + " ");
			}
			System.out.println();

		}

	}
	
	
	
	// Oppgave D:
	public static boolean finnes(double[][] obs, double limit) {
		boolean finnes = false;
		for (double[] rad : obs) {
			
			for(double element : rad) {
				
				if (element > limit) {
				System.out.println(element + " Er Større Enn limit");
				finnes = true;
			}
			
		}
		
		
		
	}
	
return finnes;
	
	
}
}
