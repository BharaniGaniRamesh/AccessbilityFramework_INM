package scripts;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import genericLib.BaseClass;

public class TrainingSessions extends BaseClass {

	@Test
	public void Validate_TrainingSessions_Module_On_Myspace_App() {
		driver.findElement(By.xpath("//a[text()='Training Sessions']")).click();
		utilies.axelib(driver);
	}
}
