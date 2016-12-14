package Background_Logic.API.Apps.TescoGroceries;

import Background_Logic.API.Apps.TescoGroceries.BurgerMenu.BurgerMenu;
import Background_Logic.API.Apps.TescoGroceries.FreshFoodCategory.FreshFoodCategory;
import Background_Logic.API.Apps.TescoGroceries.GroceriesCategory.GroceriesCategory;
import Background_Logic.API.Apps.TescoGroceries.HomePage.HomePage;
import Background_Logic.API.Apps.TescoGroceries.LaunchScreen.LaunchScreen;
import Background_Logic.API.Apps.TescoGroceries.ProductListingPageActivity.ProductListingPage;
import Background_Logic.API.Apps.TescoGroceries.RegisterStep1.RegisterStep1;
import Background_Logic.API.Apps.TescoGroceries.RegisterStep2.ResgisterStep2;
import Background_Logic.API.Apps.TescoGroceries.Signin.Signin;
import Background_Logic.API.Interface.Application;

public class TescoGroceries implements Application{

	public LaunchScreen launchscreen=new LaunchScreen();
	public Signin signin=new Signin();
	public RegisterStep1 registerstep1=new RegisterStep1();
	public ResgisterStep2 registerstep2=new ResgisterStep2();
	public HomePage homepage=new HomePage();
	public BurgerMenu burgermenu=new BurgerMenu();
	public GroceriesCategory groceriescategory=new GroceriesCategory();
	public FreshFoodCategory freshfoodcategory=new FreshFoodCategory();
	public ProductListingPage plp=new ProductListingPage();
	
	@Override
	public void forceStop() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void clearData() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Object open() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String packageId() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String activityId() {
		// TODO Auto-generated method stub
		return null;
	}





}
