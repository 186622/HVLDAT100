import java.util.ArrayList;
import java.util.List;

public class Oppgave3 {

	List<Integer> liste = new ArrayList<>();
	
	liste.add(10);
	liste.add(20);
	liste.add(30);
	liste.add(20);
	liste.add(40);
	
	list.add ("tekst"); // Dette vil gi en feil melding
	
	System.out.println("Element på plass 4 " + liste.get(3));
	System.out.println("Element på plass 5 " + liste.get(4));

	// Skriver ut elementene i listen
	System.out.println("Antall elementer i listen " + liste.size());
	
	// legge til nytt element i plass 2
	
	liste.add(1, 15) // Setter index 1, som er plass 2 til 15
	System.out.println("Listen etter å legge til element " + liste);
	
	
	// Sjekker om et element finnes i listen
	
	System.out.println("Finnes 20 i listen? " + liste.contains(20));
	System.out.println("Finnes 50 i listen" + liste.contains(50));
	
	
	
	
	// Finn posisjonen til første og siste forekomst av et element
	int førstePosisjon = liste.indexOf(20);
	int sistePosisjon = liste.indexOf(20);
	
	System.out.println("Første forekomst av 20: "+ førstePosisjon);
	System.out.println("Siste forekomst av 20:" + sistePosisjon);
	
	
	liste.clear();
	
	if (liste.isEmpty) {
		System.out.println("Is empty") ;
	} else {
		System.out.println("Not Empty");
	}
	
	
	
	
	
}
