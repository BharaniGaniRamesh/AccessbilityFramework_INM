package scripts;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import genericLib.BaseClass;

public class Rave extends BaseClass {

	@Test
	public void Validate_Rave_Module_On_Myspace_App() {
		driver.findElement(By.xpath("//a[contains(text(),'Rave')]")).click();
		utilies.axelib(driver);
	}
}
