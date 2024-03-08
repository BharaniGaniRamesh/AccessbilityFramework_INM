package scripts;

import java.io.IOException;

import org.json.JSONArray;
import org.json.JSONObject;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.deque.axe.AXE;

import genericLib.BaseClass;

public class MyProfile extends BaseClass {
	@Test
	public void Validate_MyProfile_Module_On_Myspace_App() throws IOException {
		driver.findElement(By.xpath("//a[text()='My Profile']")).click();
		utilies.axelib(driver);

	}
}
