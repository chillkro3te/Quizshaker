package network;
/**
 * 
 * class to manage opening and closing ports for the controller connection
 * @author hendrik
 *
 */

import java.io.IOException;
import java.net.*;

public class port_handler {

	static private int port = 21337; //Needs to be changed to a working port
	static private ServerSocket ss;
	static private boolean port_open = false;
	
	private Socket s;
	
	public port_handler() {
		
	}
	/**
	 * Creates new ServerSocket. Returns open one in case of trying to open another one.
	 * @return Socket - Ready to be read via getinputstream. 
	 * @throws IOException
	 */
	public Socket create() throws IOException {

		if(port_open == false) {
			ss = new ServerSocket(port);
			s = ss.accept();
		
			return s;
		}
		return s;
	}
	/**
	 * Destroys the open Socket
	 */
	public void destroy() throws IOException {
		ss.close();
		port_open = false;
	}
	
}
