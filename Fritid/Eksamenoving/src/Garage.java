public class Garage {
	
	private String location;
	private int space;
	private int MAXSPACE = 5;
	
	public Garage(String location, int space) {
		this.location = location;
		this.space = space;
	}
	
	
	public String getLocation() {
		return this.location;
	}
	
	public void setLocation(String location) {
		this.location = location;
	}
	
	public int getSpace() {
		return this.space;
	}
	
	public void setSpace(int space) {
		this.space = space;
	}
	
	
	public boolean storeCar(Car car, Garage garage) {
		
		if (garage.getSpace() <= MAXSPACE) {
			return false;
		} else {
			space++;
			return true;
		}
		
	}
	
	
	
	
	
}