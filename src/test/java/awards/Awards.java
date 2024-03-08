package awards;

import org.openqa.selenium.By;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genericLib.BaseClass;

@Listeners(genericLib.ListnersImplementation.class)
public class Awards extends BaseClass {
	@Test
	public void Validate_Awards_Module_On_Myspace_App() {
		driver.findElement(By.xpath("//span[text()='Awards']")).click();
		utilies.axelib(driver);
	}

}
