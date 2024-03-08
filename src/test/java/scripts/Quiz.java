package scripts;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import genericLib.BaseClass;

public class Quiz extends BaseClass {

	@Test
	public void Validate_Quiz_Module_On_Myspace_App() {
		driver.findElement(By.xpath("//a[contains(text(),'Quiz')]         ")).click();
		utilies.axelib(driver);
	}
}
