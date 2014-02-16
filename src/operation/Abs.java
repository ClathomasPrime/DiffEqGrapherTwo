/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package operation;

/**
 *
 * @author jamesthomas
 */
class Abs extends PrefixOperation{
	
	public Abs( Operation o){
		super( o );
	}
	public Abs( String arg)
		throws ParseException{
		super(arg);
	}
	
	@Override
	public double value(Point p) {
		return Math.abs(argument.value(p));
	}
	
}
