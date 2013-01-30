package input;

import java.io.File;

public class GetAllFiles {
	
	private static String[] files = new String[100];
	private static int help = 0; //spätere Indexvariable für setElement
	
	public static void listDir(File directory) {

		 File[] xfiles =  directory.listFiles();
		 
		if (xfiles != null) {// Prüft auf berechtigung
			for (int i = 0; i < xfiles.length; i++) {
				//System.out.print(xfiles[i].getAbsolutePath() + "\n");
				GetAllFiles.setElement(xfiles[i].getAbsolutePath(),GetAllFiles.help ); // Schreibt alle Verzeichnisse in files array
				GetAllFiles.help++;
				if (xfiles[i].isDirectory()) {
					
					//System.out.print(" (Ordner)\n");
					listDir(xfiles[i]); // ruft sich selbst mit dem 
						// Unterverzeichnis als Parameter auf
					}
				
				
			}
		}
	}
	
	
	public static int getHelp() {
		return help;
	}


	public static void setHelp(int hilf) {
		GetAllFiles.help = hilf;
	}


	public static String[] getFiles()
	  {
	  return files;
	  }


	public static void setFiles(String[] files) {
		GetAllFiles.files = files;
	}

	public static void setElement(String value, int location)
	  {
	  files[location] = value;
	  
	  }
}
