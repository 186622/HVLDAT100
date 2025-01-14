
public class Main {
	
	
	
	
	public static void skrivUt(Figur2D f) { // Bruker interface typen Enten k eller s
		System.out.println(f.areal()); // K og S er gyldig objekt typer for Figur
		System.out.println(f.omkrets()); // Siden de referer til en Figur
	}

	
	public static void main(String[] args) {
		
		Kvadrat k = new Kvadrat(3); // Kan også bruke Interface type istedefor KVarat
		skrivUt(k); // EKS: Figur2D k = new Kvadrat(3); Vil også fungere, og helst bruke det
		
		
		
		
		
		Sirkel s = new Sirkel(3);
		skrivUt(s);

	}
}
