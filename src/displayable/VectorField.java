/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package displayable;

import displaying.*;
import operation.*;

/**
 *
 * @author jamesthomas
 */
public class VectorField implements Displayable{
	
	private Operation X, Y;
	
	public VectorField( String X, String Y) 
			throws ParseException{
		this.X = Operation.parseInput(X);
		this.Y = Operation.parseInput(Y);
	}
	
	@Override
	public void drawTo(Drawable d) {
		GridIterator it = new GridIterator(d);
		Point p;
		Arrow a;
		while( it.hasNext() ){
			p = it.next();
			double xVal = X.value(p);
			double yVal = Y.value(p);
			a = new Arrow(p, xVal, yVal);
			d.draw(a);
		}
	}
	
}
