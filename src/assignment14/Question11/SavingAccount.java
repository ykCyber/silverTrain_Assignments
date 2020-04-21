package assignment14.Question11;

public class SavingAccount extends BankAccount{
private int interestRate;

public SavingAccount(int interestRate) {
	super();
	this.interestRate = interestRate;
}

public int getInterestRate() {
	return interestRate;
}
}
