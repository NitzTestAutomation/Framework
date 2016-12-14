package Tests;

import org.junit.*;

import Background_Logic.API.Android.Android;
import Background_Logic.API.Apps.TescoGroceries.TescoGroceries;
import Background_Logic.DriverManager.DriverManager;
import Background_Logic.DriverManager.TestManager;

public class Sanity extends TestManager{

private static TescoGroceries groceries=Android.app.groceries;


@BeforeClass
public static void beforeClass(){
	
	
	
}

@Before
public void before(){
	
	testinfo.suite("Sanity");
	
}

@Test
public void Test1(){
	
	testinfo.id("Test1").name("Verify Sigin");
	Assert.assertTrue(groceries.launchscreen.uiobjects.Signin_button().exists());
	groceries.launchscreen.tapSigninButton();
	groceries.signin.waitToLoad().sendTextToEmailTextFeild();
	groceries.signin.sendTextToPasswordTextFeild();
	groceries.signin.tapSignInButton();
	Assert.assertTrue(groceries.homepage.uiobjects.burgerMenuButton().exists());	
	
}

}
