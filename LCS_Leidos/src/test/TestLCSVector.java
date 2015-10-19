package test;

import src.LCS;

import static org.junit.Assert.assertEquals;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.Vector;

public class TestLCSVector {

	static Integer arr1[];
	static Integer arr2[];
	static Integer arr3[];
	static Integer arr4[];

	@Before
	public void initialize() {
		arr1 = new Integer[] { 2, 1, 3 };
		arr2 = new Integer[] { 0, 2, 3, 2, 1 };
		arr3 = new Integer[] { 3, 2, 1, 2 };
		arr4 = new Integer[] { 0 };
	}

	@After
	public void destroy() {
		arr1 = new Integer[3];
		arr2 = new Integer[0];
		arr3 = new Integer[4];
		arr4 = new Integer[1];
	}

	@Test
	public void test12() {

		Vector<Integer> v1 = new Vector<Integer>(Arrays.asList(arr1));
		Vector<Integer> v2 = new Vector<Integer>(Arrays.asList(arr2));
		Vector<Integer> res = new Vector<Integer>();

		Integer[] arr_lcs = new Integer[] { 2, 1 };
		Vector<Integer> lcs = new Vector<Integer>(Arrays.asList(arr_lcs));

		LCS.lcs(v1, v2, res);
		assertEquals(res, lcs);
	}

	@Test
	public void test23() {

		Vector<Integer> v1 = new Vector<Integer>(Arrays.asList(arr2));
		Vector<Integer> v2 = new Vector<Integer>(Arrays.asList(arr3));
		Vector<Integer> res = new Vector<Integer>();

		Integer[] arr_lcs = new Integer[] { 3, 2, 1 };
		Vector<Integer> lcs = new Vector<Integer>(Arrays.asList(arr_lcs));

		LCS.lcs(v1, v2, res);
		assertEquals(res, lcs);
	}

	@Test
	public void test13() {

		Vector<Integer> v1 = new Vector<Integer>(Arrays.asList(arr1));
		Vector<Integer> v2 = new Vector<Integer>(Arrays.asList(arr3));
		Vector<Integer> res = new Vector<Integer>();

		Integer[] arr_lcs = new Integer[] { 2, 1 };
		Vector<Integer> lcs = new Vector<Integer>(Arrays.asList(arr_lcs));

		LCS.lcs(v1, v2, res);
		assertEquals(res, lcs);
	}

	@Test
	public void test14() {

		Vector<Integer> v1 = new Vector<Integer>(Arrays.asList(arr1));
		Vector<Integer> v2 = new Vector<Integer>(Arrays.asList(arr4));
		Vector<Integer> res = new Vector<Integer>();

		Vector<Integer> lcs = new Vector<Integer>();

		LCS.lcs(v1, v2, res);
		assertEquals(res, lcs);
	}

	@Test
	public void test24() {

		Vector<Integer> v1 = new Vector<Integer>(Arrays.asList(arr2));
		Vector<Integer> v2 = new Vector<Integer>(Arrays.asList(arr4));
		Vector<Integer> res = new Vector<Integer>();

		Integer[] arr_lcs = new Integer[] { 0 };
		Vector<Integer> lcs = new Vector<Integer>(Arrays.asList(arr_lcs));

		LCS.lcs(v1, v2, res);
		assertEquals(res, lcs);
	}
}
