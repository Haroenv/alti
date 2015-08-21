class Height {
	static double h, height, d, distance;
	static double DISTANCE = 50;		//50m is the distance away from launch
	static double HEIGHT = 10;			//10m is the minimum height
	static double alphaDeg, alphaRad;	//the angle to analyze (will go from 5-85°)
	static final double MINANG = 5;		//minimum angle in deg
	static final double MAXANG = 85;	//max angle in deg
	public static void main(String[] args) {
		/**
		 * If there are two arguments given, then use those as
		 * <ul>
		 * 	<li>the distance from which you want to know a certain angle's height</li>
		 * 	<li>the height you want to know the distance at a certain angle</li>
		 * </ul>
		 * Defaults to 50 and 10.
		 * Displays all degrees from 5-85 with 5 degree steps
		 */
		if (args.length == 2) {
			distance = Double.parseDouble(args[0]);
			height = Double.parseDouble(args[1]);
		} else {
			distance = DISTANCE;
			height = HEIGHT;
		}
		System.out.println("angle (°) | height at "+distance+"m (m) | distance for "+height+"m (m)");
		System.out.println("--- | --- | ---");
		for (double i = MINANG; i <= MAXANG; i += 5) {
			alphaDeg = i;
			alphaRad = alphaDeg*Math.PI/180;
			h = Math.tan(alphaRad)*distance; // tan(alpha) * d = h
			d = height/Math.tan(alphaRad);
			System.out.println(alphaDeg+"\t|"+round(h)+"\t|"+round(d));
		}
	}

	public static double round(double toRound) {
		return Math.round(100*toRound)/100;
	}
}
