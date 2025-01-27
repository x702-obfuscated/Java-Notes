package main;

import java.awt.*;
import javax.swing.*;

/** Game Frame is the frame of the  window */
@SuppressWarnings("serial")
public class GameFrame extends JFrame {
	
	GamePanel panel;
	
	GameFrame(){
		panel = new GamePanel();
		this.add(panel);
		this.setTitle("Simple Chess");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		this.setBackground(Color.black);
		this.setVisible(true);
		
		this.pack();
		
		panel.launchGame();
		
		
	}
}