package awards;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import genericLib.BaseClass;

public class HallOfFame extends BaseClass {
	@Test
	public void Validate_HallOfFame_Module_On_Myspace_App() {
		driver.findElement(By.xpath("//a[text()='Hall Of Fame']")).click();
		utilies.axelib(driver);
	}

}
