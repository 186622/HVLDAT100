package no.hvl.dat100;

public class OppgaveG4Uke39 {

	 public static void main(String[] args) {
	        // Skriver ut tabelloverskriften
	        System.out.println("  x i grader  x i radianer    sin(x)    cos(x)");
	    //    System.out.println("------------------------------------------------");

	        // Bruker en for-løkke for å iterere fra 0 til 180 grader med 15 graders intervall
	      //  for (int x = 0; x <= 180; x += 15) {
	            // Beregn vinkel i radianer
	      //      double radianer = Math.toRadians(x);
	            
	            // Beregn sinus og cosinus
	       //     double sinX = Math.sin(radianer);
	       //     double cosX = Math.cos(radianer);
	            
	            // Skriv ut resultatet med 3 desimaler
	      //      System.out.printf("%10d %12.3f %10.3f %10.3f\n", x, radianer, sinX, cosX);
	     //   }
	     //   System.out.println("------------------------------------------------");
	   // }
	 
	 
	   int x = 0;
       
       // Bruker en while-løkke for å iterere fra 0 til 180 grader med 15 graders intervall
       while (x <= 180) {
           // Beregn vinkel i radianer
           double radianer = Math.toRadians(x);
           
           // Beregn sinus og cosinus
           double sinX = Math.sin(radianer);
           double cosX = Math.cos(radianer);
           
           // Skriv ut resultatet med 3 desimaler
           System.out.printf("%10d %12.3f %10.3f %10.3f\n", x, radianer, sinX, cosX);
           
           // Øk vinkelen med 15 grader
           x += 15;
       }
       System.out.println("------------------------------------------------");
   }
	 
	 

}
