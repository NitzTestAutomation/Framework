package Background_Logic.API.Apps.TescoGroceries.LaunchScreen;

import Background_Logic.API.Apps.TescoGroceries.ObjectRepository.OR;
import Background_Logic.Core.UIObjects;
import Background_Logic.Core.UISelector;

public class LaunchScreenUiobjects {

private UIObjects burgerMenu_button, 
				Signin_button,
				Register_button,
				Shopallgroceries_button;


public UIObjects burgerMenu_button(){
	
	if(burgerMenu_button==null)
	burgerMenu_button=new UISelector().Xpath("").makeUiObject();
	
	return burgerMenu_button;
	
}

public UIObjects Signin_button(){
	
	if(Signin_button==null)
	Signin_button=new UISelector().Xpath(OR.LaunchScreenSignin_Button).makeUiObject();
	
	return Signin_button;
	
}

public UIObjects Register_button(){
	
	if(Register_button==null)
	Register_button=new UISelector().Xpath("").makeUiObject();
	
	return Register_button;
	
}

public UIObjects Shopallgroceries_button(){
	
	if(Shopallgroceries_button==null)
	Shopallgroceries_button=new UISelector().Xpath("").makeUiObject();
	
	return Shopallgroceries_button;
	
}









}
