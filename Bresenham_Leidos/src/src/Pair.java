package src;

public class Pair {
	Integer x;
	Integer y;

	public Pair(int a, int b) {
		x = a;
		y = b;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public void setX(int a) {
		x = a;
	}

	public void setY(int b) {
		y = b;
	}

	@Override
	public boolean equals(Object o) {
		if (o == null || o.getClass() != this.getClass()) {
			return false;
		}
		Pair that = (Pair) o;
		return (x == null ? that.x == null : x.equals(that.x)) && (y == null ? that.y == null : y.equals(that.y));
	}
}
