import easygraphics.*;
import static javax.swing.JOptionPane.*;

public class OppgaveV2 extends EasyGraphics {

  public static void main(String[] args) {
    launch(args);
  }

  public void run() {
    String prosentVerdi = showInputDialog("Skriv inn prosentvis størrelse (f.eks. 50 for 50%)");
    int prosent = Integer.parseInt(prosentVerdi);
    
    // Start dimensjoner på flagget
    int originalWidth = 300;
    int originalHeight = 200;
    int stripeWidth = originalWidth / 3;
    
    // Beregn nye dimensjoner basert på prosentverdien
    int newWidth = originalWidth * prosent / 100;
    int newHeight = originalHeight * prosent / 100;
    int newStripeWidth = stripeWidth * prosent / 100;

    makeWindow("Det franske flagget");

    // Tegn flagget med justerte dimensjoner
    setColor(0, 0, 255); // Blå stripe
    fillRectangle(50, 50, newStripeWidth, newHeight);
    
    setColor(255, 255, 255); // Hvit stripe (midten)
    fillRectangle(50 + newStripeWidth, 50, newStripeWidth, newHeight);
    
    setColor(255, 0, 0); // Rød stripe
    fillRectangle(50 + 2 * newStripeWidth, 50, newStripeWidth, newHeight);
    
    setColor(0, 0, 0); // Tegn en ramme rundt flagget
    drawRectangle(50, 50, newWidth, newHeight);
  }
}
