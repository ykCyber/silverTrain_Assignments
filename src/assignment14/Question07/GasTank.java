package assignment14.Question07;

public class GasTank {

	private double capacity;
	private double amounth = 0;

	private double getAmounth() {
		return amounth;
	}

	public void setAmounth(double amounth) {
		this.amounth = amounth;
	}

	public double getCapacity() {
		return capacity;
	}

	public GasTank(double capacity) {
		this.setCapacity(capacity);
	}

	public void setCapacity(double capacity) {
		this.capacity = capacity;
	}

	public void addGas(double amounth) {
		this.setAmounth(this.getAmounth() + amounth);
		if (this.getAmounth() > this.getCapacity()) {
			this.setAmounth(this.getCapacity());
		}
	}

	public void useGas(double usedAmounth) {
		this.setAmounth(this.getAmounth() - usedAmounth);
		if (this.getAmounth() < 0) {
			this.setAmounth(0);
		}
	}

	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return this.getAmounth()<=0.1;
	}

	public double fillUp() {
		
		return this.capacity-this.getGasLevel();
	}

	public double getGasLevel() {
		return this.getAmounth();
	}

	public boolean isFull() {
		return this.getGasLevel()==this.getCapacity();
	}

}
