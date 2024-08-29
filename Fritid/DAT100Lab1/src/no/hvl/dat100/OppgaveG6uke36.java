public class OppgaveG6uke36 { // Mangler Åpne klamme for class
  public static void main(String[] args) {

    int a = 5;
    String s = "Hei"; 
    double b = 4.2; // Manglet deklarering for datatype for B. 

    System.out.println(a);
    System.out.println(s);
    System.out.println(b);
    System.out.println(s + a + 3);
    System.out.println(3 + a + s);
    System.out.println(s.equals("H")); // Her må vi bruke .equals siden vi ikke kan ta String ==, men må .equals
    System.out.println(7 / a);
    System.out.println(13 - 2 * 5);

    int c = 1578;
    String cString = Integer.toString(c); // c.lenght er ikke en metode for INT. men for Strings. kan ta bruke toString for å konvertere int til string, og dermed bruke metoden
    System.out.println(cString.length());
    System.out.println(s.length());
    
  	} // Manglet luklke klamme for Main method.
  } // Manglet lukke klamme for Class