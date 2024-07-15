package com.gvacharya.ninputoutputpackages.readwritefile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class ReadWriteFile {

	public static void main(String[] args) {
		
//		try(
//				FileOutputStream fos= new FileOutputStream("demo.txt");
//				FileChannel channel = fos.getChannel();
//				){
//				ByteBuffer byteBuffer = ByteBuffer.allocate(100);
//			
//				byteBuffer.put((byte)90);
//				channel.write(byteBuffer);
//				
//		} catch (FileNotFoundException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		} catch (IOException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		}
		
		try(
				FileInputStream fis = new FileInputStream("demo.txt");
				FileChannel channel= fis.getChannel();
			){
			
			ByteBuffer buffer = ByteBuffer.allocate(1024);
			int charVal=channel.read(buffer);
			while(charVal!=-1) {
				// for read/write buffer flip
				buffer.flip(); 
				while(buffer.hasRemaining())
					System.out.print((char)buffer.get());

				buffer.clear();
				
				// reading next chunk of Data for outer for loop
				charVal = channel.read(buffer);
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
