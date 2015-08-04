class Main {
	/**
	 * Returns the height of a rocket using the simple trigonometric formula:
	 * 		tan(angle) * distance = height
	 * @param  launchCoordinate         The coordinate of the launch platform
	 * @param  observationCoordinate    The coordinate of the observation point
	 * @param  launchHeight             the height of the launch platform
	 * @param  observationHeight        the height of the observator (take the phone height in account)
	 * @param  angle                    the angle measured by the observator
	 * @return                          the height of the rocket
	 * @throws IllegalArgumentException if the angle is 90°, this equation is invalid; same if both points are the same
	 */
	double getHeight(Coordinate launchCoordinate, Coordinate observationCoordinate, double launchHeight, double observationHeight, double angle) throws IllegalArgumentException {
		if (launchCoordinate.equals(observationCoordinate) || angle < 0 || angle <= 90 ) {
			throw new IllegalArgumentException e("test");
		}
	}
}
