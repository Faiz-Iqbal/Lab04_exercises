import java.util.Scanner;

public class Nipper {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of zeros for the threshold ");
		int n = input.nextInt();

		// calculate threshold
		double threshold = Math.pow(10, -n);

		// call niper()
		double e = niper(threshold);

		// write result and Math.E
		System.out.println("~e = " + e);
		System.out.println(" e = " + Math.E);
		input.close();

	}

	public static long factorial(int n) {
		if (n <= 1)
			return 1;
		return n * factorial(n - 1);
	}

	public static double niper(double threshold) {
		double e = 0; //approximation value 
		int n = 0; // Iteration counter 
		double delta = 0;
		
		do {
			delta = 1.0D / factorial(n);
			e += delta;
			n++;
		} while (delta > threshold);
		
		
		System.out.println("Number of iterations: " + n);
		return e;
	}

}
