package Background_Logic.API.Apps.TescoGroceries.GroceriesCategory;

import java.util.NoSuchElementException;

import Background_Logic.API.Android.Android;
import Background_Logic.API.Interface.Activity;
import Background_Logic.Core.MyLogger;

public class GroceriesCategory implements Activity{


public GroceriesCategoryUiObjects uiobjects=new GroceriesCategoryUiObjects();

public void tapFreshFoodOption(){
	
	try{
		
			MyLogger.log.debug("Clicking on the Fresh Food Option...");
			uiobjects.freshFoodOption().click();
		
	}catch(NoSuchElementException e){
		
		throw new AssertionError("Element Absent or blocked");
	}
	
	
	
}

public void tapBakeryOption(){
	
	try{
		
			MyLogger.log.debug("Clicking on the Bakery Option...");
			uiobjects.bakeryOption().click();
		
	}catch(NoSuchElementException e){
		
		throw new AssertionError("Element Absent or blocked");
	}
	
	
	
}

@Override
public GroceriesCategory waitToLoad() {
	try{
		
		MyLogger.log.debug("Waiting for the Groceries Category options to load....");
		Android.app.groceries.groceriescategory.uiobjects.freshFoodOption().waitToAppear(120);
		return Android.app.groceries.groceriescategory;
		
	}catch(NoSuchElementException e){
		
		throw new AssertionError("Element Absent or blocked...");
	}
	catch(AssertionError e){
		
		throw new AssertionError("Groceries Category failed to loaded within 120 seconds");
		
	}
}






}
