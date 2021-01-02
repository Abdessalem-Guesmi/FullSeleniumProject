package iframe;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import base.BaseTests;
import pages.FramePage;
import pages.IFramesPage;

public class FrameTest extends BaseTests {

	@Test
	public void testFrame() {
		FramePage framePage = homePage.clickFrame();
		IFramesPage iFramesPage = framePage.clickNestedFrames();
		String text1 = "Hello ";
		String text2 = "Automation";
		iFramesPage.clearTextArea();

		iFramesPage.setTextArea(text1);
		iFramesPage.decreaseIndention();

		iFramesPage.setTextArea(text2);
		assertEquals(iFramesPage.getTextFromEditor(), text1 + text2, "not Equal!!");
	}
}
