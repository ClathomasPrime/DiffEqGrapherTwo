/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package operation;

/**
 *
 * @author jamesthomas
 */
class Tan extends PrefixOperation {

	public Tan( Operation op ){
		super(op);
	}
	
	public Tan( String arg)
		throws ParseException{
		super(arg);
	}
	@Override
	public double value(Point p) {
		return Math.tan( argument.value(p) );
	}
	
	
}
