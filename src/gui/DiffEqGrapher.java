/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import operation.*;
import displayable.*;
import displaying.SwingBoard;
import javax.swing.JFrame;
/**
 *
 * @author jamesthomas
 */
public class DiffEqGrapher extends JFrame{
	
	static DiffEqGrapher window;
	
	public DiffEqGrapher(){
		setSize(600,600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setTitle("ForceBoard");
		
		SwingBoard board = new SwingBoard(-1,2,-1,2);
		add( board );
		
		try {
			/*Function func = new Function("abs(x)^(x)");
			func.drawTo(board);*/
			
			//VectorField vector = new VectorField("1/6*y/(x^2+y^2)^0.5","(-1)/6*x/(x^2+y^2)^0.5");
			//vector.drawTo(board);
			
			SlopeField sl = new SlopeField( "y", new Point(0,1) );
			sl.drawTo(board);
			sl.drawNumericalSolution(board);
			
			board.repaint();
		} catch ( ParseException ex ) {
			System.out.println( "Parse Error" );
		}
		
		
		setVisible(true);
	}
	
	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		
		/* try {
			Operation op = Operation.parseInput("sin(x^y''-y)");
			double [] cor = {2.0,1.0,4.0,1.5};
			System.out.println( op.value( new Point( cor ) ) );
		} catch ( ParseException ex ) {
			
		}*/
		
		window = new DiffEqGrapher();
	}
}
