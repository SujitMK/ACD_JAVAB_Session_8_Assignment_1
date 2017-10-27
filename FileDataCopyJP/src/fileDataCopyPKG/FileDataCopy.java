package fileDataCopyPKG;              // created package

// this program copies file data to another file

import java.io.*;                     // importing a java io utility

public class FileDataCopy {                   // declared and defined class

	public static void main(String[] args) {                      // main method
		// TODO Auto-generated method stub
		
		try                                                 // implemented try block
		{
		   FileInputStream inputStream = null;              // declared a variable of type FileInputStream
		   FileOutputStream outputStream = null;            // declared a variable of type FileOutputStream
			
		   File inputFile = new File("S:\\Java.txt");                     // created File object for input file
		   File outputFile = new File("S:\\JavaOutFile.txt");             // created file object for out file
		
		    inputStream = new FileInputStream(inputFile);              // created object of FileInputStream
		    outputStream = new FileOutputStream(outputFile);            //  created object of FileOutputStream
		
		   byte[] buffer = new byte[1024];                    // creating a object of buffer	
		 
		   int length;                                        // declared variable of int type
		 
		   while ((length = inputStream.read(buffer)) > 0)        // implemented block
		   {
 	         outputStream.write(buffer, 0, length);                // copied data from one file to other
 	       }
		   
		   System.out.println("File copied successfully!!");
		   
		   inputStream.close();                            // closing the inputStream
		   outputStream.close();                        // closing the outputStream
		}
		catch(Exception e)                            // implemented catch block
		{
			e.printStackTrace();                        // printing the error path
		}

	}

}
