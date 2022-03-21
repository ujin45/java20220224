package chap10.book.exercise;

public class Account {

	private long balance;

	public Account() {
	}

	public long getBalance() {
		return balance;
	}

	public void deposite(int money) {
		balance += money;
	}

	public void withdraw(int money) throws BalaceInsufficientException {
		if (balance < money) {
			throw new BalaceInsufficientException("잔고부족 : " + (money - balance) + " 모자람");
		}
		balance -= money;
	}
}
