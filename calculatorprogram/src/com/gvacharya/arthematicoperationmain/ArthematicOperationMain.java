package com.gvacharya.arthematicoperationmain;
import com.gvacharya.arthematicoperation.ArthematicOperation;
import java.util.Scanner;

public class ArthematicOperationMain {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		ArthematicOperation perform = new ArthematicOperation(2,3);
		
		int choice;
		int A;
		int B;
		do {
			
			System.out.println("Menu: Select anyone option from below - ");
			System.out.println("1. Addition");
			System.out.println("2. Substraction");
			System.out.println("3. Multiplication");
			System.out.println("4. Modulus");
			System.out.println("5. Division");
			System.out.println("6. Change value of A");
			System.out.println("7. Change value of B");
			System.out.println("8. Calculate exp value of A");
			System.out.println("9. Calculate exp value of B");
			System.out.println("Enter 0 to exit.");
			choice = scanner.nextInt();
			
			switch(choice) {
			
			case 1:
				System.out.println("Addition of "+perform.getIntA()+ " and " +perform.getIntB()+ " is "+perform.addition());
				System.out.println();
				break;
			
			case 2:
				System.out.println("Substraction of "+perform.getIntA()+ " and " +perform.getIntB()+ " is "+perform.substraction());
				System.out.println();
				break;
			
			case 3:
				System.out.println("Multiplication of "+perform.getIntA()+ " and " +perform.getIntB()+ " is "+perform.multiplication());
				System.out.println();
				break;
			
			case 4:
				System.out.println("Modulus of "+perform.getIntA()+ " and " +perform.getIntB()+ " is "+perform.modulus());
				System.out.println();
				break;
			
			case 5:
				System.out.println("Division of "+perform.getIntA()+ " and " +perform.getIntB()+ " is "+perform.division());
				System.out.println();
				break;
			
			case 6:
				System.out.println("Enter the value of A : ");
				A = scanner.nextInt();
				perform.setIntA(A);
				System.out.println("Changed value of A is "+perform.getIntA());
				System.out.println();
				break;
				
			case 7:
				System.out.println("Enter the value of B : ");
				B = scanner.nextInt();
				perform.setIntA(B);
				System.out.println("Changed value of B is "+perform.getIntB());
				break;
				
			case 8:
				System.out.println("Value of "+perform.getIntA()+" is "+perform.powerOfA());
				System.out.println();
				break;
				
			case 9:
				System.out.println("Value of "+perform.getIntB()+" is "+perform.powerOfB());
				System.out.println();
				break;
			
			default: System.out.println("Invalid input!");
			}
			
			
			
		}while(choice != 0);
		scanner.close();
		
	}
	
	
}
