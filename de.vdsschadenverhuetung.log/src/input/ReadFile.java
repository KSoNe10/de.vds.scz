package input;
import java.io.*;



public class ReadFile {
	
	  private static String textArray[] = new String [0]; 
	

	  
  public static void read() throws IOException
  {   
    String [] initialArray = new String [ReadFile.getDocumentLength()]; // erzeugt ein Array welches so Groß ist wie die anzahl an Zeilen
    ReadFile.setTextArray(initialArray); // Überschreibt das array
    String zeile =""; // Vergleichsparameter für BufferedReader 
    int counter =0;
    FileReader fr = new FileReader("G:\\homeshares 21.11.2012.log");
    BufferedReader br = new BufferedReader(fr);
	    while( br.readLine() != null )
	    {
	    	zeile = br.readLine();
	    	setElement(zeile,counter);
	    	counter++;
	    }
    br.close();
    
  }
  
  public static String[] getTextArray()
  {
  return textArray;
  }

  public static void setTextArray(String[] paramZeilen)
  {
  ReadFile.textArray = paramZeilen;
  return;
  }
 
  public static String getElement(int location)
  {
  return textArray[location];
  }

  public static void setElement(String value, int location)
  {
  textArray[location] = value;
  return;
	  
  }
   
  public static int getDocumentLength() throws IOException
  {
	  	FileReader frx = new FileReader("G:\\homeshares 21.11.2012.log");
	    BufferedReader brx = new BufferedReader(frx);
	    int Y =0;
	    while( (brx.readLine()) != null )
	    {
	    	Y++;
	    }
	    brx.close();
	    
	    return Y;	    
  }
  
  
  
  
}



