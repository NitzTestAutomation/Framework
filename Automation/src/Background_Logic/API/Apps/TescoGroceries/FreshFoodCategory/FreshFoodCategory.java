package Background_Logic.API.Apps.TescoGroceries.FreshFoodCategory;

import java.util.NoSuchElementException;

import Background_Logic.API.Android.Android;
import Background_Logic.API.Interface.Activity;
import Background_Logic.Core.MyLogger;

public class FreshFoodCategory implements Activity{

public FreshFoodCategoryUiObjects uiobjects=new FreshFoodCategoryUiObjects();

public void tapFreshFruitOption(){
	
	try{
		MyLogger.log.debug("Clicking on the Fresh Fruit category option..");
		uiobjects.freshFruitsOption().staleClick();	
	}catch(NoSuchElementException e){
		
		throw new AssertionError("Element Absent or Blocked..");
	}
	
	
}

public void tapAllFreshFruitOption(){
	
	try{
		
		MyLogger.log.debug("Clicking on All the Fresh Fruits Options");
		uiobjects.AllFreshFruitOption().waitUntilVisible().staleClick();
		
	}catch(NoSuchElementException e){
		
		throw new AssertionError("Element absent or blocked...");
		
	}
	
	
}

@Override
public FreshFoodCategory waitToLoad() {
	try{
		
		MyLogger.log.debug("Waiting for the Fresh Food category Activity");
		Android.app.groceries.freshfoodcategory.uiobjects.freshFruitsOption().waitToAppear(120);
		return this;
	}catch(NoSuchElementException e){
		
		throw new AssertionError("Element Asbsent or blocked...");
	}
	catch(AssertionError e){
		
		throw new AssertionError("Fresh Food Acivity Failed to load within 120 seconds..");
	}
}


}
