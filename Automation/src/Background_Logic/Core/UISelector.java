package Background_Logic.Core;

import org.openqa.selenium.WebElement;

import io.appium.java_client.android.AndroidDriver;

public class UISelector {

private String locator="new UiSelector()";

public UISelector text(String value){
	
	locator+=".text(\""+value+"\")";
	return this;
}


public UISelector resourceId(String value){
	
	locator+=".resourceId(\""+value+"\")";
	return this;
	
}


public UISelector Xpath(String value){
	
	locator=value;
	
	return this;
	
}
	
	
	
public UIObjects makeUiObject(){
	
	return new UIObjects(locator);
	
	
}








}
