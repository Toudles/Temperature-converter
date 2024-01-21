/* Name: [Andrew Park] NetdID: [ap6905]
Course: [CSCI-UA 101]
Description: [ceslsius/farenheit converter]
Date: [9/21/2023]
*/

//import Scanner for input//
import java.util.Scanner;

public class Convert {
	public static void main(String[] args) {
		
		//create a scanner object//
		Scanner temperature = new Scanner(System.in);
		System.out.println("Enter temperature (celsius): ");
		
		//Read the user input (celsius)//
		double celsius = temperature.nextDouble();
		//convert celsius into farenheit//
		double farenheit = ((celsius * 9)/5) + 32;
		
		//print celsius and farenheit converted values//
		System.out.println("Celsius is " + celsius + "C");
		System.out.println("Your converted farenheit is " + farenheit + "f");
		
		
		System.out.println("Enter temperature (farenheit): ");
		//Read the user input (farenheit)//
		double farenheit2 = temperature.nextDouble();
		//convert farnheit into celsius//
		double celsius2 = ((farenheit2 - 32) *5) / 9;
		
		//print celsius and farenheit converted values//
		System.out.println("Farenheit is " + farenheit2 + "f");
		System.out.println("Your converted celsius is " + celsius2 + "C");
		
				
		
		
	}
	

}
