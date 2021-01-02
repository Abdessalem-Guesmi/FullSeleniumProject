package alert;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import base.BaseTests;
import pages.AlertPage;

public class AlertTest extends BaseTests {

	@Test
	public void testAcceptAlert() {
		AlertPage alertPage = homePage.clickJavaScriptAlerts();
		alertPage.triggerAlert();
		alertPage.alert_clickToAccept();
		assertEquals(alertPage.getResult(), "You successfuly clicked an alert", "Results text incorrect");
	}

	@Test
	public void testGetTextFromAlert() {
		AlertPage alertPage = homePage.clickJavaScriptAlerts();
		alertPage.triggerConfirm();
		String text = alertPage.alert_getText();
		alertPage.alert_clickToDismiss();
		assertEquals(text, "I am a JS Confirm", "Alert text incorrect");
	}

	@Test
	public void testSetInputInAlert() {
		AlertPage alertPage = homePage.clickJavaScriptAlerts();
		alertPage.triggerPrompt();

		String text = "I m abdou";
		alertPage.alert_setInput(text);
		alertPage.alert_clickToAccept();
		assertEquals(alertPage.getResult(), "You entered: " + text, "Results text incorrect");
	}
}
