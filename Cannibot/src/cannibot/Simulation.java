package cannibot;

public class Simulation {
	public static final int NUMBER_OF_BOTS = 100;
	public static final int AMOUNT_OF_RUBBISH = 4000000;
	public static final int NUMBER_OF_TURNS = 10000;
	
	
	
	public static void main(String[] args) {
		World myWorld = new World(NUMBER_OF_BOTS, AMOUNT_OF_RUBBISH);
		int i = NUMBER_OF_TURNS;
		
		while (i > 0)
		{
			if ( i % 1000 == 0)
			{
				System.out.println("Working... " + Integer.toString((i/1000) ));
				System.out.println(myWorld.getTestData());
				System.out.println();
			}
			myWorld.update();
			i--;
		}


	}
}
