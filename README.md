# Alti

A manual altimeter for use with i.e. water bottle or micro rockets. It makes use of the data provided by Google Maps to give a height at the point of launch and the point of observation, as well as the distance between the two. It uses the phone's gyroscope to give an angle. Using basic trigonometry, the height of the rocket can be calculated.

	height = tan(angle) * distance

Is the basic formula used for guessing the height the rocket went.

## other included

There's also a simple CLI that will make the building of a manual altimeter easier. It's called `Height`, and you execute it by (after installing the JDK) executing `javac Height.java; java Height`. This will output something like this:

angle (°) | height at 50.0m (m) | distance for 10.0m (m)
--- | --- | ---
5.0	|4.0	|114.0
10.0	|8.0	|56.0
15.0	|13.0	|37.0
20.0	|18.0	|27.0
25.0	|23.0	|21.0
30.0	|28.0	|17.0
35.0	|35.0	|14.0
40.0	|41.0	|11.0
45.0	|50.0	|10.0
50.0	|59.0	|8.0
55.0	|71.0	|7.0
60.0	|86.0	|5.0
65.0	|107.0	|4.0
70.0	|137.0	|3.0
75.0	|186.0	|2.0
80.0	|283.0	|1.0
85.0	|571.0	|0.0

The column is the angle, second the height at that angle at 50m distance, the third is the distance you need for that angle to be 10m
