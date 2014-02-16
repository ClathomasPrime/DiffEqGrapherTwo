/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package displaying;

import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.util.LinkedList;
/**
 *
 * @author jamesthomas
 */
public class SwingBoard extends JPanel implements Drawable {
	
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
	
	public void resentPaint(){
		shapeCache = new LinkedList<Shape>();
	}
	
	@Override
	public void paintComponent(Graphics g){
		Graphics2D g2 = (Graphics2D) g;
		
		for( Shape s : shapeCache){
			
		}
		
	}
	
	/* George code:
	private float transformX(double x){ 
		return (float)((x - getXMin())/getXSize() * getWidth() ); 
	} 
	private float transformY(double y){ 
		return remapNumY(y,(float)getYMin(),(float)getYSize(),
				(float)getHeight(),-(float)getHeight() ); 
	} 
	private float remapNumY(double y, float yMin, float ySize, float newYMin, float newYSize){ 
		return (float)((y-yMin)*newYSize/ySize+newYMin); 
	}*/
}
