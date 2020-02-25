/**
 * 
 */
package pkj;

/**
 * @author Jia Chen Huang
 * @version Feb 25, 2020
 * This file runs all three parts of the echoserver in order
 *
 */
public class RunMe {

	/**
	 * 
	 */
	public RunMe() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread client, host, server;
		
		client = new Thread(new Client());
		host = new Thread(new IntHost());
		server = new Thread(new Server());

		client.start();
		host.start();
		server.start();
	}

}
