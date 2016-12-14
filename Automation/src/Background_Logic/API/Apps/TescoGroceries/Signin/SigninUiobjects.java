package Background_Logic.API.Apps.TescoGroceries.Signin;

import Background_Logic.API.Apps.TescoGroceries.ObjectRepository.OR;
import Background_Logic.Core.UIObjects;
import Background_Logic.Core.UISelector;

public class SigninUiobjects {

private static UIObjects emailaddress_textfeild,
						password_textfeild,
						signin_button;


public UIObjects emailAddressTextFeild(){
	
	if(emailaddress_textfeild==null) emailaddress_textfeild=new UISelector().Xpath(OR.SiginEmailAddress_TextFeild).makeUiObject();
	
	return emailaddress_textfeild;
	
	
}

public UIObjects password_textfeild(){
	
	if(password_textfeild==null) password_textfeild=new UISelector().Xpath(OR.SigninPassword_TextFeild).makeUiObject();
	
	return password_textfeild;
	
	
}

public UIObjects signin_button(){
	
	if(signin_button==null) signin_button=new UISelector().Xpath(OR.SigninSignin_Button).makeUiObject();
	
	return signin_button;
	
	
}






}
