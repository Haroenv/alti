class Height {
	static double h;					//the height at that angle
	static double d;
	static double DISTANCE = 50;	//50m is the distance away from launch
	static double HEIGHT = 10;
	static double alphaRad;				//that angle in rad
	static double alphaDeg;				//angle is also shown in degrees
	static final double MINANG = 0;		//minimum angle in deg
	static final double MAXANG = 90;	//max angle in deg
	public static void main(String[] args) {
		if (args.length == 2) {
			DISTANCE = Double.parseDouble(args[0]);
			HEIGHT = Double.parseDouble(args[1]);
		}
		for (double i = MINANG; i < MAXANG; i += 5) {
			alphaDeg = i;
			alphaRad = alphaDeg*Math.PI/180;
			h = Math.tan(alphaRad)*DISTANCE; // tan(alpha) * d = h
			d = HEIGHT/Math.tan(alphaRad);
			System.out.println("angle: "+alphaDeg+"°\t | height at "+DISTANCE+"m: "+Math.round(100*h)/100+"m\t | distance for "+HEIGHT+"m: "+Math.round(100*d)/100+"m");
		}
	}
}
