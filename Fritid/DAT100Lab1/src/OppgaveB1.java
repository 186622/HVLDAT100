
public class OppgaveB1 {

	public static void main(String[] args) {
		double radius = 5.0; // Definerer radiusen, dette kan vi endre slik vi vil
		double volum = beregneVolum(radius); // Lager en metode som kalles for beregnVolum, med parameter radius som vi kaller senere
		
		System.out.println("Volumet av en kule med radius " + radius + " er " + volum);
		
		

		
	}
	public static double beregneVolum(double radius) {
		return (4.0 / 3.0) * Math.PI  + Math.pow(radius,  3);
		
		//4.0 / 3.0 * math:pi er den korrekte formel for å regne ut volum av en kule.
		//Math.Pow(radius, 3); Er det samme som å ta radius opphøyd i 3
	}
	

}
