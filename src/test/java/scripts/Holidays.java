package scripts;

import org.json.JSONArray;
import org.json.JSONObject;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.deque.axe.AXE;

import genericLib.BaseClass;

public class Holidays extends BaseClass {

	@Test
	public void Validate_Holidays_Module_On_Myspace_App() {
		driver.findElement(By.xpath("//a[text()='Holidays']")).click();
		utilies.axelib(driver);
	}
}
