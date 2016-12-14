package Background_Logic.DriverManager;

import java.io.IOException;
import java.util.Scanner;

public class ServerManager {

private static String Android_Home;


public static String getAndroidHome(){
	
	if(Android_Home==null){
		
		Android_Home=System.getenv("ANDROID_HOME");
	if(Android_Home==null) throw new RuntimeException("please set the env varaiable right.....");
	}
	
	return Android_Home;
	
}


public static String runCommand(String command){
	
	String output=null;
	try{
		Scanner scanner=new Scanner(Runtime.getRuntime().exec(command).getInputStream()).useDelimiter("\\A");
		if(scanner.hasNext()) output=scanner.next();
		
	}
	catch(IOException e){
}
	return output;
}



}
