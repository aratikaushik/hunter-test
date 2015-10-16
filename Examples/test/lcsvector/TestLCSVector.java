package test.lcsvector;

import org.junit.*;

import src.LCS;

import static org.junit.Assert.*;
import java.util.Vector;

public class TestLCSVector{

	static LCS obj = new LCS();
	static int arr1[];
	static int arr2[];
	static int arr3[];
	static int sorted_arr1[] = new int[]{1,2,3};
	static int sorted_arr3[] = new int[]{1,2,2,3};
	static Vector<Integer> vect1 = new Vector<Integer>();
	static Vector<Integer> vect2 = new Vector<Integer>();
	static Vector<Integer> vect3 = new Vector<Integer>();
	static Vector<Integer> res12 = new Vector<Integer>();
	static Vector<Integer> res23 = new Vector<Integer>();
	static Vector<Integer> res31 = new Vector<Integer>();
	
	@Before
	public void initialize(){
		arr1 = new int[]{2,1,3};
		arr2 = new int[]{};
		arr3 = new int[]{3,2,1,2};
		vect1 = copyFromArray(arr1);
		vect2 = copyFromArray(arr2);
		vect3 = copyFromArray(arr3);
		res31.add(2);
		res31.add(1);
	}
	
	@After
	public void destroy(){
		arr1 = new int[3];
		arr2 = new int[0];
		arr3 = new int[4];
		vect1 = null;
		vect2 = null;
		vect3 = null;
		res31 = new Vector<Integer>();
	}
		
	public static Vector<Integer> copyFromArray(int[] a){
		Vector<Integer> res = new Vector<Integer>();
		for(int i=0;i<a.length;i++){
			res.add(a[i]);
		}
		return res;
	}
	
	// lcs1 tests
	// Signature - public void lcs1(Vector<Integer> a, Vector<Integer> b, Vector<Integer> res)
	
	@Test
	public void lcs1_test_12() {
		Vector<Integer> res = new Vector<Integer>();
		LCS.lcs1(vect1,vect2,res);
		/*System.err.println("");
		System.err.println("a = vect1:");
		printVector(vect1);
		System.err.println("b = vect2:");
		printVector(vect2);
		System.err.println("res = lcs1(a,b):");
		printVector(res);
		System.err.println("expected res:");
		printVector(res12);*/
		assertTrue(res.equals(res12));
	}
	
	@Test
	public void lcs1_test_23() {
		Vector<Integer> res = new Vector<Integer>();
		LCS.lcs1(vect2,vect3,res);
		/*System.err.println("");
		System.err.println("a = vect2:");
		printVector(vect2);
		System.err.println("b = vect3:");
		printVector(vect3);
		System.err.println("res = lcs1(a,b):");
		printVector(res);
		System.err.println("expected res:");
		printVector(res23);*/
		assertTrue(res.equals(res23));
	}
	
	@Test
	public void lcs1_test_31() {
		Vector<Integer> res = new Vector<Integer>();
		LCS.lcs1(vect3,vect1,res);
		/*System.err.println("");
		System.err.println("a = vect3:");
		printVector(vect3);
		System.err.println("b = vect1:");
		printVector(vect1);
		System.err.println("res = lcs1(a,b):");
		printVector(res);
		System.err.println("expected res:");
		printVector(res31);*/
		assertTrue(res.equals(res31));
	}
}
