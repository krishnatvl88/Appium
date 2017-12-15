package TrainingPack;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class AppSwitch {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(CapabilityType.BROWSER_NAME, "");
		capabilities.setCapability("deviceName", "Android emulator");
		capabilities.setCapability("platformVersion", "6.0");
		capabilities.setCapability("platformName", "Android");
		//capabilities.setCapability("app", app.getAbsolutePath());
		capabilities.setCapability("appPackage", "com.android.calculator2");
		capabilities.setCapability("appActivity", "com.android.calculator2.Calculator");
		//AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		//driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
		Thread.sleep(5000);
		//driver.findElement(By.className("android.widget.Button")).click();
		//driver.findElement(By.id("com.sprt.android.esnext:id/connectionId")).sendKeys("123456");
		driver.startActivity("io.appium.android.apis", "io.appium.android.apis.ApiDemos");
		Thread.sleep(5000);
		driver.quit();
	}

}
