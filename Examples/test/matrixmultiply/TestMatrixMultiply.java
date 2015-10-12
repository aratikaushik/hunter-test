package test.matrixmultiply;
import org.junit.*;

import src.MatrixMultiply;

import static org.junit.Assert.*;

public class TestMatrixMultiply{

	static MatrixMultiply obj = new MatrixMultiply();

	static double mat1[][];
	static double mat2[][];
	static double mat3[][];
	static double mult23[][];
	
	@Before
	public void initialize(){
		mat1 = new double[][]{{1,0},{0,1}};
		mat2 = new double[][]{{1,1}};
		mat3 = new double[][]{{0},{0}};
		mult23 = new double[][]{{0}};
	}

	// multiplyMatrix tests
	// Signature: public static double[][] multiplyMatrix(double[][] a, double[][] b)
	
	@Test
	public void mat_test_12(){
		double[][] res = MatrixMultiply.multiplyMatrix(mat1,mat2);
		assertArrayEquals(res,mat2);
	}
	
	@Test
	public void mat_test_21(){
		double[][] res = MatrixMultiply.multiplyMatrix(mat2,mat1);
		assertArrayEquals(res,mat2);
	}
	
	@Test
	public void mat_test_23(){
		double[][] res = MatrixMultiply.multiplyMatrix(mat2,mat3);
		assertArrayEquals(res,mult23);
	}
	
	@Test
	public void mat_test_13(){
		double[][] res = MatrixMultiply.multiplyMatrix(mat1,mat3);
		assertArrayEquals(res,mat3);
	}
	
	@Test
	public void mat_test_31(){
		double[][] res = MatrixMultiply.multiplyMatrix(mat3,mat1);
		assertArrayEquals(res,mat3);
	}
}
