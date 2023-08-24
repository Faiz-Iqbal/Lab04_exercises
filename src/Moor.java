import java.text.DateFormatSymbols;
import java.util.Scanner;

public class Moor {

	public static void main(String[] args) {
		//Variable to store performance in Ghz
		double result = 0;
		
		//Asks user the month
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a month (1 to 12) ");
		int m = input.nextInt();
		
		//Asks user the year
		System.out.print("Enter a year posterior to 2006 ");
		int y = input.nextInt();

		//invokes the method moor to calculate performance
		result = moor(m,y);
		System.out.println("The performance in the year " + y + " is " + result + " Ghz");
		
		//closes scanner
		input.close();
	}

	public static double moor(int month, int year) {
		//variable to store performance
		double performance;
		
		//calculate the number of years from 2006
		int years = year - 2006;
		//variable to store the number of months since 2006
		int m = 0;
		
		//for loop that calculates the number of years from 2006 and adds 12 months to m for each full year
		for (int i = years; i>0 ; i--) {
			m += 12;
		}
		//adds the months entered by the user 
		m = m + month;
		
		//moors law
		performance = 3 * (Math.pow(2, (m/18)));
		
		//return statement to send the final performance back to the main method
		return performance;
	}
}
