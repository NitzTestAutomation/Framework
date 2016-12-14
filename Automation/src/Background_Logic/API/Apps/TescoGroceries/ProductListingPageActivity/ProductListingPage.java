package Background_Logic.API.Apps.TescoGroceries.ProductListingPageActivity;

import org.openqa.selenium.NoSuchElementException;

import Background_Logic.API.Android.Android;
import Background_Logic.API.Interface.Activity;
import Background_Logic.Core.MyLogger;
import Background_Logic.Core.UIObjects;
import Background_Logic.Core.UISelector;

public class ProductListingPage implements Activity{
	
	
	public ProductListingPageUiObjects uiobjects=new ProductListingPageUiObjects();
	public String output;
	
	public ProductListingPage tapAddButton(){
		
		try{
			
			MyLogger.log.debug("Clicking on the Add button on the Product Listing Page..");
			uiobjects.addButton().staleClick();
			return this;
			
		}catch(NoSuchElementException e){
			 
			throw new AssertionError("Element Absent or Blocked..");
			
		}
		
		
	}
	
	
public void addProductFromPLPPage(){
		
		try{
			
			if(uiobjects.addButton().exists()) uiobjects.addButton().click();
			else {
				
				//swipe and then find add and click...
				
			}
			 //return output;
			
		}catch(NoSuchElementException e){
			 
			throw new AssertionError("Element Absent or Blocked..");
			
		}
		
		
	}


@Override
public ProductListingPage waitToLoad() {
	
	try{
 		MyLogger.log.debug("Waiting for the Product Listing Page activity to load");
 		Android.app.groceries.plp.uiobjects.productInfo();
 		return this;
		
	}catch(AssertionError e){
		
		
		throw new AssertionError("PLP activity failed to load");
	}
	
	
}



}
