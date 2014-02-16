/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package displaying;

import java.awt.Shape;
import java.awt.geom.Ellipse2D;

/**
 *
 * @author jamesthomas
 */
public class DotComponent implements FigureComponent{
	
	double xCenter, yCenter, radius;
	
	public DotComponent( double x, double y, double radius){
		xCenter = x;
		yCenter = y;
		this.radius = radius;
	}
	
	@Override
	public double getWeight() {
		return 2;
	}

	@Override
	public Shape swingShape(SwingBoard b) {
		return new Ellipse2D.Double(
				b.xNumToPx(xCenter-radius/2),
				b.yNumToPx(yCenter+radius/2),
				b.deltaXNumToPx(radius), 
				b.deltaYNumToPx(radius) );
	}
	
}
