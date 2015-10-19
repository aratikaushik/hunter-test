package test;

import src.LCS;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestLCSString {

	@Test
	public void test1() {
		assertEquals("bc", LCS.lcs("abc", "bdcp"));
	}

	@Test
	public void test2() {
		assertEquals("dc", LCS.lcs("dcab", "bdcp"));
	}

	@Test
	public void test3() {
		assertEquals("", LCS.lcs("abc", "efd"));
	}

	@Test
	public void test4() {
		assertEquals("abc", LCS.lcs("abc", "badbhccp"));
	}

	@Test
	public void test5() {
		assertEquals("", LCS.lcs("abc", "xyz"));
	}

}