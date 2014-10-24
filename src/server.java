import java.net.*;
import java.io.*;

import javax.imageio.IIOException;
public  class server extends Thread {
	
	public ServerSocket serverSocket;

		public server(int port,int backlog) throws IOException{
			serverSocket=new ServerSocket(port);
		}
		
		public void start(){
			
			try {
				Socket server=serverSocket.accept();
				DataInputStream input= new DataInputStream(server.getInputStream());
				System.out.println(input.readUTF());
				 DataOutputStream out =
		                 new DataOutputStream(server.getOutputStream());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			
		}
}
} 