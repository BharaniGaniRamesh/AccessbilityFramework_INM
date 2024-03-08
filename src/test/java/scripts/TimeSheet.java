package scripts;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import genericLib.BaseClass;

public class TimeSheet extends BaseClass {

	@Test
	public void Validate_TimeSheet_Module_On_Myspace_App() {
		driver.findElement(By.xpath("//a[text()='Time Sheets']")).click();
		utilies.axelib(driver);
	}
}
