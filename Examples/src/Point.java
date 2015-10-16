package src;

import java.util.List;

public class Point {
	private int x;
	private int y;
	
	public Point(int a, int b){
		setX(a);
		setY(b);
	}
	
	public static int distance(Point p1, Point p2){
		//@return the distance between the two points
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
