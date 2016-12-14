package Background_Logic.API.Apps.TescoGroceries.GroceriesCategory;

import Background_Logic.API.Android.Android;
import Background_Logic.API.Apps.TescoGroceries.ObjectRepository.OR;
import Background_Logic.Core.UIObjects;
import Background_Logic.Core.UISelector;

public class GroceriesCategoryUiObjects {

private static UIObjects FreshFood_option,
						Bakery_option;

public UIObjects freshFoodOption(){
	
	
	if(FreshFood_option==null) FreshFood_option=new UISelector().Xpath(OR.GroceriesCategoryFreshFood_Option).makeUiObject();
	return FreshFood_option;
	
}

public UIObjects bakeryOption(){
	
	
	if(Bakery_option==null) Bakery_option=new UISelector().Xpath("").makeUiObject();
	return Bakery_option;
	
}




}
