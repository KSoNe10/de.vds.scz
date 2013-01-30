package regex;

public class Test {

	public static void teste (){
		String test = "G:\\Tp\\Logs\\Plauen\\ASTPP003\\homeshares 27.11.2012.log";
		
		if (test.matches(".*27.11.2012.*") == true)
			System.out.println("yes");
		else
			System.out.println("no");
		
	}
}
