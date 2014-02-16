/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package operation;

/**
 *
 * @author jamesthomas
 */
class Number extends Operation{
	
	private double value;
	
	public Number(double val){
		value = val;
	}
	
	@Override
	public double value(Point p) {
		return value;
	}
	
}
