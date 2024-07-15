package com.gvacharya.stringcharactercounter;

public class StringCharacterCounter {

		private String name;
		
		public StringCharacterCounter() {
			
		}
		
		public StringCharacterCounter(String name) {
			this.name = name;
		}
		
		public void vowelCounter() {
			int i;
			int counterA = 1;
			int counterE = 1;
			int counterI = 1;
			int counterO = 1;
			int counterU = 1;
			int counterConsonants = 1;
			char[] nameArray = name.toCharArray();
			
			for(i=0;i<nameArray.length;i++) {
			
				switch(nameArray[i]) {
					
				case 'A':
					System.out.println("A:" + counterA++);
				
				break;
				
				case 'E':
					System.out.println("E:" + counterE++);
				break;
				
				case 'I':
					System.out.println("I:" + counterI++);
				break;
				
				case 'O':
					System.out.println("O:" + counterO++);
				break;
				
				case 'U':
					System.out.println("U:" + counterU++);
				break;
				
				default:
					System.out.println("Consonants: " + counterConsonants++);
				}
				
//				System.out.println(nameArray[i]);
//				System.out.println("A:"+ counterA);
//				System.out.println("A:"+ counterE);
			}
		}
}
 