import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Oppgave5 {

	public static void Main(String[] args) {
		List<String> ordListe = new ArrayList<>();
        ordListe.add("er");
        ordListe.add("det");
        ordListe.add("alle");
        ordListe.add("er");
        ordListe.add("det");
        ordListe.add("det");
        
        
        // Lager HashMap for å telle frekvensen av ordene //
        Map<String, Integer> frekvensMap = new HashMap<>();
        
        // Går gjennom listen og oppdatere frekvensen i HashMap //
        for (String ord : ordListe) {
        	frekvensMap.put(ord, frekvensMap.getOrDefault(ordListe,  0) + 1);
        }
        
        
        
        // Skriver ut frekvensoversikten //
        System.out.println("Frekvensoversikt");
        for (Map.Entry<String, Integer> entry : frekvensMap.entrySet()) {
        	System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        
        
        
        
        // Leser inn ord fra brukeren og skriver ut frekvensen //
        Scanner scanner = new Scanner(System.in);
        System.out.println("Skriv inn et ord for å finne frekvensen");
        String inputOrd = scanner.nextLine();
        
        // Sjekker frekvensen til det ordet //
        int frekvens = frekvensMap.getOrDefault(inputOrd, 0);
        System.out.println("Frekvensn av" + inputOrd + "= " + frekvens);
        
        
	}
}
