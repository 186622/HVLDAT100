package no.hvl.dat100;

public class OppgaveG1Uke39 {

	public static void main(String[] args) {
		// Tabeller og metodeskall her
		
		//a)
		int[] tabell = {1, 3, 4, 7, 9, 10};
		int tall = 2; //Fra oppe gave g
		int[] nyTabell = skiftFortegn(tabell); // Oppgave H
		
		//b)
		
		//System.out.println(tabell[2]);
		
		
		
		//c)
	//	tabell[2] = 7;
		//System.out.println(tabell[2]);
		
		
		//d)
		
		//for (int i = 0; i < tabell.length; i++) {
			
		//	System.out.println(i + ":" + tabell[i]);
	//	}
		
		
		skrivUt(tabell);
		skrivUt(nyTabell); // Oppgave h
		boolean resultat = finnes(tabell, tall);// Oppgave G
		System.out.println(resultat); // OppgaveG
		
	}
	
	//e)
	
	public static void skrivUt(int[] tab) {
		
		//for (int i = 0; i < tab.length; i++) {
		//
			//System.out.println(i + ":" + tab[i]);
	//	}
		
		
		//f)
			for (int tabell : tab) {
				System.out.println(tabell);

			}
			
		
	}
	
	//Metoder under her
	
	
	//g)
	public static boolean finnes(int[] tabell, int tall) {
		int i = 0;
		while(i < tabell.length) {
			if (tabell[i] == tall) {
				return true;
			}
			i++;
		}
		return false;
		
		
		
	}
	
	
	//h)
	public static int[] skiftFortegn (int[] tabell) {
		int[] nyTabell = new int[tabell.length];
		for (int i = 0; i <  tabell.length; i++) {
			nyTabell[i] = tabell[i] * -1;
			
		}
		return nyTabell;

	}
	
	
	
	

}
