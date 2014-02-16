/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package displaying;


public class Line implements Figure {
	
	double startX, startY, endX, endY;
	
	public Line( double x0, double y0, double x1, double y1 ){
		startX = x0;
		startY = y0;
		endX = x1;
		endY = y1;
	}

	@Override
	public FigureComponent[] getComponents() {
		FigureComponent[] f = new FigureComponent[1];
		f[0] = new LineComponent( startX, startY, endX, endY);
		return f;
	}
	
}
