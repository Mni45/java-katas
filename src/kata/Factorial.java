public class Factorial {

public static int factoriel (int n) {		
		
		if (n<0 ) 
			throw new IllegalArgumentException("n must be positive");
		
		
		int resultat=1;
		
		for (int i=1 ; i<=n ; i++) {
			resultat*=1*i;

		}
		
		return resultat;		
	
	}

	public static int recursiveFactoriel ( int n) {
		
		if (n<0 ) 
			throw new IllegalArgumentException("n must be positive");
		
		int factoriel;
		if (n == 0)
			factoriel = 1;
		 
		else
			
			factoriel = n*recursiveFactoriel(n-1);
		
		return factoriel;
		
	}
}
