package com.BasicsProgram;

public class AreaofCircle {

	public static void main(String[] args) {

		float radius = 2.0f;
		float pie = 3.147f;
		float cirm, Area;

		// print area and circumference of circle

		Area = pie * radius * radius;
		System.out.println("Area of circle is :" + Area);

		cirm = 2 * (radius * radius);
		System.out.println("circumfereance of circle is :" + cirm);

	}

}
