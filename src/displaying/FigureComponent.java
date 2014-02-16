/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package displaying;

import java.awt.Shape;

/**
 *
 * @author jamesthomas
 */
public interface FigureComponent {
	public double getWeight();
	
	public Shape swingShape( SwingBoard b );
}
