/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package displayable;

import operation.*;
import displaying.Drawable;
import displaying.Line;

/**
 *
 * @author jamesthomas
 */
public class SlopeField implements Displayable{
	
	private Operation func;
	
	public SlopeField( String input) 
			throws ParseException{
		func = Operation.parseInput(input);
	}
	
	@Override
	public void drawTo(Drawable d) {
		GridIterator it = new GridIterator(d);
		Point p;
		Line line;
		double slope , x0,x1, y0,y1;
		while( it.hasNext() ){
			p = it.next();
			slope = func.value(p);
			if( slope<it.getMaxSlope() ){
				x0 = p.getValue(0)-it.getBoxWidth()/2;
				y0 = p.getValue(1)-it.getBoxWidth()/2*slope;
				x1 = p.getValue(0)+it.getBoxWidth()/2;
				y1 = p.getValue(1)+it.getBoxWidth()/2*slope;
			} else {
				x0 = p.getValue(0)-it.getBoxWidth()/2/slope;
				y0 = p.getValue(1)-it.getBoxWidth()/2;
				x1 = p.getValue(0)+it.getBoxWidth()/2/slope;
				y1 = p.getValue(1)+it.getBoxWidth()/2;
			}
			line = new Line(x0,y0,x1,y1);
			d.draw(line);
		}
	}
}
