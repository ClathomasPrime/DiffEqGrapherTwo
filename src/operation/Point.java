/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package operation;

/**
 *
 * @author jamesthomas
 */
public class Point {
	
	private double[] coord;
	
	public Point(double x, double y){
		coord = new double[2];
		coord[0] = x;
		coord[1] = y;
		//coord = { 0.3, 0.12 };
	}
	public Point( double[] co){
		coord = co;
	}
	
	public double getValue( int key ){
		try {
			return coord[key];
		} catch (IndexOutOfBoundsException ex){
			return 0D;
		}
	}
}
