package finalProject;

import java.awt.Dimension;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;

public class GamePanel extends JPanel implements Runnable, KeyListener 
{
	public static final int WIDTH = 400;
	public static final int HEIGHT = 400;
	
	public GamePanel() 
	{
		setPreferredSize(new Dimension(WIDTH, HEIGHT));
		setFocusable(true);
		requestFocus();
		addKeyListener(this);
	}
	@Override
	public void keyPressed(KeyEvent arg0) 
	{

	}

	@Override
	public void keyReleased(KeyEvent arg0) 
	{

	}

	@Override
	public void keyTyped(KeyEvent arg0) 
	{

	}

	@Override
	public void run() 
	{

	}

}
