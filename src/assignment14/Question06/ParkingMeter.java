package assignment14.Question06;

public class ParkingMeter {

	private int timeLeft = 0;
	final int MAX_TIME;

	public int getTimeLeft() {
		int alfa = 0;
		return timeLeft;
	}

	public void setTimeLeft(int timeLeft) {
		this.timeLeft = timeLeft;
	}

	public int getMaxTime() {
		return MAX_TIME;
	}

	public ParkingMeter(int maxTime) {
		this.MAX_TIME = maxTime;
	}

	public boolean add(int i) {
		if (i == 25 && this.getMaxTime() >= 30 + this.timeLeft) {
			this.timeLeft = 30 + this.timeLeft;
			return true;
		} else
			return false;
	}

	public void tick() {
		if (this.getTimeLeft() > 0)
			this.setTimeLeft(this.getTimeLeft() - 1);
	}
	public boolean isExpired() {
		return this.getTimeLeft()<=0;
	}
}
