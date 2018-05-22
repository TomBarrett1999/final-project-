import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Brick
{

	public static void main (String[]args) 
	{
		Brick a = new Brick();
		GameArena g = new GameArena(900,1000);
		Ball b = new Ball(250,250,10,"RED");
		g.addBall(b);
		g.update();
/*
*creating a window allowing 
*me to add a moveing ball 
*and bricks for the ball
*to break
*/
	
		double x,y;
		double xSpeed=3;
		double ySpeed=0;
		while(true)
		{

			x = b.getXPosition();
			b.setXPosition(x+xSpeed);
			if(x+xSpeed>500)
				xSpeed=-xSpeed;
			if(x+xSpeed<0)
				xSpeed=-xSpeed;

			y = b.getYPosition();
			b.setYPosition(y+ySpeed);
			if(y+ySpeed>500)
					xSpeed=-xSpeed;
			if(y+ySpeed<0)
				ySpeed=-ySpeed;
			g.update();
			
		}
	}
}

/*
*code that allows the ball to move in the x or y
*diection that i pick 
*also allows the balls to bounce of the walls
*/

