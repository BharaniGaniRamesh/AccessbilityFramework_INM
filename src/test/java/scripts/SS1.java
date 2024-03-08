package scripts;

import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

import com.github.lkkushan101.accessilenium.accessilenium.TheAccessibilityReport;

import genericLib.BaseClass;
import genericLib.PropertyFile;

import java.io.IOException;
import org.testng.annotations.Test;
import com.github.lkkushan101.accessilenium.accessilenium.TheAccessibilityReport;
public class SS1 extends BaseClass{
@Test
public void test() throws IOException
{
	utilies.axelib(driver);
TheAccessibilityReport.testAccessibility(pf.getpropertyFile("url"));


}
}
