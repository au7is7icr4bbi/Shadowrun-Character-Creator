/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;
import javax.swing.*;
import javax.swing.WindowConstants;

/**
 *
 * @author andrew
 */
public class Main
{
	public static void main(String args[])
	{
		JFrame addWindow = new JFrame();
		addWindow.setContentPane(new CreatePanel());
		addWindow.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		addWindow.setVisible(true);
	}
}
