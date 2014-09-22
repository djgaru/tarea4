
package objects;

import java.awt.Color;
import java.awt.Graphics;

public class WallJump extends Cirlce{
Color color;

	
	public WallJump()
	{
		size = 20;
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
		if(positionX+size > 400)
			System.out.println("Detecte Suelo");
	}
	
	public void AplicacionGravedad(){
		velocityX += gravity;
	}
	
	public void Draw (Graphics g){
		g.setColor(Color.YELLOW);
		g.fillOval(positionX,  positionY,  size,  size);
	}
	
	}
	
	