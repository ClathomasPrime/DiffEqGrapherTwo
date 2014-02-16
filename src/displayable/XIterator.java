/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package displayable;

import java.util.Iterator;
import displaying.Drawable;
/**
 *
 * @author jamesthomas
 */
class XIterator implements Iterator<Double>{
	
	private static final int numPoints = 200;
	
	private double currentX;
	private double deltaX;
	private double maxX;
	
	public XIterator( Drawable d ){
		currentX = d.getXMin();
		deltaX = ( d.getXMax()-d.getXMin() )/ numPoints;
		maxX = d.getXMax();
	}

	@Override
	public boolean hasNext() {
		return currentX <= maxX;
	}

	@Override
	public Double next() {
		currentX += deltaX;
		return currentX;
	}
	public Double peek(){
		return currentX;
	}

	@Override
	public void remove() {
		throw new UnsupportedOperationException("Not supported yet. Probably won't ever be supported"); 
		//To change body of generated methods, choose Tools | Templates.
	}
	
}
