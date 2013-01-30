package application;
import java.io.File;
import java.io.IOException;
import javax.mail.MessagingException;
import javax.mail.internet.AddressException;
import output.*;
import mail.*;
import input.*;
import regex.*;
 
public class Application {

	/**
	 * @param args
	 * @throws IOException 
	 */
	 public static void main(String[] args) throws AddressException, MessagingException, IOException
	    {
	       
	        
	       // File file = new File ("G:\\Tp\\Logs"); 				//Arbeit File-Objekt mit Pfadangabe
	        File file = new File ("C:\\Tp\\Logs"); 				//ArbeitNOTEBOOK File-Objekt mit Pfadangabe
	        GetAllFiles.listDir(file); 							// Übergabe des Pfads an GetAllFiles.listDir
	        
	        //Test.teste();
	       
	        
	        
	        regex.GetDirectory.regExYesterday(GetAllFiles.getFiles());
	      
	        for (int i= 0; i < GetDirectory.regExYesterday(GetAllFiles.getFiles()).length; i++){
	        	System.out.println(GetDirectory.regExYesterday(GetAllFiles.getFiles())[i]);
	        }
	        
	       // GetDirectory.regExYesterday(GetAllFiles.getFiles())[i]; //
	        
	       // System.out.println(GetDirectory.getDate());
	        
	        //ReadFile.read();
	        //WriteFile.write();
	        
	        
	        
	        //Mail.setRecipient("mschmitz@vds.de");
	        //Mail.setSubject("Youtube");
	        //Mail.setText("Hallo");
	        //Mail.send(MailAccounts.VDS);     
	    }
	}


