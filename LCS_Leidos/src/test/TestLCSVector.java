package test;

import org.junit.*;

import src.LCS;

import static org.junit.Assert.*;
import java.util.Vector;

public class TestLCSVector{

	static int arr1[];
	static int arr2[];
	static int arr3[];
	static int arr4[];
	static Vector<Integer> vect1 = new Vector<Integer>();
	static Vector<Integer> vect2 = new Vector<Integer>();
	static Vector<Integer> vect3 = new Vector<Integer>();
	static Vector<Integer> vect4 = new Vector<Integer>();
	static Vector<Integer> res = new Vector<Integer>();
	static Vector<Integer> res_empty = new Vector<Integer>();
	static Vector<Integer> res13 = new Vector<Integer>();
	
	@Before
	public void initialize(){
		arr1 = new int[]{2,1,3};
		arr2 = new int[]{};
		arr3 = new int[]{3,2,1,2};
		arr4 = new int[]{0};
		vect1 = copyFromArray(arr1);
		vect2 = copyFromArray(arr2);
		vect3 = copyFromArray(arr3);
		vect4 = copyFromArray(arr4);
		res13.add(2);
		res13.add(1);
	}
	
	@After
	public void destroy(){
		arr1 = new int[3];
		arr2 = new int[0];
		arr3 = new int[4];
		arr4 = new int[1];
		vect1 = null;
		vect2 = null;
		vect3 = null;
		vect4 = null;
		res = new Vector<Integer>();
		res13 = new Vector<Integer>();
	}
		
	public static Vector<Integer> copyFromArray(int[] a){
		Vector<Integer> res = new Vector<Integer>();
		for(int i=0;i<a.length;i++){
			res.add(a[i]);
		}
		return res;
	}
	
	// lcs tests
	/* Signature - public static void lcs(Vector<Integer> a, 
	 * 		Vector<Integer> b, Vector<Integer> res)
	 */
	
	@Test
	public void test12() {
		LCS.lcs(vect1,vect2,res);
		assertTrue(res.equals(res_empty));
	}
	
	@Test
	public void test23() {
		LCS.lcs(vect2,vect3,res);
		assertTrue(res.equals(res_empty));
	}
	
	@Test
	public void test13() {
		LCS.lcs(vect1,vect3,res);
		assertTrue(res.equals(res13));
	}
	
	@Test
	public void test14() {
		LCS.lcs(vect1,vect4,res);
		assertTrue(res.equals(res_empty));
	}
	
	@Test
	public void test34() {
		LCS.lcs(vect3,vect4,res);
		assertTrue(res.equals(res_empty));
	}
}
