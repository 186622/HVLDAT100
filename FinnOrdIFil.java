/* FinnOrdIFil.java
 *
 * Programmet leser inn et filnavn og et søkeord
 * fra brukeren, og skriver ut alle de linjene i
 * filen som inneholder søkeordet, påført linjenr.
 */
import java.io.*;
import static java.lang.System.*;
import static javax.swing.JOptionPane.*;

public class FinnOrdIFil {
  public static void main(String[] args) {
    String filnavn = showInputDialog("Filnavn:");
    String søkeord = showInputDialog("Søkeord:");
    try {
      BufferedReader fil =
        new BufferedReader(
          new FileReader(filnavn));
      String linje = fil.readLine();
      int linjenr = 1;
      while (linje != null) {
        if (linje.contains(søkeord))
          out.println(linjenr + ":" + linje);
        linje = fil.readLine();
        linjenr = linjenr + 1;
      }
      fil.close();
    }
    catch (Exception e) {
        out.println("Problem med " + filnavn);
    }
  }
}