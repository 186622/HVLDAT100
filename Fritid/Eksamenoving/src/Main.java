
public class Main {

	public static void main(String[] args) {
	
		
		Garage g1 = new Garage("Haugesund", 3);
		Garage g2 = new Garage("Bergen", 2);
		
		Car car1 = new Car("BMW", "Green");
		Car car2 = new Car("VOLVO", "Grey");
		Car car3 = new Car("MERCEDES", "Yellow");
		
		g1.storeCar(car1, g1);
		
		

	}

}
