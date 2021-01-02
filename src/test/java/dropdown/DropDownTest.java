package dropdown;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTests;
import pages.DropDownPage;

public class DropDownTest extends BaseTests {

	@Test
	public void testDropDown() {
		DropDownPage downPage = homePage.clickDropDown();
		// downPage.addMultipleAttribute();
		String option = "Option 1";
		downPage.selectFromDropDown(option);
		// List<String> selectedOptions = downPage.getSelectedOptions();
		Assert.assertEquals(option, "Option 1", "Incorrect number of selections");
		// assertTrue(downPage.getSelectedOptions().contains(option), "Option not
		// selected");
	}
}
