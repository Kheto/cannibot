package cannibot;

public class Component {

	private int healthPoints;
	private boolean isWorking;
	
	public Component()
	{
		healthPoints = 100;
		isWorking = true;
		
	}
	
	public void damage(int amount)
	{
		healthPoints -= amount;
	}
	
	public boolean isWorking() {
		if (healthPoints <= 0)
		{
			isWorking = false;
		}
		return isWorking;
	}
	public void setWorking(boolean isWorking) {
		this.isWorking = isWorking;
	}
	public int getHealthPoints() {
		return healthPoints;
	}
	public void setHealthPoints(int healthPoints) {
		this.healthPoints = healthPoints;
	}
}
