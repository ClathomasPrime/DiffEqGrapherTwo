/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package operation;

/**
 *
 * @author jamesthomas
 */
class Identity extends Operation{
	
	private int key;
	
	public Identity( int i){
		key = i;
	}

	@Override
	public double value(Point p) {
		return p.getValue(key);
	}
}
