package awards;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import genericLib.BaseClass;

public class CPRChampions extends BaseClass {
	@Test
	public void Validate_CPRChampions_Module_On_Myspace_App() {
		driver.findElement(By.xpath("//a[text()='CPR Champions']")).click();
		utilies.axelib(driver);
	}

}
