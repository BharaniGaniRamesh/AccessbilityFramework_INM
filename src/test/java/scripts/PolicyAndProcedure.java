package scripts;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import genericLib.BaseClass;

public class PolicyAndProcedure extends BaseClass {

	@Test
	public void Validate_PolicyAndProcedure_Module_On_Myspace_App() {
		driver.findElement(By.xpath("//a[contains(text(),'Policy & Procedure')]")).click();
		utilies.axelib(driver);
	}
}
