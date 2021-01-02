package uploadFile;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import base.BaseTests;
import pages.FileUploadPage;

public class UploadFileTest extends BaseTests {

	@Test
	public void testUploadFile() {
		FileUploadPage fileUploadPage = homePage.clickFileUpload();
		String path = System.getProperty("user.dir") + "/FileUpload";
		fileUploadPage.uploadFile(path);
		String message = fileUploadPage.getUploadedFiles();
		assertEquals(message, "FileUpload", "Uploaded files incorrect");
	}
}
