package scripts;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import genericLib.BaseClass;

public class PhotosAndVideos extends BaseClass {

	@Test
	public void Validate_PhotosAndVideos_Module_On_Myspace_App() {
		driver.findElement(By.xpath("//a[text()='Photos & Videos']")).click();
		utilies.axelib(driver);
	}
}
