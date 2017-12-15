package TrainingPack;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.appium.java_client.android.AndroidDriver;

public class WebApp {

	public static void main(String[] args) throws InterruptedException, MalformedURLException {
		// TODO Auto-generated method stub
		DesiredCapabilities des = new DesiredCapabilities();
		des.setCapability(CapabilityType.BROWSER_NAME, "chrome");
		des.setCapability("deviceName", "And");
		des.setCapability("platformName", "Android");
		des.setCapability("platformVersion", "5.0");
		des.setCapability("appPackage","com.android.chrome");
		des.setCapability("appActivity","com.google.android.apps.chrome.Main");
		AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), des);
		//WebDriver driver = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"), des);
		Thread.sleep(5000);
		
		driver.get("https://www.facebook.com");
	}

}
