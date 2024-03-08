package clientAccolades;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import genericLib.BaseClass;

public class ClientAccolades extends BaseClass {
	@Test
	public void Validate_ClientAccolads_Module_On_Myspace_App() {
		driver.findElement(By.xpath("//span[text()='Client Accolades']")).click();
		utilies.axelib(driver);
	}

}
