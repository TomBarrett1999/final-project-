/*
* This is basic code for a brick
*breaker game. At the moment all 
*the game does is show brick,
*a moving ball and the ball 
*bouncing off the sides of the 
*game arena. this .java file is 
*where you would run the code.*/

public class MaIn
{
	public static void main(String[] args)
	{
		GameArena g = new GameArena(1000,1000);
/*
*class that calls coursework 
*and runs all the code within the file
*allowing for game to be seen 
*within the window*/
 
    
    		game i = new game(500,100, "RED");
    		i.addTo(g);
		g.update();
		
		game k = new game(300,100, "RED");
    		k.addTo(g);
		g.update();

		game q = new game(100,100, "RED");
    		q.addTo(g);
		g.update();
		
		game l = new game(700,100, "RED");
    		l.addTo(g);
		g.update();

		game t = new game(900,100, "RED");
    		t.addTo(g);
		g.update();



		Brick a = new Brick();
		
		Ball b = new Ball(500,900,10,"RED");
		g.addBall(b);
		g.update();
/*allowing for the ball and the bricks
*to appear on the screen*/

	
		double x,y;
		double xSpeed=3;
		double ySpeed=3;
		while(true)
		{

			x = b.getXPosition();
			b.setXPosition(x+xSpeed);
			if(x+xSpeed>1000)
				xSpeed=-xSpeed;
			if(x+xSpeed<0)
				xSpeed=-xSpeed;

			y = b.getYPosition();
			b.setYPosition(y+ySpeed);
			if(y+ySpeed>1000)
					ySpeed=-ySpeed;
			if(y+ySpeed<0)
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
