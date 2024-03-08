package performance_Appraisals;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import genericLib.BaseClass;

public class SelfAppraisalHistory extends BaseClass {

	@Test
	public void Validate_SelfAppraisalHistory_Module_On_Myspace_App() {
		driver.findElement(By.xpath("//a[text()='Self Appraisal History']")).click();
		utilies.axelib(driver);
	}

}
