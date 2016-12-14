package Background_Logic.API.Apps.TescoGroceries.BurgerMenu;

import Background_Logic.API.Apps.TescoGroceries.ObjectRepository.OR;
import Background_Logic.Core.UIObjects;
import Background_Logic.Core.UISelector;

public class BurgerMenuUiObjects {

private static UIObjects ShopAllGoceries_option,
						Favourites_option,
						BookASlot_option,
						AmendOrViewOrder_option;


public UIObjects shopAllGroceries(){
	
	if(ShopAllGoceries_option==null) ShopAllGoceries_option=new UISelector().Xpath(OR.BurgerMenuShopAllGroceries_option).makeUiObject();
	return ShopAllGoceries_option;
	
	
}




}
