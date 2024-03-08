package scripts;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import genericLib.BaseClass;

public class OrgChart extends BaseClass {

	@Test
	public void Validate_OrgChart_Module_On_Myspace_App() {
		driver.findElement(By.xpath("//a[text()='Org Chart']")).click();
		utilies.axelib(driver);
	}
}
