package performance_Appraisals;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import genericLib.BaseClass;

public class Goals extends BaseClass {

	@Test
	public void Validate_Goals_Module_On_Myspace_App() {
		driver.findElement(By.xpath("//a[text()='Goals']")).click();
		utilies.axelib(driver);
	}

}
