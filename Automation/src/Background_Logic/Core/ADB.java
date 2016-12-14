package Background_Logic.Core;

import java.util.ArrayList;

import Background_Logic.DriverManager.ServerManager;

public class ADB {

private  String deviceId;
public ADB(String deviceId){
	
	this.deviceId=deviceId;
	
}


public static String command(String command){
	
	if(command.startsWith("adb")) command=command.replace("adb", ServerManager.getAndroidHome()+"/platform-tools/adb");
	else throw new RuntimeException("Method is designed to take adb commands only....");
	String output=ServerManager.runCommand(command);
	
	if(output==null) return "";
	else
	return output;
	
}


public static ArrayList getConnectedDevice(){
	
	ArrayList devices=new ArrayList();
	String output=command("adb devices");
	for(String line:output.split("\n")){
		line=line.trim();
		if(line.endsWith("device"))
		devices.add(line.replace("device", "").trim());
			
	}
	System.out.println("Connected devices "+devices);
	return devices;
}


public  ArrayList getPackages(){
	
	ArrayList packages=new ArrayList();
	String[] output=command("adb -s "+ deviceId+" shell pm list packages").split("/n");
	for(String line:output){
		line.trim();
		packages.add(line.replace("package","").trim());
		
	}
	
	
	return packages;
}

public void unistallPackage(String packageid){
	
	command("adb -s "+deviceId+" uninstall "+packageid);
	
}

}
