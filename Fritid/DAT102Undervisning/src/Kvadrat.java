
public class Kvadrat implements Figur2D {
	
	private double side;
	
	
	
	
	//.. New Kvadrat(3.5);
	public Kvadrat(double side) {
		//super(); -- Trenger ikke Super fordi kontstuktørene til Alle objektene kjøres og da blir super konstukrturen kjørt uansett
		this.side = side; // Kan bruke hvis super har flere konstuktører, hvis ikke blir standard kjørt
	}



	@Override
	public double areal() {
		
		return side * side;
	}
	
	
	
	@Override
	public double omkrets() {
		
		return 4 * side;
	}
}
