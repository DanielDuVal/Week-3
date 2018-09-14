package commandPattern;

public class Oven {

	public static final int HIGH = 500;
	public static final int MEDIUM = 400;
	public static final int LOW = 300;
	public static final int OFF = 0;
	String location;
	int temp;
	
	public Oven(String location) {
		this.location = location;
		temp = OFF;
		System.out.println("Oven is off");
	}
	
	public void high() {
		temp = HIGH;	// set oven to high
		System.out.println("Oven is on high");
	}
	
	public void medium() {
		temp = MEDIUM;	// set oven to medium
		System.out.println("Oven is on medium");
	}
	
	public void low() {
		temp = LOW;		// set oven to low
		System.out.println("Oven is on low");
	}
	
	public void off() {
		temp = OFF;
		System.out.println("Oven is off");
	}
	
	public int getTemp() {
		return temp;
	}
}
