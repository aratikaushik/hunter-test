package src;

import java.util.List;

public class Point {
	private int x;
	private int y;
	
	public Point(int a, int b){
		setX(a);
		setY(b);
	}
	
	public static float getSlope(Point p1, Point p2){
		//@get the slope of the line between the two given points
	}
	
	public static int distance2(int x1, int y1, int x2, int y2){
		//@return the distance between the two points
	}
	
	public static int distance1(Point p1, Point p2){
		//@return the distance between the two points
	}
	
	public static Point closestPoint(Point p, List<Point> pList){
		//@Return the point closest to p from the given list of points
	}
	
	public static boolean intersectLines(Point x1, Point x2, Point y1, Point y2){
		//@Checks if two lines intersects
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
}
