package objects;

import java.awt.Color;
import java.awt.Graphics;

public class BouncyCircle extends Cirlce{
Color color;

public BouncyCircle(){
size = 60;
gravity = 0.5f;
color = Color.RED;
}

public void DetectarSuelo()
{
if(positionY+size > 400)
{
Saltar();
CambiarColor();
}
}

public void Saltar(){
velocityY = 0.5f;
}

public void CambiarColor()
{
color = Color.blue;
}

public void Draw (Graphics g){	
g.setColor(color);
g.fillOval(positionX,positionY,size,size);
}

public void Update() {

	
}
}