package Background_Logic.API.Apps.TescoGroceries.RegisterStep1;

import Background_Logic.Core.UIObjects;
import Background_Logic.Core.UISelector;

public class RegisterStep1Uiobjects {

private static UIObjects emailAddress_textfeild,
				confirmEmail_textfeild,
				postcode_textfeild,
				clubcardnumber_textfeild,
				next_button;


public UIObjects emailAddressTextFeild(){
	
	if(emailAddress_textfeild==null) emailAddress_textfeild=new UISelector().Xpath("").makeUiObject();
	
	return emailAddress_textfeild;
	
}


public UIObjects postcodeTextFeild(){
	
	if(postcode_textfeild==null) postcode_textfeild=new UISelector().Xpath("").makeUiObject();
	
	return emailAddress_textfeild;
	
}

public UIObjects clubCardTextFeild(){
	
	if(clubcardnumber_textfeild==null) clubcardnumber_textfeild=new UISelector().Xpath("").makeUiObject();
	
	return clubcardnumber_textfeild;
	
}

public UIObjects confirmEmailTextFeild(){
	
	if(confirmEmail_textfeild==null) confirmEmail_textfeild=new UISelector().Xpath("").makeUiObject();
	
	return emailAddress_textfeild;
	
}

public UIObjects nextButton(){
	
	if(next_button==null) next_button=new UISelector().Xpath("").makeUiObject();
	
	return next_button;
	
}







}
