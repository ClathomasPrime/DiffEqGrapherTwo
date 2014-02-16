/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package displayable;

import displaying.Drawable;
import displaying.Line;
import operation.*;

/**
 * There are currently no provisions against entering variables other than x.
 * Those variables will simply be set to 0.
 * 
 * @author jamesthomas
 */
public class Function implements Displayable {
	
	private operation.Operation func;
	
	public Function(String input) 
			throws ParseException{
		func = Operation.parseInput(input);
	}

	@Override
	public void drawTo(Drawable d) {
		XIterator it = new XIterator( d );
		double start, end, startY, endY;
		Line seg;
		while( it.hasNext() ){
			start = it.peek();
			end = it.next();
			startY = func.value( 
					new Point(start,0) );
			endY = func.value( 
					new Point(end,0) );
			seg = new Line( start, startY, end, endY);
			d.draw(seg);
		}
	}
	
	
}
