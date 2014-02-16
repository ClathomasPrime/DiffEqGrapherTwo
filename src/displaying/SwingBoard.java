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
			//
		}
	}

	@Override
	public double getXMin() {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public double getXMax() {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public double getYMin() {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public double getYMax() {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}
	
	@Override
	public void paintComponent(Graphics g){
		Graphics2D g2 = (Graphics2D) g;
		
		
		
	}
}
