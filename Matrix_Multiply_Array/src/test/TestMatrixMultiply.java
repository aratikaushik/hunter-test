package test;
import org.junit.*;

import src.MatrixMultiply;

import static org.junit.Assert.*;

public class TestMatrixMultiply{

	static MatrixMultiply obj = new MatrixMultiply();

	static double mat1[][];
	static double mat2[][];
	static double mat3[][];
	static double mult23[][];
	static double mult32[][];
	
	@Before
	public void initialize(){
		mat1 = new double[][]{{1,0},{0,1}};
		mat2 = new double[][]{{1,2},{3,4}};
		mat3 = new double[][]{{1,1},{1,1}};
		mult23 = new double[][]{{3,3},{7,7}};
		mult32 = new double[][]{{4,6},{4,6}};
	}

	// multiplyMatrix tests
	// Signature: public static double[][] multiplyMatrix(double[][] a, double[][] b)
	
	@Test
	public void mat_test_12(){
		double[][] res = MatrixMultiply.multiply(mat1,mat2);
		assertArrayEquals(mat2,res);
	}
	
	@Test
	public void mat_test_21(){
		double[][] res = MatrixMultiply.multiply(mat2,mat1);
		assertArrayEquals(mat2,res);
	}
	
	@Test
	public void mat_test_23(){
		double[][] res = MatrixMultiply.multiply(mat2,mat3);
		assertArrayEquals(mult23,res);
	}
	
	@Test
	public void mat_test_32(){
		double[][] res = MatrixMultiply.multiply(mat3,mat2);
		assertArrayEquals(mult32,res);
	}
	
	@Test
	public void mat_test_31(){
		double[][] res = MatrixMultiply.multiply(mat3,mat1);
		assertArrayEquals(mat3,res);
	}
}