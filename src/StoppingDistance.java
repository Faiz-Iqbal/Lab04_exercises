import java.util.Scanner;

public class StoppingDistance {

	public static void main(String[] args){
		// Initialize variables to store Stopping distance, speed, fatigue and humidity
		float stoppingDistance;
		int speed, temp = 0; //temp is a temporary variable used to store the humidity choice
		float fatigue,humidity = 0;
		
		//Scanner to take user input
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Welcome to Braking Distance Calculator");
		System.out.println();
		
		System.out.println("Please enter your speed: ");
		speed = scan.nextInt();
		
		System.out.println("Please enter your fatigue level (1 to 3): ");
		fatigue = scan.nextFloat();
		
		System.out.println("Please enter humidity level (1 - Wet Road, 2 - Dry Road)");
		temp = scan.nextInt();
		if (temp == 1) {
			humidity = 0.8f;
		}else if(temp == 2) {
			humidity = 0.4f;
		}
		
		System.out.println();
		
		stoppingDistance = getStoppingDistance(speed,fatigue,humidity);
		System.out.println("Your Stopping distance is : " + stoppingDistance + " meters");
		
		scan.close();
	}

	public static float getStoppingDistance(int s, float f, float h) {
		float dr = f * s * (1000/3600);
		float db = (s*s) / (254*h);
		
		float ds = dr + db;
		return ds;
	}
}
