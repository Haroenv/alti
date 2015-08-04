# Alti

A manual altimeter for use with i.e. water bottle or micro rockets. It makes use of the data provided by Google Maps to give a height at the point of launch and the point of observation, as well as the distance between the two. It uses the phone's gyroscope to give an angle. Using basic trigonometry, the height of the rocket can be calculated.

	height = tan(angle) * distance

Is the basic formula used for guessing the height the rocket went.
