import java.net.MalformedURLException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class SwipeDemo extends base{

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		AndroidDriver<AndroidElement> driver = Capabilities();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		TouchAction ta = new TouchAction(driver);
		
		driver.findElementByXPath("//android.widget.TextView[@text='Views']").click();
		driver.findElementByXPath("//android.widget.TextView[@text='Date Widgets']").click();
		driver.findElementByAndroidUIAutomator("text(\"2. Inline\")").click();
		driver.findElementByXPath("//*[@content-desc='9']").click();
		
		//AndroidElement fifteen = driver.findElementByXPath("//*[@content-desc='15']");
		//AndroidElement fortyfive = driver.findElementByXPath("//*[@content-desc='45']");
		//ta.press(fifteen).waitAction(4000).moveTo(fortyfive).release().perform();
		
		//new TouchAction((PerformsTouchActions) driver).press(driver.findElement(By.xpath("//*[@content-desc='45']"))).waitAction(Duration.ofSeconds(3)).moveTo(driver.findElement(By.xpath("//*[@content-desc='45']"))).release().perform();
		
	}

}
