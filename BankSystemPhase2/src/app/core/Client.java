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
			if(accounts[i] == null) {
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
		if(index >=0 && index<accounts.length) {
			return accounts[index];
		}else {
			return null;
		}
	}
	
	

}
