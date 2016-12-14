package Background_Logic.API.Apps.TescoGroceries.FreshFoodCategory;

import Background_Logic.API.Apps.TescoGroceries.ObjectRepository.OR;
import Background_Logic.Core.UIObjects;
import Background_Logic.Core.UISelector;

public class FreshFoodCategoryUiObjects {

private static UIObjects FreshFruit_Option,
						FreshVegetables_Option,
						AllFreshFruit_Option;


public UIObjects freshFruitsOption(){
	
	
	if(FreshFruit_Option==null) FreshFruit_Option=new UISelector().Xpath(OR.FreshFoodCategory_Option).makeUiObject();
	return FreshFruit_Option;
	
	
}



public UIObjects AllFreshFruitOption(){
	
	
	if(AllFreshFruit_Option==null) AllFreshFruit_Option=new UISelector().Xpath(OR.FreshFoodAllFreshFruit_Option).makeUiObject();
	return AllFreshFruit_Option;
	
	
}


}
