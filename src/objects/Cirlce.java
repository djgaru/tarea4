package objects;

import java.awt.Color;
import java.awt.Graphics;

public class Cirlce {

	public int positionX, positionY;
	public float velocityX, velocityY;
	public int size;
	public float gravity;
	public float jumpImpulse;
	
	public Cirlce()
	{
		size = 40;
		gravity = 0.5f;
			}
	
	public void Update()
	{
		AplicacionGravedad();
		DetectarSuelo();
		ActualizarPosicion();
	}
	
	public void ActualizarPosicion()
	{
		positionX = (int)velocityX;
		positionY = (int)velocityY;
	}
	public void DetectarSuelo()
	{
		if(positionY+size > 400)
			System.out.println("Detecte Suelo");
	}
	
	public void AplicacionGravedad(){
		velocityY += gravity;
	}
	
	public void Draw (Graphics g){
		g.setColor(Color.YELLOW);
		g.fillOval(positionX,  positionY,  size,  size);
	}
	
	}
	
	
