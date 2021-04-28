/* Design (Algorithm)
 * 
 * 
 * 1.  Ask the user for the make of their favorite car
 * 2.  Save the make of their favorite car
 * 3.  Ask the user for the model of their favorite car
 * 4.  Save the model of their favorite car
 * 5.  Ask the user for the year of their favorite car
 * 6.  Save the year of their favorite car
 * 7.  Create an object of the car class and refer to it as myFavoriteCar
 * 8.  Change the make instance variable of myFavoriteCar to the make from step #2
 * 9.  Change the model instance variable of myFavoriteCar to the model from step #4
 * 10. Change the year instance variable of myFavoriteCar to the year from step #6
 * 11. Print the make instance variable of myFavoriteCar
 * 12. Print the model instance variable of myFavoriteCar
 * 13. Print the year instance variable of myFavoriteCar
 * 
 * 
 */
import java.util.Scanner;
public class CarDemo {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Whats The make of your favorite car?");
		String newMake = keyboard.nextLine();
		
		System.out.println("Whats the model of your favorite car?");
		String newModel = keyboard.nextLine();
		
		System.out.println("Whats the year for your favorite car?");
		int newYear = keyboard.nextInt();
		//object
		Car myFavoriteCar = new Car();
		
		myFavoriteCar.setMake(newMake);
		myFavoriteCar.setModel(newModel);
		myFavoriteCar.setYear(newYear);
		
		System.out.println("Make: " + myFavoriteCar.getMake());
		System.out.println("Model: " + myFavoriteCar.getModel());
		System.out.println("Year: " + myFavoriteCar.getYear());
		
		int age = myFavoriteCar.computeAge();
		System.out.println("Age: " + age);

	}

}
