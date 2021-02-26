package mavenerror;

import org.testng.annotations.Test;

import com.page.facebook.FacebookLoginPage;

import FacebookBaseTest.BasePage;

public class FaceBookLogin extends BasePage {
	
	@Test
	public void login() {
		   FacebookLoginPage page = new FacebookLoginPage(driver);
				page.loginMethod();
				page.loginPage();
				
	}
	}


