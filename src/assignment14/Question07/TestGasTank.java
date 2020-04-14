package assignment14.Question07;

public class TestGasTank {

	public static void main(String[] args) {
		GasTank gt = new GasTank(30D);
			gt.addGas(9);
			gt.addGas(9);
			gt.addGas(9);
			gt.addGas(9);
			gt.addGas(9);
			System.out.println("gt.getAmounth() = " + gt.getGasLevel());
			gt.useGas(20d);
			System.out.println("gt.getGasLevel() = " + gt.getGasLevel());
			gt.useGas(2L);
			gt.useGas(1);
			System.out.println("gt.getGasLevel() = " + gt.getGasLevel());
			boolean isEmpty = gt.isEmpty();
			boolean isFull = gt.isFull();
			gt.useGas(100);
			System.out.println("gt.isEmpty() = " + gt.isEmpty());
			gt.addGas(20.34);
			System.out.println("gt.fillUp() = " + gt.fillUp());
			System.out.println(gt.isFull());

			
	}

}
