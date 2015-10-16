package test.gcd;

import org.junit.*;

import src.GCD;

import static org.junit.Assert.*;

public class TestGCD{

	// gcd1 test
	// Signature: public static int gcd1(int a, int b)
	
	@Test
	public void gcd1_test1(){
		int res = GCD.gcd1(1,2);
		assertEquals(res,1);
	}
	
	@Test
	public void gcd1_test2(){
		int res = GCD.gcd1(2,3);
		assertEquals(res,1);
	}
	
	@Test
	public void gcd1_test3(){
		int res = GCD.gcd1(6,2);
		assertEquals(res,2);
	}
}
