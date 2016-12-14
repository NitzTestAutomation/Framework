package Test;

import java.net.MalformedURLException;

import org.apache.log4j.Level;
import org.junit.runner.JUnitCore;

import Tests.TestPrimer;

import Background_Logic.Core.MyLogger;
import Background_Logic.DriverManager.DriverManager;

public class TestRunner {


public static void main(String args[]) throws MalformedURLException{
	
	
	MyLogger.log.setLevel(Level.DEBUG);
	
	try{
		System.out.println("Made some changes...");	
		DriverManager.createDriver();
			JUnitCore.runClasses(TestPrimer.class);
			
		
	}finally{
		
			DriverManager.killDiver();
	}
	
	
	
}






}
