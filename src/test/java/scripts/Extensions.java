package scripts;

import org.json.JSONArray;
import org.json.JSONObject;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.deque.axe.AXE;

import genericLib.BaseClass;

@Listeners(genericLib.ListnersImplementation.class)
public class Extensions extends BaseClass {

	@Test
	public void Validate_Extensions_Module_On_Myspace_App() {

		//driver.findElement(By.xpath("//a[text()='Extensions']")).click();
		utilies.axelib(driver);
	}
}
