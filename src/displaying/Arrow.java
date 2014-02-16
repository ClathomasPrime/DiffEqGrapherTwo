/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package displaying;

import operation.Point;

public class Arrow implements Figure {
	
	double startX, startY, endX, endY;
	
	public Arrow(double startX, double startY, double endX, double endY){
		this.startX = startX;
		this.startY = startY;
		this.endX = endX;
		this.endY = endY;
	}
	public Arrow( Point p, double XLength, double YLength){
		this.startX = p.getValue(0);
		this.startY = p.getValue(1);
		this.endX = startX + XLength;
		this.endY = startY + YLength;
	}

	@Override
	public FigureComponent[] getComponents() {
		FigureComponent[] f = new FigureComponent[1];
		
		f[0] = new LineComponent( startX, startY, endX, endY );
		return f;
	}
	
}
