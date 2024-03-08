package scripts;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import genericLib.BaseClass;

public class USOpeRequirements extends BaseClass {

	@Test
	public void Validate_USOpeRequirements_Module_On_Myspace_App() {
		driver.findElement(By.xpath("//a[text()='US Open Requirements']")).click();
		utilies.axelib(driver);
	}
}
