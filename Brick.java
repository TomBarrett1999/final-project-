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


/*
*code that allows the ball to move in the x or y
*diection that i pick 
*also allows the balls to bounce of the walls
*/
	public class game
	{ 
		private double x; 
		private double y;
		private double w;
		private double h; 
		  
		private Rectangle shape[] = new Rectangle[4];
		  
		public game(double XPos, double YPos, String colour)
		{
		x=XPos; 
		y=YPos;
		shape[0] = new Rectangle((x-0), (y+0), 0, 0, colour); 
		shape[1] = new Rectangle((x+0), (y+0), 0, 0, colour); 
		shape[2] = new Rectangle(x, y, 150, 100, colour); 
		shape[3] = new Rectangle(x, (y-0), 0, 0, colour);
		} 
	
		public void addTo(GameArena g)     
		{
			a.addRectangle(shape[0]);
			a.addRectangle(shape[1]); 
			a.addRectangle(shape[2]); 
			a.addRectangle(shape[3]);   
			a.update();
		}
  	
		public double getx() 
		{
			return x;
		} 
  	
		public double gety() 
		{
			return y;
		}
 	}
}
/*
*allows to create a brick using an array
*this will enable for the users of the 
*code to add bricks later on in the code in a
*seprate Object orientated file allowing 
*for the brick to show*/
