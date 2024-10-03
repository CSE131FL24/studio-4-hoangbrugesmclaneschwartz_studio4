package studio4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;

import edu.princeton.cs.introcs.StdDraw;

/**
 * @author Dennis Cosgrove (http://www.cse.wustl.edu/~cosgroved/)
 */
public class InterpretDrawingFile {

	public static void main(String[] args) throws FileNotFoundException {
		JFileChooser chooser = new JFileChooser("resources");
		chooser.showOpenDialog(null);
		File f = new File(chooser.getSelectedFile().getPath());
		Scanner in = new Scanner(f); //making Scanner with a File
		
		boolean fill = false;
		String shape = in.next();
		if (shape.equals("rectangle")) {
			int red = in.nextInt();
			int green = in.nextInt();
			int blue = in.nextInt();
			StdDraw.setPenColor(red, green, blue);
			
			if (in.nextBoolean()) {
				fill = true;
			}
			
			double x = in.nextDouble();
			double y = in.nextDouble();
			double width = in.nextDouble();
			double height = in.nextDouble();
			
			if (fill == true) {
				StdDraw.filledRectangle(x, y, width, height);
			}
			else {
				StdDraw.rectangle(x, y, width, height);
			}
		}
		//ellipses
		if (shape.equals("ellipse")) {
			int red = in.nextInt();
			int green = in.nextInt();
			int blue = in.nextInt();
			StdDraw.setPenColor(red, green, blue);
			
			if (in.nextBoolean()) {
				fill = true;
			}
			double x = in.nextDouble();
			double y = in.nextDouble();
			double major = in.nextDouble();
			double minor = in.nextDouble();
			
			if (fill == true) {
				StdDraw.filledEllipse(x, y, major, minor);
			}
			else {
				StdDraw.ellipse(x, y, major, minor);
			}
		}
	}
}
