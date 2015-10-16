package test.point;

import org.junit.*;

import src.Point;

import static org.junit.Assert.*;

public class TestPointDistance {
	@Test
	public void test1(){
		Point p1 = new Point(0,3);
		Point p2 = new Point(4,0);
		assertEquals(Point.distance(p1, p2),5);
	}
}