package edu.jones.fileinput;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			String filename = "employeeSales.dat";
			Scanner infile = new Scanner(new FileInputStream(filename));
			
		}
		catch(IOException ex)
		{
			ex.printStackTrace();
			
		}
	}

}
