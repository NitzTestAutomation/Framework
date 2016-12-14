package Background_Logic.API.Apps.TescoGroceries.BurgerMenu;

import java.util.NoSuchElementException;

import Background_Logic.API.Android.Android;
import Background_Logic.API.Interface.Activity;
import Background_Logic.Core.MyLogger;

public class BurgerMenu implements Activity{

public BurgerMenuUiObjects uiobjects=new BurgerMenuUiObjects();

public BurgerMenu tapShopAllGroceriesOption(){
	
	try{
		
		MyLogger.log.debug("Clicking on the Shop All groceries Option");
		uiobjects.shopAllGroceries().click();
		return Android.app.groceries.burgermenu;
		
	}catch(NoSuchElementException e){
		
		throw new AssertionError("Element Absent or blocked...");
	}
	
	
	
	
}

@Override
public BurgerMenu waitToLoad() {
	try{
		
		MyLogger.log.debug("Waiting for the Burger menu Activit to load");
		Android.app.groceries.burgermenu.uiobjects.shopAllGroceries().waitToAppear(120);
		return this;
	}
	catch(NoSuchElementException e){
		
		throw new AssertionError("Element Absent or blocked");
	}
	
	catch(AssertionError e){
		
		throw new AssertionError("The Activity failed to load wihin 120 seconds..");
	}

}





}
