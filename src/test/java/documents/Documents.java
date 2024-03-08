package documents;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import genericLib.BaseClass;

public class Documents extends BaseClass {
	@Test
	public void Validate_Documents_Module_On_Myspace_App() {
		driver.findElement(By.xpath("//span[text()='Documents']")).click();
		utilies.axelib(driver);
	}

}
