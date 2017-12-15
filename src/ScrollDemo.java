import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;

import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class ScrollDemo extends base{

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		AndroidDriver<AndroidElement> driver = Capabilities();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElementByXPath("//android.widget.TextView[@text='Views']").click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 String str="WebView";
		 driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""+str+"\").instance(0))");
		
		/*Dimension size = driver.manage().window().getSize();
	    int x = size.getWidth() / 2;
	    int starty = (int) (size.getHeight() * 0.60);
	    int endy = (int) (size.getHeight() * 0.10);
	    driver.swipe(x, starty, x, endy, 2000);
	    */
		
		/*WebElement abc =  driver.findElement(MobileBy.AccessibilityId("//android.widget.TextView[@text='WebView']"));
				//driver.findElementByXPath("//android.widget.TextView[@text='WebView']");

		int x = abc.getLocation().getX();
		int y = abc.getLocation().getY();

		TouchAction action = new TouchAction(driver);
		action.press(x,y).moveTo(x+90,y).release().perform();
		*/
		//driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollIntoView(text(\"WebView\"));");
		//driver.findElementByXPath("//android.widget.TextView[@text='WebView']").click();
	}
}