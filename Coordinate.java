class Coordinate {
	double x, y;

	/**
	 * create a new coordinate (at the cross of the Greenwich meridian and the equator)
	 */
	public Coordinate() {
		this.x = 0;
		this.y = 0;
	}

	/**
	 * create a new coordinate with lat and lon
	 * @param  x lat
	 * @param  y lon
	 */
	public Coordinate(double x, double y) {
		this.x = x;
		this.y = y;
	}

	/**
	 * Returns the coordinate in a string
	 * (12.13123,123,123123)
	 * @return that coordinate
	 */
	@Override
	public String toString() {
		return "("+x+", "+y+")";
	}

	/**
	 * check if this and another Coordinate are equal
	 * @param  o the other coordinate
	 * @return   true if they are equal; false if they aren't
	 */
	@Override
	public boolean equals(Object o) {
		if (!(o instanceof Coordinate)) {
			return false;
		}
		Coordinate compare = (Coordinate)o;
		return super.equals(compare) && compare.x == this.x && compare.y == this.y;
	}

	/**
	 * calculates the distance (on a plane, since these distances are small) using
	 * 		dist = sqrt((x2-x1)^2+(y2-y1)^2)
	 * @param  other the coordinate to find the distance to
	 * @return       the distance (in m) TODO: check if this is m
	 */
	public double distance(Coordinate other) {
		return Math.sqrt(Math.pow((other.x - this.x),2) + Math.pow((other.y - this.y),2));
	}
}
