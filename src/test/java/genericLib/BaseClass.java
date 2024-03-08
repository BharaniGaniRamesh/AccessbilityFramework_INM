package genericLib;

import java.io.IOException;
import java.net.URL;
import java.time.Duration;

import org.json.JSONArray;
import org.json.JSONObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.deque.axe.AXE;

import scripts.MyspaceLogin;

public class BaseClass {
	public static WebDriver driver;
	public static final URL scriptURL = MyspaceLogin.class.getResource("/axe.min.js");
	public PropertyFile pf = new PropertyFile();
	public WebDriverUtilies utilies = new WebDriverUtilies();

	@BeforeMethod
	public void setup() throws IOException {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(pf.getpropertyFile("url"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//		driver.findElement(By.id("username")).sendKeys(pf.getpropertyFile("username"));
//		driver.findElement(By.name("password")).sendKeys(pf.getpropertyFile("password"));
//		WebElement ele = driver.findElement(By.id("submit"));
//		utilies.javascriptClick(driver, ele);

	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}