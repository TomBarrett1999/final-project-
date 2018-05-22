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

		
