package com.gvacharya.inputoutputpackages.readwritedata;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;

import com.gvacharya.inputoutputpackages.readwritedata.entities.Employee;

public class ReadWriteObjects {

	public static void main(String[] args) {
		
		Employee[] empArray = new Employee[3];
		empArray[0]=new Employee(1,"ABC");
		empArray[1]=new Employee(2,"BBC");
		empArray[2]=new Employee(3,"CBC");
		
		Employee emp1 = new Employee(1,"XYZ");
		try(
				FileOutputStream fis = new FileOutputStream("student.dat");
				ObjectOutputStream oos=new ObjectOutputStream(fis);
			)
		{
			oos.writeObject(empArray);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		try(
				ObjectInputStream ois = 
					new ObjectInputStream(new FileInputStream("student.dat"))
				
			){
			
			Employee[] emp2Array= (Employee[]) ois.readObject();
			System.out.println(Arrays.toString(emp2Array));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
