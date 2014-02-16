/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package displaying;

/**
 *
 * All methods return values in numerical form
 * 
 * @author jamesthomas
 */
public interface Drawable {
	public abstract void draw (Figure f);
	
	public double getXMin();
	public double getXMax();
	public double getYMin();
	public double getYMax();
	
	public double xNumToPx( double xNum);
	public double yNumToPx( double yNum);
}
