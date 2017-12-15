package TrainingPack;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class UnlockDevice {
	public static void main(String[] args) throws MalformedURLException, InterruptedException {

		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(CapabilityType.BROWSER_NAME, "");
		capabilities.setCapability("deviceName", "Android emulator");
		capabilities.setCapability("platformVersion", "6.0");
		capabilities.setCapability("platformName", "Android");
		
		capabilities.setCapability("appPackage", "io.appium.android.apis");
		capabilities.setCapability("appActivity", "io.appium.android.apis.ApiDemos");
		AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		//driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
		Thread.sleep(5000);
		if(driver.isLocked())
		{
			driver.unlockDevice();
			System.out.println("Unlocked Device");
		driver.findElement(By.name("Views")).click();
		Thread.sleep(2000);
		}
		else
			driver.lockDevice();
		System.out.println("Lock Device");
		driver.unlockDevice();
		driver.closeApp();
	}
}
