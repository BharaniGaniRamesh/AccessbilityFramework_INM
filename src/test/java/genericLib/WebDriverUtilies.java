package genericLib;

import java.net.URL;

import org.json.JSONArray;
import org.json.JSONObject;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.deque.axe.AXE;
import scripts.MyspaceLogin;

public class WebDriverUtilies {

	public void javascriptClick(WebDriver driver, WebElement element) {
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", element);
	}

	public static final URL scriptURL = MyspaceLogin.class.getResource("/axe.min.js");

	public void axelib(WebDriver driver) {
		JSONObject responseJson = new AXE.Builder(driver, scriptURL).analyze();
		JSONArray violations = responseJson.getJSONArray("violations");
	   Thea
		if (violations.length() == 0) {
			System.out.println("no errors");
		} else {
			AXE.writeResults("MySpaceAlleyTest", responseJson);
			Assert.assertTrue(false, AXE.report(violations));
			
		}

	}
}
