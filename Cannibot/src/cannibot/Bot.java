package cannibot;

import java.util.Random;

public class Bot {

	private Component lArm, rArm, lLeg, rLeg, body, lEye, rEye;
	private Random rand;
	
	public Bot()
	{
		//TODO: These should be in some kind of easy to use array.
		lArm = new Component();
		rArm = new Component();
		lLeg = new Component();
		rLeg = new Component();
		body = new Component();
		lEye = new Component();
		rEye = new Component();
		rand = new Random();
	}
	
	public void takeDamage()
	{
		int damageAmount = rand.nextInt(10);
		
		switch(rand.nextInt(7))
		{
		case 0:	lArm.damage(damageAmount);
			break;
		
		case 1: rArm.damage(damageAmount);
			break;
		
		case 2: lLeg.damage(damageAmount);
			break;
			
		case 3: rLeg.damage(damageAmount);
			break;
			
		case 4: lEye.damage(damageAmount);
			break;
			
		case 5: rEye.damage(damageAmount);
			break;
			
		case 6:
			break;
			
		}
		
	}

	public boolean isFunctioning()
	{ //TODO: currently, this is only true if all the parts are working. A robot should be able to function with one eye, one arm etc.
		boolean functioning = true;
		
//		if(lArm.isWorking()
//				&& rArm.isWorking()
//				&& lLeg.isWorking()
//				&& rLeg.isWorking()
//				&& body.isWorking()
//				&& lEye.isWorking()
//				&& rEye.isWorking() )
//		{
//			return true;
//		}
//		else
//		{
//			return false;
//		}
//		
		
		if(!lArm.isWorking() && !rArm.isWorking())
		{
			functioning = false;
		}
		
		if(!lLeg.isWorking() && !lLeg.isWorking() )
		{
			functioning = false;
		}
		
		if(!lEye.isWorking() && !rEye.isWorking() )
		{
			functioning = false;
		}
		
		if(!body.isWorking() )
		{
			functioning = false;
		}
		
		return functioning;
	}

	public Component getlArm() {
		return lArm;
	}

	public void setlArm(Component lArm) {
		this.lArm = lArm;
	}

	public Component getrArm() {
		return rArm;
	}

	public void setrArm(Component rArm) {
		this.rArm = rArm;
	}

	public Component getlLeg() {
		return lLeg;
	}

	public void setlLeg(Component lLeg) {
		this.lLeg = lLeg;
	}

	public Component getrLeg() {
		return rLeg;
	}

	public void setrLeg(Component rLeg) {
		this.rLeg = rLeg;
	}

	public Component getlEye() {
		return lEye;
	}

	public void setlEye(Component lEye) {
		this.lEye = lEye;
	}

	public Component getrEye() {
		return rEye;
	}

	public void setrEye(Component rEye) {
		this.rEye = rEye;
	}

	public Component getBody() {
		return body;
	}

	public void setBody(Component body) {
		this.body = body;
	}

}
