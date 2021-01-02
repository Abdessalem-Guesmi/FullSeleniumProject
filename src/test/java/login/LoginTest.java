package login;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.BaseTests;
import pages.LoginPage;
import pages.SecureAreaPage;

public class LoginTest extends BaseTests {
	@Test(dataProvider = "dataForLogin")
	public void testSuccessfulLogin(String username, String password) {
		LoginPage loginPage = homePage.clickFormAuthentication();
		loginPage.setUsername(username);
		loginPage.setPassword(password);
		SecureAreaPage secureAreaPage = loginPage.clickLoginButton();
		String text = secureAreaPage.getAlertText();
		Assert.assertTrue(text.contains("You logged into a secure area!"), "text is not correct");
	}

	@DataProvider(name = "dataForLogin")
	public Object dataForLogin() {
		Object[][] data = new Object[2][2];
		data[0][0] = "tomsmith";
		data[0][1] = "SuperSecretPassword!";

		data[1][0] = "kimsmith";
		data[1][1] = "SuperSecretPassword";
		return data;

	}
}
