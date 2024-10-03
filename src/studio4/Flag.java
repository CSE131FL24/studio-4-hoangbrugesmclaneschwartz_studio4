package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		int red = 255;
		int green = 255;
		int blue = 0;
		StdDraw.setPenColor(red, green, blue);
		
		double x = .5;
		double y = .7;
		double major = .15;
		double minor = .15;
		StdDraw.filledEllipse(x, y, major, minor);
		
		x = .7;
		y = .5;
		StdDraw.filledEllipse(x, y, major, minor);
		
		x = .5;
		y = .3;
		StdDraw.filledEllipse(x, y, major, minor);
		
		x = .3;
		y = .5;
		StdDraw.filledEllipse(x, y, major, minor);
		
		x = .5;
		y = .5;
		double width = .2;
		double height = .2;
		StdDraw.setPenColor(255, 0, 0);
		StdDraw.filledRectangle(x, y, width, height);
				
	}
}