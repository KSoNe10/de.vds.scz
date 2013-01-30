package output;

import java.io.*;
import input.*;

public class WriteFile {


	  public static void write () throws IOException
	  {
	    FileWriter fw = new FileWriter("C:\\Users\\scz\\Desktop\\LALALA4.log");
	    BufferedWriter bw = new BufferedWriter(fw);

	    int i = 0;
	    
	    
	   
	    while (ReadFile.getElement(i) != null ) {
	    System.out.println(ReadFile.getElement(i));
	    bw.write(ReadFile.getElement(i));
	    bw.newLine();
	    i++;
  
	  }
	    bw.close();
	}
}