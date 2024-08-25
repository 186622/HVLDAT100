
import java.util.Scanner;

public class OppgaveV1 {

	public static void main(String[] args) {

		String brukernavn = null;
		String passord = null;

		Scanner input = new Scanner(System.in);

		String funksjonTxt = "Velg funksjon\n a) - opprette konto\n b) - endre passord\n c) - slette konto\n d) - login";

		System.out.println(funksjonTxt);
		System.out.print(">");

		String valgTxt = input.nextLine();


		if (valgTxt.equals("a")) {
		    System.out.print("Opprett konto\nBrukernavn:");
		    brukernavn = input.nextLine();
		    System.out.print("Passord:");
		    passord = input.nextLine();
		} else if (valgTxt.equals("b")) {
		    System.out.print("Endre passord\nGammelt passord:");
		    passord = input.nextLine();
		    System.out.print("Nytt passord:");
		    passord = input.nextLine();
		} else if (valgTxt.equals("c")) {
		    System.out.print("Slette bruker\nBrukernavn:");
		    brukernavn = input.nextLine();
		    System.out.print("Passord:");
		    passord = input.nextLine();
		} else if (valgTxt.equals("d")) {
		    System.out.print("Slette bruker\nBrukernavn:");
		    brukernavn = input.nextLine();
		    System.out.print("Passord:");
		    passord = input.nextLine();
		} else {
		    System.out.println("Ingen funksjon valgt");
		}

		
		
		System.out.println(brukernavn);
		System.out.println(passord);

		input.close();
	}

}
