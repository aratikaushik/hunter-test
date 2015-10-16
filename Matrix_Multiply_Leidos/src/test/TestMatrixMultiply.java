package test;
import org.junit.*;

import src.MatrixMultiply;

import static org.junit.Assert.*;

import java.util.Vector;

public class TestMatrixMultiply{

	static Vector<Vector<Double>> mat1;
	static Vector<Vector<Double>> mat2;
	static Vector<Vector<Double>> mat3;
	static Vector<Vector<Double>> mult23;
	static Vector<Vector<Double>> res;
	
	@BeforeClass
	public void initialize(){
		mat1 = new Vector<Vector<Double>>(2);
		Vector<Double> temp = new Vector<Double>(2);
		temp.add((double) 1);
		temp.add((double) 0);
		mat1.add(temp);
		temp = new Vector<Double>(2);
		temp.add((double) 0);
		temp.add((double) 1);
		mat1.add(temp);
		
		mat2 = new Vector<Vector<Double>>(2);
		temp = new Vector<Double>(2);
		temp.add((double) 1);
		temp.add((double) 2);
		mat2.add(temp);
		temp = new Vector<Double>(2);
		temp.add((double) 3);
		temp.add((double) 4);
		mat2.add(temp);
		
		mat3 = new Vector<Vector<Double>>(2);
		temp = new Vector<Double>(2);
		temp.add((double) 1);
		temp.add((double) 1);
		mat3.add(temp);
		temp = new Vector<Double>(2);
		temp.add((double) 1);
		temp.add((double) 1);
		mat3.add(temp);
		
		mult23 = new Vector<Vector<Double>>(2);
		temp = new Vector<Double>(2);
		temp.add((double) 3);
		temp.add((double) 3);
		mult23.add(temp);
		temp = new Vector<Double>(2);
		temp.add((double) 7);
		temp.add((double) 7);
		mult23.add(temp);
	}
	
	@Before
	public void setup(){
		res = new Vector<Vector<Double>>();
	}

	// multiplyMatrix tests
	/* Signature: public static void multiply(final Vector< Vector<Double> > first, 
	 *		final Vector< Vector<Double> > second,
	 *		Vector< Vector<Double> > result){
	 *
	 */
	
	@Test
	public void mat_test_12(){
		MatrixMultiply.multiply(mat1,mat2,res);
		assertEquals(mat2,res);
	}
	
	@Test
	public void mat_test_21(){
		MatrixMultiply.multiply(mat2,mat1,res);
		assertEquals(mat2,res);
	}
	
	@Test
	public void mat_test_23(){
		MatrixMultiply.multiply(mat2,mat3,res);
		assertEquals(mult23,res);
	}
	
	@Test
	public void mat_test_13(){
		MatrixMultiply.multiply(mat1,mat3,res);
		assertEquals(mat3,res);
	}
	
	@Test
	public void mat_test_31(){
		MatrixMultiply.multiply(mat3,mat1,res);
		assertEquals(mat3,res);
	}
}