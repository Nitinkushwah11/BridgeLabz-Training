package com.exceptions.trywithresources;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TrywithResorcesExample {//Auto closing resources
	
	public static void main(String[] args) {
		try(BufferedReader br = new BufferedReader(new FileReader("D:\\Java programming workspace\\java-collection\\gcr-codebase\\JavaCollectionConcepts\\src\\com\\exceptions\\trywithresources\\info.txt")))
		{
			System.out.println(br.readLine());
		}catch(IOException e)
		{
			System.out.println("Error reading file");
		}
	}
	

}
