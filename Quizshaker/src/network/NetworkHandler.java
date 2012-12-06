package network;
/**
 * 
 * class to manage opening and closing ports for the controller connection
 * @author hendrik
 *
 */

import game.ScoreHandler;

import java.io.*;
import java.net.*;

public class NetworkHandler {

	static private NetworkHandler instance;
	
	static private int port = 51234; 
	static private ServerSocket ss;
	static private boolean port_open = false;
	
	static private BufferedReader in;
	static private PrintWriter out;
	
	private Socket s;
	
	private NetworkHandler() {}
	
	public synchronized static NetworkHandler getInstance(){
		if(instance == null){
			instance = new NetworkHandler();
		}
		return instance;
	}
	
	/**
	 * Creates new ServerSocket and in/out Reader
	 * Use readline and printline to communicate with the port  
	 * @throws IOException
	 */
	public void openSocket() throws IOException {

		if(port_open == false) {
			ss = new ServerSocket(port);
			s = ss.accept();
			
			in = new BufferedReader(new InputStreamReader(s.getInputStream()));
			out = new PrintWriter(s.getOutputStream(), true);
		}
	}
	
	/**
	 * Destroys the open Socket
	 */
	public void closeSocket() throws IOException {
		in.close();
		out.close();
		ss.close();
		port_open = false;
	}
	
	public BufferedReader getInputStream(){
		return in;
	}
	public PrintWriter getOutputStream(){
		return out;
	}
	
}
