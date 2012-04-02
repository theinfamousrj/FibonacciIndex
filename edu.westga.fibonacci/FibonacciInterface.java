import java.util.Scanner;

/**
 * 
 */

/**
 * @author theinfamousrj
 *
 */
public class FibonacciInterface {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int n;
		
		System.out.print("What index of the fibonacci: ");
		n = in.nextInt();
		
		Fibonacci f = new Fibonacci(n);
		
		System.out.println(f.nrFibonacci());
		
		//f.rFibonacci(n);

	}

}
