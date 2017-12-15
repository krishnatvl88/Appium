package TrainingPack;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class CalLaunch {
	//private static AndroidDriver driver;
	public static void main(String[] args) throws MalformedURLException, InterruptedException {

		
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(CapabilityType.BROWSER_NAME, "");
		capabilities.setCapability("deviceName", "Android emulator");
		capabilities.setCapability("platformVersion", "6.0");
		capabilities.setCapability("platformName", "Android");
		//capabilities.setCapability("app", app.getAbsolutePath());
		capabilities.setCapability("appPackage", "com.android.calculator2");
		capabilities.setCapability("appActivity", "com.android.calculator2.Calculator");
		//AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		AndroidDriver<AndroidElement> driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
		Thread.sleep(10000);
		//driver.findElement(By.className("android.widget.Button")).click();
		//driver.findElement(By.id("com.sprt.android.esnext:id/connectionId")).sendKeys("123456");
		Thread.sleep(10000);
		// Click on DELETE/CLR button to clear result text box before running test.
		List<AndroidElement> lst = driver.findElements(By.className("android.widget.Button"));
		 for(WebElement we1:lst)
			 System.out.println(we1.getText());
		  // Click on number 2 button.
		  driver.findElement(By.name("2")).click();
		 	
		  // Click on + button.
		  driver.findElement(By.name("+")).click();

		  // Click on number 5 button.
		  driver.findElement(By.name("5")).click();

		  // Click on = button.
		  driver.findElement(By.name("=")).click();

		  // Get result from result text box.
		  String result = driver.findElement(By.className("android.widget.EditText")).getText();
		  System.out.println("Number sum result is : " + result);

		driver.quit();

}
}
