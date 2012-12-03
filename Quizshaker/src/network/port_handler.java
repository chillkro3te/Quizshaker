package network;
/**
 * 
 * class to manage opening and closing ports for the controller connection
 * @author hendrik
 *
 */

import java.net.*;
import java.io.*;


public class port_handler {

	static private int port = 21337; //Needs to be changed to a working port
	static private ServerSocket ss;
	static InputStream instream;

	static private boolean port_open = false;
	
	public port_handler() {
		
	}
	
	public ServerSocket create(){
		
		return ss; 
	}
	
}
