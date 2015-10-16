package test;

import static org.junit.Assert.*;

import java.util.Vector;

import org.junit.*;

import src.*;

import org.junit.Test;

public class TestBresenham {
	
	static Vector<Pair> res;
	
	@Before
	public void setup(){
		res = new Vector<Pair>();
	}

	@Test
	public void test1() {
		Vector<Pair> v1 = new Vector<Pair>();
		v1.add(new Pair(0,0));
		v1.add(new Pair(1,0));
		Bresenham.bresenham(0, 0, 1, 0, res);
		assertEquals(v1,res);
	}
	
	@Test
	public void test2() {
		Vector<Pair> v1 = new Vector<Pair>();
		v1.add(new Pair(1,0));
		v1.add(new Pair(1,1));
		v1.add(new Pair(1,2));
		Bresenham.bresenham(1, 0, 1, 2, res);
		assertEquals(v1,res);
	}
	
	@Test
	public void test3() {
		Vector<Pair> v1 = new Vector<Pair>();
		v1.add(new Pair(0,0));
		v1.add(new Pair(1,0));
		v1.add(new Pair(2,0));
		v1.add(new Pair(3,0));
		Bresenham.bresenham(0, 0, 3, 0, res);
		assertEquals(v1,res);
	}
	
	@Test
	public void test4() {
		Vector<Pair> v1 = new Vector<Pair>();
		v1.add(new Pair(0,0));
		v1.add(new Pair(1,1));
		v1.add(new Pair(2,1));
		v1.add(new Pair(3,2));
		v1.add(new Pair(4,2));
		v1.add(new Pair(5,3));
		Bresenham.bresenham(0, 0, 5, 3, res);
		assertEquals(v1,res);
	}
	
	@Test
	public void test5() {
		Vector<Pair> v1 = new Vector<Pair>();
		v1.add(new Pair(0, 0));
		v1.add(new Pair(1, 1));
		v1.add(new Pair(1, 2));
		v1.add(new Pair(2, 3));
		v1.add(new Pair(2, 4));
		v1.add(new Pair(3, 5));
		Bresenham.bresenham(0, 0, 3, 5, res);
		assertEquals(v1,res);
	}

}
