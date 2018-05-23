/*
* <h1> Brick Breaker </h1>
*<p>
*This is basic code for a brick
*breaker game. At the moment all 
*the game does is show brick,
*a moving ball and the ball 
*bouncing off the sides of the 
*game arena. this .java file is 
*where you would run the code.
*
*@author Tom Barrett
*@Version 2.0
*/

public class MaIn
{
	public static void main(String[] args)
	{
		GameArena g = new GameArena(1000,1000);
/*
*class that calls coursework 
*and runs all the code within the file
*of game arean 
*allowing for game to be seen 
*within the window*/
 
    		

    		Rectangle i = new Rectangle(500,100,50,50,"GREEN");
    		g.addRectangle(i);
		g.update();
		
		Rectangle k = new Rectangle(300,100,50,50,"GREEN");
    		g.addRectangle(k);
		g.update();

		Rectangle q = new Rectangle(100,100,50,50,"GREEN");
    		g.addRectangle(q);
		g.update();
		
		Rectangle l = new Rectangle(700,100,50,50,"GREEN");
    		g.addRectangle(l);
		g.update();

		Rectangle t = new Rectangle(900,100,50,50,"GREEN");
    		g.addRectangle(t);
		g.update();

		Rectangle O = new Rectangle(500,200,50,50,"GREEN");
    		g.addRectangle(O);
		g.update();
		
		Rectangle Z = new Rectangle(300,200,50,50,"GREEN");
    		g.addRectangle(Z);
		g.update();

		Rectangle P = new Rectangle(100,200,50,50,"GREEN");
    		g.addRectangle(P);
		g.update();

		Rectangle n = new Rectangle(700,200,50,50,"GREEN");
    		g.addRectangle(n);
		g.update();

		Rectangle f = new Rectangle(900,200,50,50,"GREEN");
    		g.addRectangle(f);
		g.update();

		Brick a = new Brick();
		
		Ball b = new Ball(500,900,10,"RED");
		Ball c = new Ball(500,920,10,"RED");
		Ball d = new Ball(500,940,10,"RED");
		g.addBall(b);
		g.addBall(c);
		g.addBall(d);
		
		g.update();
/*allowing for the ball and the bricks
*to appear on the screen*/

	
		double x1,y1,x2,y2,x3,y3;
		double xSpeed=-3;
		double ySpeed=6;
		while(true)
		{

			x1 = b.getXPosition();
			b.setXPosition(x1+xSpeed);
			if(x1+xSpeed>1000)
				xSpeed=-xSpeed;
			else if(x1+xSpeed<0)
				xSpeed=-xSpeed;

			y1 = b.getYPosition();
			b.setYPosition(y1+ySpeed);
			if(y1+ySpeed>1000)
				ySpeed=-ySpeed;
			else if(y1+ySpeed<0)
				ySpeed=-ySpeed;


			//if( (x1+xSpeed>500 && x1+xSpeed<100) && y1+ySpeed == 950){
				//xSpeed = -xSpeed;
				//ySpeed = -ySpeed;
		

			x2 = c.getXPosition();
			c.setXPosition(x2+xSpeed);
			if(x2+xSpeed>1000)
				xSpeed=-xSpeed;
			else if(x2+xSpeed<0)
				xSpeed=-xSpeed;

			y2 = c.getYPosition();
			c.setYPosition(y2+ySpeed);
			if(y2+ySpeed>1000)
				ySpeed=-ySpeed;
			else if(y2+ySpeed<0)
				ySpeed=-ySpeed;


			//if( (x2+xSpeed>500 && x2+xSpeed<100) && y2+ySpeed == 950)
			
				//xSpeed = -xSpeed;
				//ySpeed = -ySpeed;
			
			x3 = d.getXPosition();
			d.setXPosition(x3+xSpeed);
			if(x3+xSpeed>1000)
				xSpeed=-xSpeed;
			else if(x3+xSpeed<0)
				xSpeed=-xSpeed;

			y3 = d.getYPosition();
			d.setYPosition(y3+ySpeed);
			if(y3+ySpeed>1000)
				ySpeed=-ySpeed;
			else if(y3+ySpeed<0)
				ySpeed=-ySpeed;

			g.update();
		}
	}

}
/*
*the while loop is allowing the ball to 
*have control move around on the 
*game/window and bouncing correctly 
*of the walls of the game arean*/
