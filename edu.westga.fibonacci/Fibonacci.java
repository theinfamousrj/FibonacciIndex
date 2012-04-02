/**
 * 
 */

/**
 * @author theinfamousrj
 *
 */
public class Fibonacci {

	int n;
	
	public Fibonacci(){
		
	}
	
	public Fibonacci(int n){
		this.n = n;
	}
	
	public int nrFibonacci(){
		int result = this.n;
		int Fn = 1;
		int Fn1 = 0;
		
		if(this.n < 0){
			result = 0;
		}
		
		//if(this.n == 0 || this.n == 1){
			//result = this.n;
		//}
		else {
			for(int i = 1; i < this.n; i++){
				result = Fn + Fn1;
				Fn1 = Fn;
				Fn = result;
			}
		}
		
		return result;
	}
	
	public int rFibonacci(int n){
		int result = n;	
		
		return result;
	}
	
}
