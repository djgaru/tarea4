package tarea4;

import objects.Cirlce;
import objects.BouncyCircle;


import objects.WallJump;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;


public class Canvas extends JPanel {

	private static final long serialVersionUID=1L;
	Cirlce circle =new Cirlce();
	BouncyCircle bouncy=new BouncyCircle();
	WallJump walljump=new WallJump();
		
	public Canvas()
	{
		
	}
	
	public void paint(Graphics g) {
		update(g);
		g.setColor(Color.BLUE);
		g.fillRect(0,  0,  getSize().width,  getSize().height);;
		circle.Draw(g);
		bouncy.Draw(g);
		walljump.Draw(g);
		
		repaint();
	}
	public void update (Graphics g){
		circle.Update();
		bouncy.Update();
		walljump.Update();
	}
	
	}
	