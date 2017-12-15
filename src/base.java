import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;


import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

public class base {

	
	
	public static AndroidDriver<AndroidElement> Capabilities() throws MalformedURLException {
	//public static void main(String[] args) throws MalformedURLException {
		
	
	// TODO Auto-generated method stub
		//Open apk file
		File f = new File("src");
		//File fs = new File(f,"Raaga.apk");
		File fs = new File(f,"ApiDemos-debug.apk");
		
		//Desired capabilities
		DesiredCapabilities cap = new DesiredCapabilities();
	//	cap.setCapability(MobileCapabilityType.PLATFORM_NAME,MobilePlatform.ANDROID);
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Nexus5");
		
	//	cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "100");
		cap.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		//Initialize and use Android Driver
		AndroidDriver<AndroidElement> driver = new AndroidDriver<>(new URL("http://127.0.1.1:4723/wd/hub"),cap);
		return driver;
		
	}
	/*
	@Test
	public void Capabilities() throws MalformedURLException {
		File f = new File("src");
		File fs = new File(f,"ApiDemos-debug.apk");
		
		//Desired capabilities
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME,MobilePlatform.ANDROID);
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android device");
		
		cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "100");
		cap.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		//Initialize and use Android Driver
		AndroidDriver<AndroidElement> driver = new AndroidDriver<>(new URL("http://127.0.1.1:4723/wd/hub"),cap);
		//return driver;
	}*/
}
