/* Design of Car class
 * 
 * Instance variables
 * make will represent the name of the company that makes the car
 * model will represent the name of that specific car
 * year will represent the year the car was made
 * 
 * Constructor
 * set make to the empty string ""
 * set model to the empty string ""
 * set year to 2021		
 * 
 */
public class Car {
	private String make; // Private means the instance variables cannot be accessed outside the class
	private String model;
	private int year;
	//default constructor
	public Car() {
		make = "";
		model = "";
		year = 2021;
	}
	//non-static method
	public int computeAge() {
		int currentYear = 2021; // local variable only exist in the computeAge method
		int age = currentYear - year;
		return age;
	}
	//setters or mutator method
	public void setMake(String newMake) {
		make = newMake;
	}
	public void setModel(String newModel) {
		model = newModel;
	}
	public void setYear(int newYear) {
		if(newYear >= 1890 && newYear <= 2021) {
			year = newYear;
		}
	}
	//getters or accessor methods
	public String getMake() {
		return make;
	}
	public String getModel() {
		return model;
	}
	public int getYear() {
		return year;
	}
}

