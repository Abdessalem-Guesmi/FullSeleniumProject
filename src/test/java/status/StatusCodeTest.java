package status;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.BaseTests;
import pages.DescriptionStatusPage;
import pages.StatusCodesPage;

public class StatusCodeTest extends BaseTests {

	@Test(dataProvider = "dataStatusCode")
	public void testStatusCodes(String code) {
		StatusCodesPage statusCodes = homePage.clickStatusCode();
		DescriptionStatusPage descriptionCode = statusCodes.clickStatusCode(code);
		String desc = descriptionCode.getDescCode();
		Assert.assertTrue(desc.contains(code), "status not found");

	}

	@DataProvider(name = "dataStatusCode")
	public Object[][] dataStatusCode() {
		return new Object[][] { { "200" }, { "301" }, { "404" }, { "500" }, { "521" } };
	}

}
