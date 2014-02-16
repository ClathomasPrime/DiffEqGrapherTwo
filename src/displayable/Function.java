/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package displayable;

import displaying.Drawable;
import operation.*;

/**
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
		
	}
	
	
}
