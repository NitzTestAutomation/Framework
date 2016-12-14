package Background_Logic.API.Apps.TescoGroceries.HomePage;

import Background_Logic.API.Apps.TescoGroceries.ObjectRepository.OR;
import Background_Logic.Core.UIObjects;
import Background_Logic.Core.UISelector;

public class HomePageUiObjects {

private static UIObjects burgerMenu_Button,
						favourites_icon,
						amendOrders_icon,
						bookASlot_icon,
						shopAllGroceries_Button,
						search_TextFeild,
						removeOverlay_Icon,
						search_icon;
						
						
public UIObjects burgerMenuButton(){
	
	if(burgerMenu_Button==null) burgerMenu_Button=new UISelector().Xpath(OR.HomePageBurerMenu_Button).makeUiObject();
	
	return burgerMenu_Button;
	
}					
						
public UIObjects searchTextFeild(){
	
	if(search_TextFeild==null) search_TextFeild=new UISelector().Xpath(OR.HomePageSearch_TextFeild).makeUiObject();
	
	return burgerMenu_Button;
	
}

public UIObjects searchIcon(){
	
	if(search_icon==null) search_icon=new UISelector().Xpath(OR.HomePage_SearchIcon).makeUiObject();
	
	return burgerMenu_Button;
	
}

public UIObjects removeOverlay(){
	
	if(removeOverlay_Icon==null) removeOverlay_Icon=new UISelector().Xpath(OR.HomePageRemoveOverlay_Icon).makeUiObject();
	
	return removeOverlay_Icon;
	
}

}
