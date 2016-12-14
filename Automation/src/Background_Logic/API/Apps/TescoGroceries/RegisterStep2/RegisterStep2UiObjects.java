package Background_Logic.API.Apps.TescoGroceries.RegisterStep2;

import Background_Logic.API.Apps.TescoGroceries.ObjectRepository.OR;
import Background_Logic.Core.UIObjects;
import Background_Logic.Core.UISelector;

public class RegisterStep2UiObjects {

private static UIObjects select_dropdown,
						optionsFromDropDown,
						firstName_Textfeild,
						initials_Textfeild,
						lastName_Textfeild,
						selectHome_Dropdown,
						addressNickName_Textfeild,
						dayTimeTelno_Textfeild,
						eveneingTelno_Textfeild,
						mobileTelno_Textfeild,
						enterPassword_Textfeild,
						confirmPassword_Textfeild,
						yesRegisterMe_Button;


public UIObjects selectDropdown(){
	
	if(select_dropdown==null) select_dropdown=new UISelector().Xpath(OR.RegisterStep2Title_DropDown).makeUiObject();
	
	return select_dropdown;
	
}
public UIObjects optionsFromDropDown(){
	
	if(optionsFromDropDown==null) optionsFromDropDown=new UISelector().Xpath("").makeUiObject();
	
	return optionsFromDropDown;
	
}



public UIObjects firstNameTextfeild(){
	
	if(firstName_Textfeild==null) firstName_Textfeild=new UISelector().Xpath("").makeUiObject();
	
	return firstName_Textfeild;
	
}

public UIObjects initialTextFeild(){
	
	if(initials_Textfeild==null) initials_Textfeild=new UISelector().Xpath("").makeUiObject();
	
	return initials_Textfeild;
	
}

public UIObjects lastNameTextfeild(){
	
	if(lastName_Textfeild==null) lastName_Textfeild=new UISelector().Xpath("").makeUiObject();
	
	return lastName_Textfeild;
	
}

public UIObjects selectHomeDropdown(){
	
	if(selectHome_Dropdown==null) selectHome_Dropdown=new UISelector().Xpath("").makeUiObject();
	
	return selectHome_Dropdown;
	
}

public UIObjects addressNickNameTextfeild(){
	
	if(addressNickName_Textfeild==null) addressNickName_Textfeild=new UISelector().Xpath("").makeUiObject();
	
	return addressNickName_Textfeild;
	
}

public UIObjects dayTimeTelnoTextFeild(){
	
	if(dayTimeTelno_Textfeild==null) dayTimeTelno_Textfeild=new UISelector().Xpath("").makeUiObject();
	
	return dayTimeTelno_Textfeild;
	
}

public UIObjects eveningTelNoTextFeild(){
	
	if(eveneingTelno_Textfeild==null) eveneingTelno_Textfeild=new UISelector().Xpath("").makeUiObject();
	
	return eveneingTelno_Textfeild;
	
}

public UIObjects mobileNoTextFeild(){
	
	if(mobileTelno_Textfeild==null) mobileTelno_Textfeild=new UISelector().Xpath("").makeUiObject();
	
	return mobileTelno_Textfeild;
	
}

public UIObjects enterPasswordTextFeild(){
	
	if(enterPassword_Textfeild==null) enterPassword_Textfeild=new UISelector().Xpath("").makeUiObject();
	
	return enterPassword_Textfeild;
	
}

public UIObjects confirmPasswordTextFeild(){
	
	if(confirmPassword_Textfeild==null) confirmPassword_Textfeild=new UISelector().Xpath("").makeUiObject();
	
	return confirmPassword_Textfeild;
	
}

public UIObjects yesRegisterMeButton(){
	
	if(yesRegisterMe_Button==null) yesRegisterMe_Button=new UISelector().Xpath("").makeUiObject();
	
	return yesRegisterMe_Button;
	
}
						








}
