/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import operation.*;
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
		
		setVisible(true);
	}
	
	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		
		try {
			Operation op = Operation.parseInput("sin(x^y''-y)");
			double [] cor = {2.0,1.0,4.0,1.5};
			System.out.println( op.value( new Point( cor ) ) );
		} catch ( ParseException ex ) {
			
		}
		
		window = new DiffEqGrapher();
	}
}
