package ui;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;

class MyPaintUI extends JFrame implements MouseMotionListener,KeyListener{
	int x1,y1,x2,y2;
	Graphics g1;
	public MyPaintUI(){
		addMouseMotionListener(this);
		addKeyListener(this);
		setSize(300,400);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		x1 = e.getX();
		y1 = e.getY();
		g1 =  getGraphics();
		g1.setColor(Color.BLACK);
		//g1.drawLine(x1, y1, x2, y2);
		g1.fillOval(x1, y1,10, 10);
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		int key = e.getKeyCode();
		if(key == KeyEvent.VK_C) {
			if(e.isAltDown())
				dispose();
			
		}
	}


	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	

}
public class MyPaint{
	public static void main(String[] args) {
		new MyPaintUI();
	}
}