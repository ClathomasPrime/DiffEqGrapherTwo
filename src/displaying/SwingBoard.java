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
	
	private LinkedList<Shape> shapeCashe = new LinkedList<Shape>();
	
	public SwingBoard( double minX, double maxX, double minY, double maxY ){
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
			//code that takes a comp and turns it into an awt shape, then adds it to shapeCashe
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
	public void paintComponent(Graphics g){
		Graphics2D g2 = (Graphics2D) g;
		
		
		
	}
}
