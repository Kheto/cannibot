package cannibot;

public class Cannibot extends Bot {
	
	
	public Cannibot() {
		super();
	}

	public Bot cannibalize(Bot target)
	{
		//I know this is awful, please don't judge me.
		Bot cannibalizedBot = target;
		
		if (!super.getlArm().isWorking() && target.getlArm().isWorking())
		{
			Component tempComponent = target.getlArm();
			cannibalizedBot.setlArm(super.getlArm());
			super.setlArm(tempComponent);
		}
		
		if (!super.getrArm().isWorking() && target.getrArm().isWorking())
		{
			Component tempComponent = target.getrArm();
			cannibalizedBot.setrArm(super.getrArm());
			super.setrArm(tempComponent);
		}

		if (!super.getrLeg().isWorking() && target.getrLeg().isWorking())
		{
			Component tempComponent = target.getrLeg();
			cannibalizedBot.setrLeg(super.getrLeg());
			super.setrLeg(tempComponent);
		}
		
		if (!super.getlLeg().isWorking() && target.getlLeg().isWorking())
		{
			Component tempComponent = target.getlLeg();
			cannibalizedBot.setlLeg(super.getlLeg());
			super.setlLeg(tempComponent);
		}
		
		if (!super.getlEye().isWorking() && target.getlEye().isWorking())
		{
			Component tempComponent = target.getlEye();
			cannibalizedBot.setlEye(super.getlEye());
			super.setlEye(tempComponent);
		}
		
		if (!super.getrEye().isWorking() && target.getrEye().isWorking())
		{
			Component tempComponent = target.getrEye();
			cannibalizedBot.setrEye(super.getrEye());
			super.setrEye(tempComponent);
		}
		
		return cannibalizedBot;
	}

}
