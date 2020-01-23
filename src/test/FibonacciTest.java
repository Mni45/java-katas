package test;

import org.junit.Assert;
import org.junit.Test;

import kata.Fibonacci;

public class FibonacciTest {
	
  @Test(expected = IllegalArgumentException.class)
    public void testIsNegative() throws Exception {
        Fibonacci.Fibo(-5);
    }
    
    @Test
    public void testNominalCase() throws Exception {
	  Assert.assertEquals(0,Fibonacci.Fibo(0));
	  Assert.assertEquals(1,Fibonacci.Fibo(1));
	  Assert.assertEquals(1,Fibonacci.Fibo(2));
	  Assert.assertEquals(2,Fibonacci.Fibo(3));
	  Assert.assertEquals(3,Fibonacci.Fibo(4));
	  Assert.assertEquals(5,Fibonacci.Fibo(5));
	  Assert.assertEquals(8,Fibonacci.Fibo(6));
	  Assert.assertEquals(13,Fibonacci.Fibo(7));
	  Assert.assertEquals(21,Fibonacci.Fibo(8));
	  Assert.assertEquals(34,Fibonacci.Fibo(9));
    }

}
