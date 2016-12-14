package Test;

import java.net.MalformedURLException;
import java.net.URL;

import io.appium.java_client.android.AndroidDriver;

import org.apache.log4j.Level;
import org.openqa.selenium.remote.DesiredCapabilities;

import Background_Logic.API.Android.Android;
import Background_Logic.Core.MyLogger;
import Background_Logic.Core.UIObjects;
import Background_Logic.Core.UISelector;
import Background_Logic.DriverManager.DriverManager;

public class Runner {

public static void main(String args[]) throws MalformedURLException{
	
	
	/*Android.app.groceries.open();
	Android.app.groceries.launchscreen.waitToLoad();
	
	Android.app.groceries.launchscreen.uiobjects.burgerMenu_button().waitToAppear(120).click();*/
	MyLogger.log.setLevel(Level.DEBUG);
	DriverManager.createDriver();
	//Android.app.groceries.launchscreen.tapSigninButton();
	
	Android.app.groceries.launchscreen.uiobjects.Signin_button().waitToAppear(5);
	System.out.println("Pass");
	/*Android.app.groceries.signin.waitToLoad().sendTextToEmailTextFeild();
	Android.app.groceries.signin.sendTextToPasswordTextFeild();
	Android.app.groceries.signin.tapSignInButton();
	Android.app.groceries.homepage.waitToLoad();
	Android.app.groceries.homepage.tapBurgerMenu();
	Android.app.groceries.burgermenu.waitToLoad();
	Android.app.groceries.burgermenu.tapShopAllGroceriesOption();
	Android.app.groceries.groceriescategory.waitToLoad();
	Android.app.groceries.groceriescategory.tapFreshFoodOption();
	//Android.app.groceries.groceriescategory.uiobjects.freshFoodOption().waitToAppear(15);
	Android.app.groceries.freshfoodcategory.tapFreshFruitOption();
	//Android.app.groceries.freshfoodcategory.uiobjects.AllFreshFruitOption().waitToAppear(10);
	//Android.app.groceries.freshfoodcategory.uiobjects.AllFreshFruitOption().waitToAppear(10);
	Android.app.groceries.freshfoodcategory.tapAllFreshFruitOption();
	Android.app.groceries.plp.waitToLoad();
	Android.app.groceries.plp.addProductFromPLPPage();*/
	
	
	
	//Android.app.groceries.homepage.sendTextToSearchField();
	//Android.app.groceries.homepage.tapSearchIcon();
	
	/*Android.app.groceries.launchscreen.waitToLoad().tapRegisterButton();
	Android.app.groceries.registerstep1.waitToLoad();
	Android.app.groceries.registerstep1.sendTextToEmailTextFeild();
	Android.app.groceries.registerstep1.sendTextToConfirmTextFeild();
	Android.app.groceries.registerstep1.sendTextToPostcodeTextFeild();
	Android.app.groceries.registerstep1.tapNextButton();
	Android.app.groceries.registerstep2.waitToLoad();
	Android.app.groceries.registerstep2.tapSelectDropDown().tapoptionFromDropDown();
	Android.app.groceries.registerstep2.sendTextToFirstNameTextFeild();
	Android.app.groceries.registerstep2.sendTexttoInitialsTextFeild();
	Android.app.groceries.registerstep2.sendTexttoLastNameTextFeild();
	Android.app.groceries.registerstep2.uiobject.selectHomeDropdown().click().swipeBottomToTop(0.80, 0.20);*/
	//UIObjects signinbutton= new UISelector().Xpath("//div[@class='lAction']/a[contains(text(),'Sign in')]").makeUiObject().waitToAppear(180).click();
	
	
	
}




}
