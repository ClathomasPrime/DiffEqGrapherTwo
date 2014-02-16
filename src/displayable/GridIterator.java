/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package displayable;

import displaying.Drawable;
import java.util.Iterator;
import operation.*;

/**
 * 
 *
 * @author jamesthomas
 */
public class GridIterator implements Iterator<Point>{

	private static final int numPoints = 10;
	//Yeah this should probably be an instance variable, not a constant
	//Maybe there should be seperate ones for x and y too
	
	private double minX;
	private double currentX;
	private double deltaX;
	private double maxX;
	
	private double currentY;
	private double deltaY;
	private double maxY;
	
	public GridIterator( Drawable d ){
		minX = d.getXMin();
		currentX = d.getXMin();
		deltaX = ( d.getXMax()-d.getXMin() )/ numPoints;
		maxX = d.getXMax();
		
		currentY = d.getYMin();
		deltaY = ( d.getYMax()-d.getYMin() )/ numPoints;
		maxY = d.getYMax();
	}
	@Override
	public boolean hasNext() {
		return currentX <= maxX && currentY <= maxY;
	}

	@Override
	public Point next() {
		double retX = currentX;
		double retY = currentY;
		if ( currentX+deltaX<=maxX){
			currentX+=deltaX;
		} else {
			currentX = minX;
			currentY+=deltaY;
		}
		return new Point(retX, retY);
	}

	@Override
	public void remove() {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}
	
}
