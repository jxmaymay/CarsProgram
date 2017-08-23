/** 
 * Abstract Car parent class.
 * @author Mason Jenkins
 */

public abstract class Car {
	
	private double price;
	
	public Car(double p) {
		price = p;
	}
	
	public double getPrice() {
		return price;
	}
}
