
public class Sirkel implements Figur2D {

	private double radius;
	
	public Sirkel(double radius) {
		super();
		this.radius = radius;
	}

	@Override
	public double areal() {
		return Math.PI * radius * radius;
	}

	@Override
	public double omkrets() {
		return 2 * Math.PI * radius;
	}

	
	
}
