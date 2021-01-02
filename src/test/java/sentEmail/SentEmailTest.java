package sentEmail;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTests;
import pages.EmailSentPage;
import pages.ForgotPasswordPage;

public class SentEmailTest extends BaseTests {

	@Test
	public void testSentEmail() {
		ForgotPasswordPage forgetPasswordPage = homePage.clickForgotPassword();
		forgetPasswordPage.enterEmail("abdessalem.guesmi@gmail.com");
		EmailSentPage sentEmail = forgetPasswordPage.clickRetrievePassword();
		String message = sentEmail.getMessage();
		Assert.assertEquals(message, "Your e-mail's been sent!", "message is incorrect");
	}
}
