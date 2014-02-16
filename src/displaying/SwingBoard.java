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
	
	public double xNumToPx( double xNum){
		return (xNum-minX) * pixelWidth / (maxX-minX);
	}
	public double yNumToPx( double yNum){
		return (maxY-yNum) * pixelHeight / (maxY-minY);
	}
	
	public void resentPaint(){
		shapeCache = new LinkedList<Shape>();
	}
	
	@Override
	public void paintComponent(Graphics g){
		Graphics2D g2 = (Graphics2D) g;
		
		//g2.draw( new Ellipse2D.Double(0,0,10,10) );
		
		for( Shape s : shapeCache){
			
			g2.draw(s);
		}
		
	}
	
}
