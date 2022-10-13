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
		
		String shapeType = in.next(); //reads one word no matter what it is
		int red = in.nextInt();
		int green = in.nextInt();
		int blue = in.nextInt();
		
		boolean isFilled = in.nextBoolean();
		
		//points of rectangle from resources documents
		double parameterOne = in.nextDouble();
		double parameterTwo = in.nextDouble();
		double parameterThree = in.nextDouble();
		double parameterFour = in.nextDouble();
		double parameterFive = in.nextDouble();
		double parameterSix = in.nextDouble();
		
		//get color
		StdDraw.setPenColor(red, green, blue);
		
		//rectangle is outline or filled in
		if (isFilled == true) {
			StdDraw.filledRectangle(parameterOne, parameterTwo, parameterThree, parameterFour);
		}
		else {
			StdDraw.rectangle(parameterOne, parameterTwo, parameterThree, parameterFour);
		}
		
		//generalize code
		if(shapeType.equals ("ellipse")) {
			StdDraw.ellipse(parameterOne, parameterTwo, parameterThree, parameterFour);
		}
		else if (shapeType.equals ("triangle")) {
			StdDraw.polygon(null, null);; // idk if this works probably not
		}
		
	}
}
