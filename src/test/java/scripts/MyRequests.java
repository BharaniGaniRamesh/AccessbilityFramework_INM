package scripts;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import genericLib.BaseClass;

public class MyRequests extends BaseClass {
	@Test
	public void Validate_MyRequests_Module_On_Myspace_App() {
		driver.findElement(By.xpath("//a[text()='My Requests']")).click();
		utilies.axelib(driver);
	}

}
