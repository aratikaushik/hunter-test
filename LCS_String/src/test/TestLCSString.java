package test;

import org.junit.*;

import src.LCS;

import static org.junit.Assert.*;

public class TestLCSString{
	
	@Test
	public void test1(){
		assertEquals("bc", LCS.lcs("abc", "bdcp"));
	}
	
	@Test
	public void test2(){
		assertEquals("", LCS.lcs("", "bdcp"));
	}
	
	@Test
	public void test3(){
		assertEquals("", LCS.lcs("abc", ""));
	}
	
	@Test
	public void test4(){
		assertEquals("abc", LCS.lcs("abc", "badbhccp"));
	}
	
	@Test
	public void test5(){
		assertEquals("", LCS.lcs("abc", "xyz"));
	}
	
	
}