package Background_Logic.Core;

import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Background_Logic.API.Android.Android;

public class UIObjects {

private String locator;
private Dimension size;
int startx,starty,endx,endy;

public UIObjects(String locator){
	
	this.locator=locator;
	MyLogger.log.debug("Created UI object for "+this.locator);

}


public boolean isXpath(){
	
	return !locator.contains("new UiSelector()");
	
}

public boolean exists(){
	
	WebElement element;
	if(isXpath()) element=Android.driver.findElementByXPath(locator);
	else element=Android.driver.findElementByAndroidUIAutomator(locator);
	return element.isDisplayed();
}

public UIObjects click(){
	
	if(isXpath()) Android.driver.findElementByXPath(locator).click();
	else Android.driver.findElementByAndroidUIAutomator(locator).click();
	return this;
	
}

public void staleClick(){
	
	if(isXpath()){
		
		
		int attempt=0;
		//boolean result=false;
		while(attempt<3){
			
			try{
				
				Android.driver.findElementByXPath(locator).click();
				//result=true;
				break;
				
			
			}catch(StaleElementReferenceException e){
				
				e.toString();
				System.out.println("trying to recover"+ e.getMessage());
				
			}
			catch(NoSuchElementException e){
				
				throw new AssertionError("Element "+locator+ "is either absent or blocked..");
				
			}
		
			attempt++;
		}
		
		
		
	}
	
	
	
}

public UIObjects waitUntilVisible(){
	
	
	
	int ok_size=Android.driver.findElements(By.xpath(locator)).size();
	 ((WebElement) Android.driver.findElements(By.xpath(locator))).click();
	 return this;
}

public UIObjects sendText(String value){
	
	if(isXpath()) Android.driver.findElementByXPath(locator).sendKeys(value);
	else Android.driver.findElementByAndroidUIAutomator(value).sendKeys(value);
	return this;
	
}

public UIObjects typeText(String value){
	WebElement element;
	if(isXpath()){ element=Android.driver.findElementByXPath(locator);
	Actions actions=new Actions(Android.driver);
	actions.moveToElement(element);
	actions.click();
	actions.sendKeys(value);
	actions.build().perform();
	}
	
	return this;
	
}

public String getText(){
	
	WebElement element;
	if(isXpath()) element=Android.driver.findElementByXPath(locator);
	else element=Android.driver.findElementByAndroidUIAutomator(locator);
	
	return element.getAttribute("name");
	
}


public void swipeTopToBottom(double offsetstarty, double offsetendy){
	
	
	size=Android.driver.manage().window().getSize();
	MyLogger.log.debug("The size of the screen is :"+size);
	startx=(int)(size.width)/2;
	starty=(int)(size.height*offsetstarty);
	endy=(int)(size.height*offsetendy);
	Android.driver.swipe(startx, endy, startx, starty, 3000);
	


}

public void swipeBottomToTop(double offsetstarty, double offsetendy){
	
	
	size=Android.driver.manage().window().getSize();
	MyLogger.log.debug("The size of the screen is :"+size);
	startx=(int)(size.width)/2;
	starty=(int)(size.height*offsetstarty);
	endy=(int)(size.height*offsetendy);
	Android.driver.swipe(startx, starty, startx, endy, 3000);
	


}

/*public void getCount(){
	
	List<WebElement> element;
	if(isXpath()) element=Android.driver.findElementByXPath(locator);
	else element=Android.driver.findElementByAndroidUIAutomator(locator);
	
	
	
	
}*/



public UIObjects waitToAppear(int time){
	
	Timer timer=new Timer();
	timer.startTime();
	
	try{
		while(!timer.timeExpired(time)) if(exists()) break;
	
	if(timer.timeExpired(time)&&exists()) throw new AssertionError("Element "+locator+" could not be found after waiting for "+time+" seconds");
		
	return this;		
	}catch(NoSuchElementException e){
		
		throw new AssertionError("Element could not be found please check you are online or the element is blocked or absent..");
	}
}

public UIObjects waitToDisappear(int time){
	
	Timer timer=new Timer();
	timer.startTime();
	
	while(!timer.timeExpired(time)) if(!exists()) break;
	
	if(timer.timeExpired(time)&&exists()) throw new AssertionError("Element "+locator+" does not disappear after waiting for "+time+" seconds");
		
	return this;		
	
}



}
