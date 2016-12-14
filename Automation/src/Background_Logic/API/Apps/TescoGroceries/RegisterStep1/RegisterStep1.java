package Background_Logic.API.Apps.TescoGroceries.RegisterStep1;

import org.openqa.selenium.NoSuchElementException;

import Background_Logic.API.Android.Android;
import Background_Logic.API.Interface.Activity;
import Background_Logic.Core.MyLogger;

public class RegisterStep1 implements Activity{


public RegisterStep1Uiobjects uiobject=new RegisterStep1Uiobjects();


public void sendTextToEmailTextFeild(){
	
	
	try{
		
		MyLogger.log.debug("Sending text to the email address text feild...");
		uiobject.emailAddressTextFeild().sendText("");	
	
	}catch(NoSuchElementException e){
		
		throw new AssertionError("Element absent or blocked");
		
	}
	
	 
}

public void sendTextToConfirmTextFeild(){
	
	
	try{
		
		MyLogger.log.debug("Sending text to the confirm email address text feild...");
		uiobject.confirmEmailTextFeild().sendText("");	
	
	}catch(NoSuchElementException e){
		
		throw new AssertionError("Element absent or blocked");
		
	}
	
	 
}


public void sendTextToPostcodeTextFeild(){
	
	
	try{
		
		MyLogger.log.debug("Sending text to the confirm email address text feild...");
		uiobject.postcodeTextFeild().sendText("");	
	
	}catch(NoSuchElementException e){
		
		throw new AssertionError("Element absent or blocked");
		
	}
	
	 
}

public void tapNextButton(){
	
	
	try{
		
		MyLogger.log.debug("Clicking on the next button...");
		uiobject.nextButton().click();	
	
	}catch(NoSuchElementException e){
		
		throw new AssertionError("Element absent or blocked");
		
	}
	
	 
}

@Override
public RegisterStep1 waitToLoad() {
	try{
		
		MyLogger.log.debug("Waiting for the Register Step1 Activiy to load....");
		Android.app.groceries.registerstep1.uiobject.emailAddressTextFeild().waitToAppear(120);
		
		return this;
		
	}catch(AssertionError e){
		
		throw new AssertionError("Register Step1 Activity failed to appear within 120 seconds");
	}
	
}

}
