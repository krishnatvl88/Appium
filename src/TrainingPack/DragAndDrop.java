package TrainingPack;



import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class DragAndDrop {
	public static void main(String[] args) throws MalformedURLException, InterruptedException {

		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(CapabilityType.BROWSER_NAME, "");
		capabilities.setCapability("deviceName", "Android emulator");
		capabilities.setCapability("platformVersion", "6.0");
		capabilities.setCapability("platformName", "Android");
		//capabilities.setCapability("app", app.getAbsolutePath());
		capabilities.setCapability("appPackage", "com.mobeta.android.demodslv");
		capabilities.setCapability("appActivity", "com.mobeta.android.demodslv.Launcher");
		//AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		//driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
		Thread.sleep(5000);
		driver.findElement(By.name("Basic usage playground")).click();
		Thread.sleep(2000);
		//AndroidElement ae = (AndroidElement)driver.findElement(By.id("com.mobeta.android.demodslv:id/drag_handle"));
		//List<MobileElement> lst = ae.findElements(By.className("android.widget.ImageView"));
		//AndroidElement ae = (AndroidElement)driver.findElement(By.className("android.widget.ImageView"));
		List lst = driver.findElements(By.id("com.mobeta.android.demodslv:id/drag_handle"));
		for(Object obj:lst)
			System.out.println(obj);
		AndroidElement element1 = (AndroidElement)lst.get(2);
		AndroidElement element2 = (AndroidElement)lst.get(6);
		TouchActions ta = new TouchActions((MobileDriver)driver);
		ta.longPress(element1).moveToElement(element2).release().perform();
		Thread.sleep(2000);
		driver.closeApp();
	}

	
}
