package scripts;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import genericLib.BaseClass;

public class Payslips extends BaseClass {

	@Test
	public void Validate_Payslips_Module_On_Myspace_App() {
		driver.findElement(By.xpath("//a[contains(text(),'Payslips')]")).click();
		utilies.axelib(driver);
	}
}
