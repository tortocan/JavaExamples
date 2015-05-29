package jPKG;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileRW {
	private String pathString;


	public String getPathString() {
		return pathString;
	}


	public void setPathString(String pathString) {
		this.pathString = pathString;
	}

	public FileRW(String pathString) throws FileNotFoundException, IOException
	{
		
		this.pathString = pathString;	 
	}
	
	public void arrToFile(String [] arrf , String fileName,String outPutType) throws IOException {
		// Create a BufferedWriter around a FileWriter.
		// ... Write to an output text file.
		BufferedWriter writer = new BufferedWriter(new FileWriter(fileName + "." + outPutType));
		boolean FileCreated = false;
		for (String line : arrf)
		{
			FileCreated = true;
			writer.write(line);
			writer.newLine();
		}
		writer.close();
		if (FileCreated) {
			System.out.println("The file "+ fileName +  " was exported in an ."
					+ outPutType + " type.");
		}
		
	}
	public String [] fileToArray() throws FileNotFoundException, IOException
	{
		try(BufferedReader br = new BufferedReader(new FileReader(this.pathString))) {
	        String line = br.readLine();
	        StringBuilder sb = new StringBuilder();

	        while (line != null) {
	            sb.append(line);
	            sb.append(System.lineSeparator());
	            line = br.readLine();
	        }
	        String [] fArray = sb.toString().split(System.lineSeparator());
	        br.close();
	        return fArray;
	    }  
	}

}
