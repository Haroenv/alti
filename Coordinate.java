class Coordinate {
	double x, y;
	public Coordinate() {
		this.x = 0;
		this.y = 0;
	}

	public Coordinate(double x, double y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		return "("+x+", "+y+")";
	}

	@Override
	public boolean equals(Object o) {
		if (!(o instanceof Coordinate)) {
			return false;
		}
		Coordinate compare = (Coordinate)o;
		return super.equals(compare) && compare.x == this.x && compare.y == this.y;
	}
}
