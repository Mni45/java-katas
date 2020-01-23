import org.junit.Assert;
import org.junit.Test;

public class FactorialTest {


    @Test(expected = IllegalArgumentException.class)
    public void testIsNegative() throws Exception {
        Factorial.factoriel(-5);
        Factorial.recursiveFactoriel(-5);

    }
    
    @Test
    public void testNominalCase() throws Exception {
	  Assert.assertEquals(1,Factorial.factoriel(0));
	  Assert.assertEquals(1,Factorial.factoriel(1));
	  Assert.assertEquals(2,Factorial.factoriel(2));
	  Assert.assertEquals(6,Factorial.factoriel(3));
	  Assert.assertEquals(24,Factorial.factoriel(4));
	  Assert.assertEquals(120,Factorial.factoriel(5));
	  Assert.assertEquals(1,Factorial.recursiveFactoriel(0));
	  Assert.assertEquals(1,Factorial.recursiveFactoriel(1));
	  Assert.assertEquals(2,Factorial.recursiveFactoriel(2));
	  Assert.assertEquals(6,Factorial.recursiveFactoriel(3));
	  Assert.assertEquals(24,Factorial.recursiveFactoriel(4));
	  Assert.assertEquals(120,Factorial.recursiveFactoriel(5));
    }
   

}
