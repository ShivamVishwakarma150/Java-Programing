/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lec45;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author samsung1
 */
public class FileExample4a {
    public static void main(String args[]) 
{
    FileWriter fw=null;
    try
    {
    	fw=new FileWriter("D:/person.txt");
    	Scanner kb=new Scanner(System.in);
        
    	for(int i=0;i<2;i++)
    	{
    		System.out.println("Enter name and phone");
    		String name=kb.next();
    		
    		fw.write(name+" ");
            long phone=kb.nextLong();
            fw.write(String.valueOf(phone));

			fw.write("\n");
    	}
    	
    	
    
    }
    
catch(IOException ex)
    {
    	System.err.println("Error while writing file");
    }
    finally
    {
    	if(fw!=null)
    	{
    		
    		try
    		{
    			fw.close();
    			System.out.println("File saved successfully!");
    		}
    		catch(Exception ex)
    		{
    			System.out.println("Error while closing file");
    		}	
    	}
    }
}
}
