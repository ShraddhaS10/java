package com.gvacharya.ninputoutputpackages.sockets;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;

import com.gvacharya.ninputoutputpackages.sockets.entities.Book;

public class ServerChannelSocket {

	public static void main(String[] args) {
		int port=9090;
		try(
				ServerSocketChannel server = ServerSocketChannel.open();
			){
			
			server.bind(new InetSocketAddress(port));
			System.out.println("Server Started At:" + port);
			
			while(true) {
				try(SocketChannel client = server.accept()){
					System.out.println("Cleint connected at:" + client.getRemoteAddress());
					
					ByteBuffer buffer = ByteBuffer.allocate(1024);
					int charVal=client.read(buffer);
					if(charVal != -1) {
						buffer.flip();
						byte[] byteArray = new byte[buffer.remaining()];
						buffer.get(byteArray);
						try(
							
								ByteArrayInputStream bais = 
									new ByteArrayInputStream(byteArray);
								ObjectInputStream ois = 
									new ObjectInputStream(bais);
								
							){
							
							Book book1 = (Book)ois.readObject();
							System.out.println(book1);
							
						} catch (ClassNotFoundException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						
					}
					
				}
			}
			
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
