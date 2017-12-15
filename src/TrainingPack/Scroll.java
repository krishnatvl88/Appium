package TrainingPack;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.appium.java_client.android.AndroidDriver;

public class Scroll {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		DesiredCapabilities des = new DesiredCapabilities();
		des.setCapability(CapabilityType.BROWSER_NAME, "");
		//des.setCapability("app", "c:\\Android\\sdk\\ApiDemos.apk");
		des.setCapability("deviceName", "Android emulator");
		des.setCapability("platformVersion", "6.0");
		des.setCapability("platformName", "Android");
		
		des.setCapability("appPackage", "io.appium.android.apis");
		des.setCapability("appActivity", "io.appium.android.apis.ApiDemos");
	
		AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), des);
	
		Thread.sleep(5000);
		driver.scrollTo("Views");
		Thread.sleep(2000);
		driver.findElement(By.name("Views")).click();
		Thread.sleep(2000);
		driver.scrollTo("Visibility");
		Thread.sleep(2000);
		driver.findElement(By.name("Visibility")).click();
		
		
	}

}
