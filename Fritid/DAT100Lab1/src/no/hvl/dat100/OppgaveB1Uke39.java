package no.hvl.dat100;
import java.util.Scanner;
public class OppgaveB1Uke39 {

	public static void main(String[] args) {
		
		double temperaturer[] = new double[7];
		
		System.out.println("Analyse av temperaturer");
		System.out.println("***********************");

		Scanner scanner = new Scanner(System.in);
		
		for (int i = 0; i < temperaturer.length; i++) {
			System.out.print(i + 1 + ". Dag ");
			temperaturer[i] = Double.parseDouble(scanner.nextLine());
			
		}
		
		double sum = 0;
		for (double temp : temperaturer) {
			sum += temp;
		}
		
		
		double gjennomsnitt = sum / temperaturer.length;
		System.out.println("Gjennomsnittstemperaturen var " + gjennomsnitt);
		
		double maksimum = temperaturer[0];
		for(int j = 1; j < temperaturer.length;j++) {
			if (temperaturer[j] > maksimum) {
				maksimum = temperaturer[j];
			}
		}
		
		System.out.println("Maksimum for denne uken var " + maksimum + " grader");
		
		
		
		scanner.close();

		
	}

}
