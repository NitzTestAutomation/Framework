package Background_Logic.API.Apps.TescoGroceries.RegisterStep2;

import org.openqa.selenium.NoSuchElementException;

import Background_Logic.API.Android.Android;
import Background_Logic.API.Interface.Activity;
import Background_Logic.Core.MyLogger;

public class ResgisterStep2 implements Activity{

public RegisterStep2UiObjects uiobject=new RegisterStep2UiObjects();

public ResgisterStep2 tapSelectDropDown(){
	
	try{
	
		uiobject.selectDropdown().click();
		//return Android.app.groceries.registerstep2;
		return this;
	}
	catch(NoSuchElementException e){
		
		throw new AssertionError("Element absent or blocked...");
		
	}
	
	
}

public ResgisterStep2 tapoptionFromDropDown(){
	
	try{
	
		uiobject.optionsFromDropDown().click();
		//return Android.app.groceries.registerstep2;
		return this;
	}
	catch(NoSuchElementException e){
		
		throw new AssertionError("Element absent or blocked...");
		
	}
	
	
}

public void sendTextToFirstNameTextFeild(){
	
	try{
	
		uiobject.firstNameTextfeild().sendText("");
		//return Android.app.groceries.registerstep2;
		
	}
	catch(NoSuchElementException e){
		
		throw new AssertionError("Element absent or blocked...");
		
	}
	
	
}

public void sendTexttoInitialsTextFeild(){
	
	try{
	
		uiobject.initialTextFeild().sendText("");
		//return Android.app.groceries.registerstep2;
		
	}
	catch(NoSuchElementException e){
		
		throw new AssertionError("Element absent or blocked...");
		
	}
	
	
}


public void sendTexttoLastNameTextFeild(){
	
	try{
	
		uiobject.lastNameTextfeild().sendText("");
		//return Android.app.groceries.registerstep2;
		
	}
	catch(NoSuchElementException e){
		
		throw new AssertionError("Element absent or blocked...");
		
	}
	
}	

public ResgisterStep2 tapSelectHomeDropDown(){
	
	try{
	
		uiobject.selectHomeDropdown().click();
		return this;
		//return Android.app.groceries.registerstep2;
		
	}
	catch(NoSuchElementException e){
		
		throw new AssertionError("Element absent or blocked...");
		
	}
	
}

@Override
public ResgisterStep2 waitToLoad() {
	
	try{
		
		MyLogger.log.debug("Waiting for the Register Step2 activity");
		Android.app.groceries.registerstep2.uiobject.firstNameTextfeild().waitToAppear(120);
		return this;
		
	}catch(AssertionError e){}
	
	throw new AssertionError("The Activity failed to load within 120 seconds");
}




}
