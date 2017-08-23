/** 
 * Used car class.
 * @author Mason Jenkins
 */

public class UsedCar extends Car {
	
	private int mileage;
	
	public UsedCar(double p, int m) {
		super(p);
		mileage = m;
	}
	
	public boolean equals(UsedCar car2) {
		if (getPrice() == car2.getPrice()) {
			if (mileage == car2.mileage) {
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
	
	public void display() {
		System.out.print("price = $" + getPrice() * 2);
		System.out.print(", mileage = " + mileage);
	}
}
