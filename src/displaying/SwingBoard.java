/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package displaying;

import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.geom.*;
import java.util.LinkedList;
import java.awt.RenderingHints;
import java.awt.Color;
/**
 *
 * @author jamesthomas
 */
public class SwingBoard extends JPanel implements Drawable {
	
	private static final int pixelWidth = 600;
	private static final int pixelHeight = 600;
	
	private double minX;
	private double minY;
	private double maxX;
	private double maxY;
	
	private LinkedList<Shape> shapeCache = new LinkedList<Shape>();
	
	public SwingBoard( double minX, double maxX, double minY, double maxY ){
		super(true);
		
		this.minX = minX;
		this.minY = minY;
		
		this.maxX = maxX;
		this.maxY = maxY;
		
	}
	public SwingBoard(){
		this( -5, 5, -5, 5 );
	}

	@Override
	public void draw( Figure f ) {
		for( FigureComponent comp : f.getComponents() ){
			//code that takes a comp and turns it into an awt shape, then adds it to shapeCache
			shapeCache.add(comp.swingShape(this));
		}
	}

	@Override public double getXMin() {
		return minX; }
	@Override public double getXMax() {
		return maxX; }
	@Override public double getYMin() {
		return minY; }
	@Override public double getYMax() {
		return maxY; }
	
	@Override
	public double xNumToPx( double xNum){
		return (xNum-minX) * pixelWidth / (maxX-minX);
	}
	@Override
	public double yNumToPx( double yNum){
		return (maxY-yNum) * pixelHeight / (maxY-minY);
	}
	public double xPxToNum (double xPx){
		return 2;
	}
	public double yPxToNum( double yPx){
		return 3;
	}
	public double deltaXNumToPx( double dX){
		return dX * pixelWidth / (maxX-minX);
	}
	public double deltaYNumToPx( double dY){
		return dY * pixelHeight / (maxY-minY);
	}
	
	public void resentPaint(){
		shapeCache = new LinkedList<Shape>();
	}
	
	@Override
	public void paintComponent(Graphics g){
		Graphics2D g2 = (Graphics2D) g;
		
		RenderingHints rh = new RenderingHints(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		rh.put(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
		g2.setRenderingHints(rh);
		
		g2.setColor( Color.blue );
		for( Shape s : shapeCache){
			
			g2.draw(s);
		}
		
		g2.setColor(Color.black);
		g2.draw( new Line2D.Double(xNumToPx(minY), yNumToPx(0), xNumToPx(maxY), yNumToPx(0) ) );
		g2.draw( new Line2D.Double(xNumToPx(0), yNumToPx(minY), xNumToPx(0), yNumToPx(maxY) ) );
		
	}
	
}
