package app.core;

public class Bank {

	private float balance;
	private Client[] clients = new Client[100];
	private Logger logger = new Logger(null);
	Object accountsUpdater; // not supported yet

	public float getBalance() {
		return balance;
	}


	public float getClientsFortune() {
		float fortune = 0;
		for (int i = 0; i < clients.length; i++) {
			if (clients[i] != null) {
				fortune += clients[i].getFortune();
			}
		}
		return fortune;
	}

	/** add the client to the array and log the operation. */
	public void addClient(Client client) {
		for (int i = 0; i < clients.length; i++) {
			if (clients[i] == null) {
				this.clients[i] = client; // add the client to the array
				// log the operation ====================
				Log log = new Log(System.currentTimeMillis(), client.getId(), "addClient", client.getFortune());
				logger.log(log);
				// ======================================
				return; // exit from this method
			}
		}
		// if we are here the bank has 100 client (max)
		System.out.println("addClient failed - Bank has 100 clients already");
	}

	/**
	 * remove the client with the same id from the array (by assigning a 'null'
	 * value to the array[position]). Log the operation
	 */
	public void removeClient(int clientId) {
		for (int i = 0; i < clients.length; i++) {
			if (clients[i] != null && clients[i].getId() == clientId) {
				// if we are here we found the client to remove
				Client client = clients[i];
				clients[i] = null; // remove the client
				// log the operation ====================
				Log log = new Log(System.currentTimeMillis(), client.getId(), "removeClient", -client.getFortune());
				logger.log(log);
				// ======================================
				return; // exit the method
			}
		}
		// if we are here we did not find the client
		System.out.println("client with id " + clientId + " not found");
	}
	
	public Client[] getClients() {
		return clients;
	}
	
	public void viewLogs() {
		System.out.println("not supported yet");
	}
	
	public void startAcountUpdater() {
		System.out.println("not supported yet");
	}
	
}
