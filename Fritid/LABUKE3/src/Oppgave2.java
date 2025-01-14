
public class Oppgave2  { //(Rektangel)

}


public class Rektangel implements Figur {
	private int høyde;
	private int bredde;
	
	
	public Rektangel(int høyde, int bredde) {
		this.høyde = høyde;
		this.bredde = bredde;
	}
	
	
	public double areal() {
		return høyde * bredde;
	}
	
	
	public void  tegn() {
		for (int i = 0; i < høyde; i++) {
			for (int j = 0; j < bredde;  j++) {
				System.out.println("*");
			}
			System.out.println();
		}
	}
	
	
	
}



public class Trekant implements Figur {
	
	private int sideLengde;

	public Trekant(int sideLengde) {
		this.sideLengde = sideLengde;
	}
	
	public double areal() {
		return (sideLengde * sideLengde) / 2.0;
	}
	
	
	public void tegn() {
		for (int i = 0; i < sideLengde; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.println("*");
			}
			System.out.println();
		}
	}
	
	
	
}



List<Figur> figurere = new ArrayList();

figurer.add(new Rektangel(2,3));
figurer.add(new Trekant(3));


double samletAreal = 0;

for (Figur figur : figurer) {
	samletArea += figur.areal();
}

System.out.println("Samlet areal" + sametlArea);





for (Figur figur : figurer) {
	figur.tegn();
	System.out.println();
}




