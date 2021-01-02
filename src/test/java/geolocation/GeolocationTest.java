package geolocation;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTests;
import pages.GeolocationPage;

public class GeolocationTest extends BaseTests {

	@Test
	public void testGeolocation() {
		GeolocationPage geolocation = homePage.clickGeolocation();

		geolocation.clickGeolocationButton();
		String latitude = geolocation.getLatitude();
		System.out.println("your Country: see your: " + latitude);
		String longitude = geolocation.getLongititude();
		System.out.println("your Country: see your: " + longitude);
		Assert.assertTrue(latitude.contains("36.85"), "Latitude not correct");
		Assert.assertTrue(longitude.contains("10.26"), "Longitude not correct");
	}
}
