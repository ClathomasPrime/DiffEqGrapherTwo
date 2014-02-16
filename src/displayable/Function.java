/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package displayable;

import operation.*;

/**
 *
 * @author jamesthomas
 */
public class Function {
	
	private operation.Operation func;
	
	public Function(String input) 
			throws ParseException{
		func = Operation.parseInput(input);
	}
	
	
}
