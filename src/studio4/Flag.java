package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		// makes background green on flag
		Color Trent = new Color (131,193,80); //new green color
		StdDraw.clear(Trent); //setting background to green
		
		//Creating pig outline
		StdDraw.setPenRadius(.005); // for the outline but doesn't matter because it's filled
		Color Becca = new Color (255,156,208); // pink color of pig
		StdDraw.setPenColor(Becca);
		//Circle ears
		StdDraw.filledCircle(.3, .79, .1);
		StdDraw.filledCircle(.7, .79, .1);
		//circle face
		StdDraw.filledCircle(.5, .5, .25);
		//Black pen color 
		StdDraw.setPenColor(Color.BLACK);
		//outlining face + ears
		StdDraw.circle(.3, .79, .1);
		StdDraw.circle(.7, .79, .1);
		StdDraw.circle(.5, .5, .25);
		//nose
		StdDraw.ellipse(.5, .45, .12, .08);
		//nostril
		StdDraw.circle(.48, .45, .01);
		StdDraw.circle(.52, .45, .01);
		//eyes
		StdDraw.filledCircle(.44, .6, .017);
		StdDraw.filledCircle(.56, .6, .017);
		
	}
}