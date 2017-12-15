package TrainingPack;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Calculate {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		DesiredCapabilities des = new DesiredCapabilities();
		des.setCapability("deviceName", "And");
		des.setCapability("platformName", "Android");
		des.setCapability("platformVersion", "5.0");
		
		des.setCapability("appPackage", "com.android.calculator2");
		des.setCapability("appActivity", "com.android.calculator2.Calculator");
		AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), des);
		
		List<AndroidElement> li = driver.findElements(By.className("android.widget.Button"));
		for(WebElement we:li){
			//System.out.println(we.getText());
			//System.out.println(we.getSize());
		}
		driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
		Thread.sleep(5000);
		
		driver.findElement(By.name("2")).click();
		driver.findElement(By.name("+")).click();
		driver.findElement(By.name("7")).click();
		driver.findElement(By.name("=")).click();
	}

}
