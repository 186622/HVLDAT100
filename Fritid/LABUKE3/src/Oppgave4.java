import java.util.HashSet;
import java.util.Set;

public class Oppgave4 {

	
	public static void Main(String[] args) {
		
		Set<String> mengde1 = new HashSet<>();
		Set<String> mengde2 = new HashSet<>();
		
		
		mengde1.add("Apple");
		mengde1.add("Banana");
		mengde2.add("Banana");
		
		System.out.println("Mengde 1 " + mengde1);
		System.out.println("Mengde 2 " + mengde2);

		
		// Finnes felles mengder //
		Set<String> snitt = new HashSet<>(mengde1);
		snitt.retainAll(mengde2); // Gjør at vi finner elementer som er i begge
		
		System.out.println("Snitt: " + snitt);
		
		
		//Skrive ut med utvidet for løkke //
		for (String s : mengde1) {
			System.out.println(s);
		}
		
		for (String s : mengde2) {
			System.out.println(s);
		}
		
		
	}
	
	// Finner Unionen - Snitt fant vi i A) //
	
	Set<String> union = new HashSet<>(mengde1);
	union.addAll(mengde2); // Legger til alt fra 2 i 1;
	System.out.println("Unionen er " + union);
	
	
	
}
