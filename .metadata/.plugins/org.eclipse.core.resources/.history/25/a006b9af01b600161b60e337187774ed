package Background_Logic.DriverManager;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import Background_Logic.Core.ADB;
import Background_Logic.API.Android.Android;

public class DriverManager {


private static String intsalledpackage="io.appium.unlock";
private static HashMap<String, URL> map;

public static DesiredCapabilities capabilities(String deviceId){
	
	DesiredCapabilities cap=new DesiredCapabilities();
	cap.setCapability("deviceName", "samsung");
	cap.setCapability("udid", deviceId);
	cap.setCapability("platformName", "android");
	cap.setBrowserName("chrome");
	
	return cap;
	
}
	
	
public static URL createURL(String deviceid) throws MalformedURLException{
	
	int port=4723;
	if(map==null) {
		
		
		map=new HashMap<String, URL>();
		map.put(deviceid, new URL("http://127.0.0.1:"+port+"/wd/hub"));
		
	}
	return map.get(deviceid);
}
	
	

public static ArrayList getAvailableDevices(){
	
	ArrayList<String> availabledevices=new ArrayList<String>();
	ArrayList<String> connectedDevices=new ArrayList<String>();
	connectedDevices=ADB.getConnectedDevice();
	System.out.println("Driver manager connected devices "+ connectedDevices);

	for(String line:connectedDevices){
		
		ArrayList apps=new ADB(line).getPackages();
	if(!apps.contains(intsalledpackage)) availabledevices.add(line);
	
	}
	
	if(availabledevices.size()==0) throw new RuntimeException("No devices are under test");
	
	System.out.println("Available devices "+availabledevices);
	return availabledevices;
}


public static void createDriver() throws MalformedURLException{
	
	
	ArrayList<String> availabledevices=new ArrayList<String>();
	availabledevices=getAvailableDevices();
	for(String line:availabledevices){
		
		Android.driver=new AndroidDriver(createURL(line), capabilities(line));
		Android.driver.get("http://www.google.com");
		Android.adb=new ADB(line);
	}
	
	
}

public static void killDiver(){
	
	if(Android.driver!=null){
		
		Android.driver.quit();
		Android.adb.unistallPackage(intsalledpackage);
		
		
	}
	
	
}








}
