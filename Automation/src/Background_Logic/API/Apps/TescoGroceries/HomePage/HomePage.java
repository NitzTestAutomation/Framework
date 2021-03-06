package Background_Logic.API.Apps.TescoGroceries.HomePage;

import org.openqa.selenium.NoSuchElementException;

import Background_Logic.API.Android.Android;
import Background_Logic.API.Interface.Activity;
import Background_Logic.Core.MyLogger;

public class HomePage implements Activity{


public HomePageUiObjects uiobjects=new HomePageUiObjects();

public HomePage tapBurgerMenu(){
	
		MyLogger.log.debug("Clicking on the Burger Menu Button");
		uiobjects.burgerMenuButton().staleClick();
		return Android.app.groceries.homepage;
	
} 

public void sendTextToSearchField(){
	
	
	try{
		
		MyLogger.log.debug("Clicking on the Search Text Field");
		uiobjects.searchTextFeild().click();
		
	}catch(NoSuchElementException e){
		
		throw new AssertionError("Element Absent or blocked");
	}
	
	
}


public void tapSearchIcon(){
	
	
	try{
		
		MyLogger.log.debug("Clicking on the Search Icon");
		uiobjects.searchIcon().click();
		
	}catch(NoSuchElementException e){
		
		throw new AssertionError("Element Absent or blocked");
	}
	
	
}

public void removeOverLay(){
	
	
	boolean isThere=uiobjects.removeOverlay().exists();
	if(isThere) uiobjects.removeOverlay().click();
	
}

@Override
public HomePage waitToLoad() {

	try{
		
		MyLogger.log.debug("Waiting for the HomePage Activity to load");
		Android.app.groceries.homepage.uiobjects.burgerMenuButton().waitToAppear(120);
		MyLogger.log.debug("Home page activity found.");
		return this;
	}
	catch(AssertionError e){
		
		throw new AssertionError("Home Page Activity failed to launch after 120 seconds of wait.");
	}

}


}
