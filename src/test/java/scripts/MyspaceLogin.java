package scripts;

import java.io.IOException;
import java.net.URL;

import org.json.JSONArray;
import org.json.JSONObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.deque.axe.AXE;

import genericLib.BaseClass;
import io.github.bonigarcia.wdm.WebDriverManager;

public class MyspaceLogin extends BaseClass {

	@Test
	public void Validate_MyspaceLogin_Module_On_Myspace_App() throws IOException {
		utilies.axelib(driver);

	}

}
