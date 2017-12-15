import java.net.MalformedURLException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.touch.TouchActions;

import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class gestures extends base{

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		AndroidDriver<AndroidElement> driver = Capabilities();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElementByXPath("//android.widget.TextView[@text='Views']").click();
		
		//tap
		TouchAction t = new TouchAction(driver);
		t.tap(driver.findElementByXPath("//android.widget.TextView[@text='Expandable Lists']")).perform();
		
		driver.findElement(By.xpath("//android.widget.TextView[@text='1. Custom Adapter']")).click();
		
		//long-press
		//t.press(driver.findElementByXPath("//android.widget.TextView[@text='People Names']")).waitAction(Duration.ofSeconds(3)).release().perform();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//t.press(driver.findElement(By.xpath("//android.widget.TextView[@text='People Names']"))).waitAction(Duration.ofSeconds(3)).release().perform();
		//new TouchAction((PerformsTouchActions) driver).press(driver.findElement(By.xpath("//android.widget.TextView[@text='People Names']"))).waitAction(Duration.ofSeconds(3)).release().perform();
		
				System.out.println(driver.findElementById("android:id/title").getText());
	}

}
