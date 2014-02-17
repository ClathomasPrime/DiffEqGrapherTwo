/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package displaying;

import java.awt.Shape;
import java.awt.Polygon;

/**
 *
 * @author jamesthomas
 */
public class ArrowHeadComponent implements FigureComponent{
	
	double x0, y0, dX, dY;
	
	public ArrowHeadComponent(double endX, double endY, double xDir, double yDir){
		x0 = endX;
		y0 = endY;
		dX = xDir;
		dY = yDir;
	}
	
	@Override
	public double getWeight() {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public Shape swingShape(SwingBoard b) {
		double w = 0.05;
		double h = 0.2;
		
		double theta;
		if(dX==0){
			if(dY>0){
				theta = Math.PI/2;
			} else if(dY<0){
				theta = 3*Math.PI/2;
			} else {
				return new DotComponent(x0,y0,0.2).swingShape(b);
			}
		} else {
			theta = dX > 0 ? Math.atan(dY/dX) : Math.atan(dY/dX)+Math.PI;
		}
		
		double x1 = x0 + w*Math.cos(theta+Math.PI/2);
		double y1 = y0 + w*Math.sin(theta+Math.PI/2);
		
		double x2 = x0 + h*Math.cos(theta);
		double y2 = y0 + h*Math.sin(theta);
		
		double x3 = x0 - w*Math.cos(theta+Math.PI/2);
		double y3 = y0 - w*Math.sin(theta+Math.PI/2);
		
		Polygon ar = new Polygon();
		ar.addPoint( (int) b.xNumToPx(x1),(int) b.yNumToPx(y1) );
		ar.addPoint( (int) b.xNumToPx(x2),(int) b.yNumToPx(y2) );
		ar.addPoint( (int) b.xNumToPx(x3),(int) b.yNumToPx(y3) );
		
		return ar;
	}
	
}
