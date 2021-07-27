package app.core;

public class Client {

	private int id;
	private String name;
	private float balance;
	private Account[] accounts = new Account[5];
	private float commissionRate;
	private float interestRate;
	private Logger logger = new Logger(null);

	public Client(int id, String name, float balance) {
		super();
		this.id = id;
		this.name = name;
		this.balance = balance;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getBalance() {
		return balance;
	}

	public void setBalance(float balance) {
		this.balance = balance;
	}

	public int getId() {
		return id;
	}

	public Account[] getAccounts() {
		return accounts;
	}

	/**
	 * add the account to the array and log the operation. You should seek the array
	 * and place the Account where the first null value is found.
	 * 
	 * @param account
	 */
	public void addAccount(Account account) {
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i] == null) {
				accounts[i] = account;
				// log this operation ===========================================
				// 1. create a log object
				long timestamp = System.currentTimeMillis();
				int clientId = this.id;
				String description = "Add Account";
				float amount = account.getBalance();
				Log log = new Log(timestamp, clientId, description, amount);
				// 2. use the logger to save (print to screen) the log
				logger.log(log);
				// ==============================================================
				return;
			}
		}
		// if we are here the array is full
		System.out.println("Array Account failed - array is full. for account id: " + account.getId());
	}

	public Account getAccount(int index) {
		if (index >= 0 && index < accounts.length) {
			return accounts[index];
		} else {
			return null;
		}
	}

	/**
	 * remove the account with the same id from the array (by assigning a 'null'
	 * value to the array[position]) & transfers the money to the clients balance.
	 * Log the operation via creating Log object with appropriate data and sending
	 * it to the Logger.log(..) method.
	 */
	public void removeAccount(int accountId) {
		for (int i = 0; i < accounts.length; i++) {
			Account account = accounts[i];
			if (account != null && account.getId() == accountId) {
				// if we are here we found the account to remove
				accounts[i] = null; // remove the account from the array
				balance += account.getBalance(); // transfer the money from account to balance
				// log this operation ===========================================
				// 1. create a log object
				long timestamp = System.currentTimeMillis();
				int clientId = this.id;
				String description = "Remove Account";
				float amount = account.getBalance();
				Log log = new Log(timestamp, clientId, description, amount);
				// 2. use the logger to save (print to screen) the log
				logger.log(log);
				// ==============================================================
				return;
			}
		}
		// if we are here the account was not found
		System.out.println("removeAccount failed - account with id " + accountId + " not found");
	}

	/**
	 * implement to add the amount to client balance according to the commission
	 * (which is now zero). Use the commission data member in your calculation)
	 */
	public void deposit(float amount) {
		// calculate the commission for this deposit
		float commission = this.commissionRate * amount;
		// add the amount to the balance
		this.balance += amount;
		// remove the commission from the balance
		this.balance -= commission;
		// log this operation ===========================================
		// 1. create a log object
		long timestamp = System.currentTimeMillis();
		int clientId = this.id;
		String description = "deposit";
		Log log = new Log(timestamp, clientId, description, amount);
		// 2. use the logger to save (print to screen) the log
		logger.log(log);
		// ==============================================================
	}

	/**
	 * implement to remove the amount from client balance according to the
	 * commission (which is now zero). Use the commission data member in your
	 * calculation)
	 */
	public void withdraw(float amount) {
		// calculate the commission for this deposit
		float commission = this.commissionRate * amount;
		// remove the amount from the balance
		this.balance -= amount;
		// remove the commission from the balance
		this.balance -= commission;
		// log this operation ===========================================
		Log log = new Log(System.currentTimeMillis(), this.id, "withdraw", amount);
		logger.log(log);
		// ==============================================================
	}

	/**
	 * run over the accounts, calculate the amount to add according to the client
	 * interest (meanwhile it is zero) and add it to each account balance. Use the
	 * interest data member in your calculation. Log this operation.
	 */
	public void autoUpdateAccounts() {
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i] != null) {
				float interest = accounts[i].getBalance() * this.interestRate;
				accounts[i].setBalance(accounts[i].getBalance() + interest);
				// log this operation ===========================================
				Log log = new Log(System.currentTimeMillis(), this.id, "autoUpdateAccounts", interest);
				logger.log(log);
				// ==============================================================
			}
		}
	}

	/** returns the sum of client balance + total account balance */
	public float getFortune() {
		float fortune = getBalance();
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i] != null) {
				fortune += accounts[i].getBalance();
			}
		}
		return fortune;
	}

}
