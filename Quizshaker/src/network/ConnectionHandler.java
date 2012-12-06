package network;

import java.io.*;
import network.NetworkHandler;

public class ConnectionHandler {
		
		private String inputstring;
	
		private static NetworkHandler nh = NetworkHandler.getInstance();
	
		public ConnectionHandler(){
			
		}
		/**
		 * Reads the input stream for connections
		 * @return
		 * @throws IOException
		 */
		public int CheckForConnections() throws IOException {
			if((inputstring = nh.getInputStream().readLine()) != null){
				
				
				
				return 1;
			}
			return 0;
		}
}
