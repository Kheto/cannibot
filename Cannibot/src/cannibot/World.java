package cannibot;

public class World {
	Bot[] botList;
	Cannibot theCannibot;
	int numberOfBots, amountOfRubbish, rubbishCubes;
	public boolean testBool;
	
	World(int numberOfBotsIn, int amountOfRubbishIn)
	{
		numberOfBots = numberOfBotsIn;
		amountOfRubbish = amountOfRubbishIn;
		rubbishCubes = 1;
		
		botList = new Bot[numberOfBots];
		
		for (int i = 0; i < (numberOfBots); i++ )
		{
			botList[i] = new Bot();
		}
		
		theCannibot = new Cannibot();
	}
	
	public void update()
	{
		for (Bot currentBot : botList)
		{
			if (currentBot.isFunctioning())
			{
				currentBot.takeDamage();
				if (amountOfRubbish >= 4)
				{
					amountOfRubbish -= 4;
					rubbishCubes += 1;
				}
			}
			else
			{
				currentBot = theCannibot.cannibalize(currentBot);
			}
		}
		
		if (theCannibot.isFunctioning())
		{
			theCannibot.takeDamage();
			if (amountOfRubbish >= 4)
			{
				amountOfRubbish -= 4;
				rubbishCubes += 1;
			}
		}
		
	}
	
	public String getTestData()
	{
		String testString = Integer.toString(rubbishCubes);
		testString += "\n";
		testString += theCannibot.isFunctioning();
		testString += "\n";
		testString += "L Arm: " + theCannibot.getlArm().isWorking() + " R Arm: " + theCannibot.getrArm().isWorking() + "\n";
		testString += "L Leg: " + theCannibot.getlLeg().isWorking() + " R Leg: " + theCannibot.getrLeg().isWorking() + "\n";
		testString += "L Eye: " + theCannibot.getlEye().isWorking() + " R Eye: " + theCannibot.getrEye().isWorking() + "\n";
		testString += "Body: " + theCannibot.getBody().isWorking();
		return testString;
	}

}
