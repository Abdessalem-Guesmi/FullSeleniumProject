package wait;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import base.BaseTests;
import pages.Example2LoadingPage;
import pages.LoadingPage;

public class Example2LoadingTest extends BaseTests {

	@Test
	public void testWaitExmaple2() {
		LoadingPage loadingPage = homePage.clickLoadingPage();
		Example2LoadingPage example2LoadingPage = loadingPage.clickOnExmple2();
		example2LoadingPage.clickOnStart();
		String textContent = example2LoadingPage.getMessage();
		assertEquals(textContent, "Hello World!", "message not found");
	}
}
