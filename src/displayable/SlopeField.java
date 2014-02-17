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
	private Point r0;
	
	public SlopeField( String input) 
			throws ParseException{
		func = Operation.parseInput(input);
	}
	public SlopeField( String input, Point p) 
			throws ParseException{
		this(input);
		r0=p;
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
	
	public void setInitialValue( Point p){
		r0 = p;
	}
	
	public void drawNumericalSolution(Drawable d){
		XIterator it = new XIterator( d, r0 );
		double slope, 
				lastY=r0.getValue(1), 
				newY;
		Line seg;
		while( it.hasNext() ){
			slope = func.value( new Point( it.peek(), lastY ) );
			newY = lastY + it.getDeltaX()*slope;
			seg = new Line( it.peek(),lastY, 
					it.next(), newY);
			d.draw(seg);
			
			lastY = newY;
			
		}
	}
}
