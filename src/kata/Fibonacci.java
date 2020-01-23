package kata;

public class Fibonacci {

	public static int Fibo(int n) {
    	
		
		if (n<0 ) 
			throw new IllegalArgumentException("n must be positive");
		
    	int fibo;    	
    	if ( n == 0 ) {    		
    		fibo=0;
    		return fibo; 
    	}
    	
    	if (n == 1 )    		
    		fibo = 1;    	
    	else     		
    		fibo = Fibo(n-1) + Fibo(n-2);    	
    	
    	return fibo;    	
    	
    }
}
