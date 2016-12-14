package Background_Logic.API.Apps.TescoGroceries.LaunchScreen;


import org.openqa.selenium.NoSuchElementException;

import Background_Logic.API.Android.Android;
import Background_Logic.API.Apps.TescoGroceries.RegisterStep1.RegisterStep1;
import Background_Logic.API.Apps.TescoGroceries.Signin.Signin;
import Background_Logic.API.Interface.Activity;
import Background_Logic.Core.MyLogger;

public class LaunchScreen implements Activity{

public LaunchScreenUiobjects uiobjects=new LaunchScreenUiobjects();

public LaunchScreen tapBurgerMenu(){
	
try{
		/*MyLogger.log.debug("Tapping on the sign in button on the launch screen");
		uiobjects.burgerMenu_button().click();
		Android.app.groceries.signin.uiobject.emailAddressTextFeild().waitToAppear(120);*/
		return Android.app.groceries.launchscreen;

}	
	catch (NoSuchElementException e){
		
		throw new AssertionError();
		
	}

catch(AssertionError e){
	
	throw new AssertionError("Email address text feild failed to appear within 120 seconds");
	
}
	
	
}


public Signin tapSigninButton(){
	
	try{
		
		
		MyLogger.log.debug("Tapping on the Sign in button on the launch screen Activity");
		uiobjects.Signin_button().click();
		//Android.app.groceries.signin.uiobject.emailAddressTextFeild().waitToAppear(120);
		return Android.app.groceries.signin;
		
	}
	catch(NoSuchElementException e){
		
		//e.printStackTrace();
		throw new AssertionError("Element either blocked or absent");
		
	}
	
	/*catch(AssertionError e){
		
		throw new AssertionError("Email Address text feild failed to appear wihin 120 seconds");
		
	}*/
	
	
}

public RegisterStep1 tapRegisterButton(){
	
	try{
		
		MyLogger.log.debug("Tapping on the register button");
		uiobjects.Register_button().click();
		Android.app.groceries.registerstep1.uiobject.confirmEmailTextFeild().waitToAppear(120);
		return Android.app.groceries.registerstep1;
		
	}catch(NoSuchElementException e){
		
		throw new AssertionError("Element either absent or blocked");
	}
	
	catch(AssertionError e ){
		
		throw new AssertionError("Confirm mail text feild failed to appear after waiting for 120 seconds");
		
	}
	
	
}


@Override
public LaunchScreen waitToLoad() {
	try{
		
		MyLogger.log.debug("Waiting for the Launch Screen Activity to appear");
		uiobjects.Signin_button().waitToAppear(120);
		return Android.app.groceries.launchscreen;
	}catch(AssertionError e){
		throw new AssertionError("");
	}
	
}





}
