package OOP;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class GUIExam1Main {

	public static void main(String[] args) {
		// JLabel = a GUI display area for a string of text, an image, or both
		
		ImageIcon i = new ImageIcon("poo.png");
		
		JLabel label = new JLabel();
		label.setText("David!!, Do you even code? ");
		label.setIcon(i);
		label.setHorizontalTextPosition(JLabel.LEFT);
		label.setVerticalTextPosition(JLabel.TOP);
		
		JFrame frame = new JFrame();// creates a frame
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
		frame.setTitle("News letter");
		frame.setSize(500,500);// set the x-dimension, and y-dimension of frame
		frame.setVisible(true); // make frame visable
		frame.add(label);
		frame.getContentPane().setBackground(new Color(0x666666)); 

	}

}
