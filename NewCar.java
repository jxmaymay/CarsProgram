/** 
 * New car class.
 * @author Mason Jenkins
 */

public class NewCar extends Car {
	
	private String color;
	
	public NewCar(double p, String c) {
		super(p);
		color = c;
	}
	
	public void display() {
		System.out.println("price = $" + getPrice() * 2 + ", color = " + color);
	}
	
	public boolean equals(NewCar car2) {
		if (getPrice() == car2.getPrice()) {
			if (color == car2.color) {
				return true;
			}
			
			else {
				return false;
			}
		}
		
		else {
			return false;
		}
	}
}
