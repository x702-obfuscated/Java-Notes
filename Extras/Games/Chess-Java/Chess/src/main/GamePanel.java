package main;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

/** Game Panel is the canvas of the window */
@SuppressWarnings("serial")
public class GamePanel extends JPanel implements Runnable {
	public static final int WIDTH = 1100;
	public static final int HEIGHT = 800;
	final int FPS = 60;
	Thread gameThread;
	
	
	
	public GamePanel(){
		setPreferredSize(new Dimension(WIDTH,HEIGHT));
		setBackground(Color.black);
	}
	
	public void launchGame() {
		gameThread = new Thread(this);
		gameThread.start();
	}
	
	public void update() {
		
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
	}

	@Override
	public void run() {
		
		
	}
	
	
}