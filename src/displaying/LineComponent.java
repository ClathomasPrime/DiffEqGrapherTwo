/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package displaying;

import java.awt.Shape;
import java.awt.geom.Line2D;

/**
 *
 * @author jamesthomas
 */
public class LineComponent implements FigureComponent{
	
	double startX, startY, endX, endY;
	
	public LineComponent( double x0, double y0, double x1, double y1 ){
		startX = x0;
		startY = y0;
		endX = x1;
		endY = y1;
	}

	@Override
	public double getWeight() {
		return 4;
	}

	public Shape swingShape( SwingBoard b ) {
		return new Line2D.Double(b.xNumToPx(startX),b.yNumToPx(startY),
				b.xNumToPx(endX),b.yNumToPx(endY));
		//return new Line2D.Double(b.xNumToPx(0),b.yNumToPx(0),
		//		b.xNumToPx(1),b.yNumToPx(1) );
		
	}
	
}
