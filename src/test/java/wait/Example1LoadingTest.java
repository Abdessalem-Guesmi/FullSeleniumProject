package wait;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import base.BaseTests;
import pages.Example1LoadingPage;
import pages.LoadingPage;

public class Example1LoadingTest extends BaseTests {

	@Test
	public void testWaitExmaple1() {
		LoadingPage loadingPage = homePage.clickLoadingPage();
		Example1LoadingPage example1LoadingPage = loadingPage.clickOnExmple1();
		example1LoadingPage.clickOnStart();
		String textContent = example1LoadingPage.getMessage();
		assertEquals(textContent, "Hello World!", "message not found");
	}
}
