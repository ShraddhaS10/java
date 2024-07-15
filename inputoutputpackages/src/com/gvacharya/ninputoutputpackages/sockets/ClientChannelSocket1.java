package com.gvacharya.ninputoutputpackages.sockets;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;

import com.gvacharya.ninputoutputpackages.sockets.entities.Book;

public class ClientChannelSocket1 {

	public static void main(String[] args) {
		int port=9090;
		String host="localhost";
		try(
				SocketChannel client=SocketChannel.open();
				ByteArrayOutputStream baos = new ByteArrayOutputStream();
				ObjectOutputStream oos = new ObjectOutputStream(baos);
			){
			client.connect(new InetSocketAddress(host,port));
			Book book2=new Book(3,"Head First");
			oos.writeObject(book2);
			oos.flush();
			
			ByteBuffer buffer = ByteBuffer.wrap(baos.toByteArray());
			client.write(buffer);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
