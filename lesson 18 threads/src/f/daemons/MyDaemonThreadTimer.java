package f.daemons;

import java.time.LocalTime;

public class MyDaemonThreadTimer extends Thread {

	{
		setDaemon(true);
	}

	@Override
	public void run() {
		while (true) {
			try {
				sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Daemon time is: " + LocalTime.now());
		}
	}

}
