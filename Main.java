class Main {

	/**
	 * Returns the height of a rocket using the simple trigonometric formula:
	 * 		tan(angle) * distance = height
	 * @param  launchCoordinate         The coordinate of the launch platform
	 * @param  observationCoordinate    The coordinate of the observation point
	 * @param  launchHeight             the height of the launch platform
	 * @param  observationHeight        the height of the observator (take the phone height in account)
	 * @param  angle                    the angle measured by the observator (in radians)
	 * @return                          the height of the rocket
	 * @throws IllegalArgumentException if the angle is π/2, this equation is invalid; same if both points are the same
	 */
	static double getHeight(Coordinate launchCoordinate, Coordinate observationCoordinate, double launchHeight, double observationHeight, double angle) throws IllegalArgumentException {
		if (launchCoordinate.equals(observationCoordinate) || angle < 0 || angle >= Math.PI/2 ) {
			throw new IllegalArgumentException("Either");
		}
		return Math.tan(angle) * launchCoordinate.distance(observationCoordinate);
	}

	public static void main(String[] args) {
		Coordinate launchCoordinate = new Coordinate(120,120);
		Coordinate observationCoordinate = new Coordinate(120,121);
		double launchHeight = 10;
		double observationHeight = 11;
		double angle = 0.8;
		System.out.println("launch 1: "+launchCoordinate.toString()+"\n obs: "+observationCoordinate.toString()+"\n height: "+getHeight( launchCoordinate, observationCoordinate, launchHeight, observationHeight, angle));
	}
}
