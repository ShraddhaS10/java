package com.gvacharya.messagedecoderprogram;

public class MessageDecoder {

	private String message;
	private String alphabets = "abcdef";
	
	public MessageDecoder() {
		
	}
	
	public MessageDecoder(String message) {
		this.message = message;
	}
	
	public void decoder() {
		
		int i;
		int counter1 = 0;
		int counter2 = 0;
		int counter3 = 0;
		char[] alphabetsArray = alphabets.toCharArray();
		char[] messageArray = message.toCharArray();
		
		for(i=0;i<messageArray.length;i++) {
			
			switch (messageArray[i]) {
			
			case '1':
				counter1++;
				break;
				
			case '2':
				counter2++;
				break;
				
			default:
				counter3++;
			}
//		 	System.out.println(messageArray[i]);
			
		}
		
		if(counter1 == 1) {
			System.out.println("a");
		}
		else if(counter2 == 2){
			System.out.println("b");
		}
		else {
			System.out.println("---");
		}
		
		
	}
}
