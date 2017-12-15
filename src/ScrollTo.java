import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class ScrollTo 
{
        public AndroidDriver driver1;

         @BeforeClass
         public void setUp() throws MalformedURLException
         {
            //Set up desired capabilities and pass the Android app-activity and app-package to Appium
        	 File f = new File("src");
     		//File fs = new File(f,"com.raaga.android.2.0.4.apk");
     		File fs = new File(f,"ApiDemos-debug.apk");
        	 
             DesiredCapabilities capabilities = new DesiredCapabilities();
        
                capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Demo");
                capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");             
                capabilities.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());

               
              //Create RemoteWebDriver instance and connect to the Appium server.
                try
                {
                    driver1 = new AndroidDriver (new URL("http://127.0.0.1:4723/wd/hub"), capabilities);    
                    driver1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                }
                catch(Exception e)
                {
                    e.printStackTrace();
                }
         }
         
         @Test
         public void testCal()  throws Exception 
         {
                 String str="WebView";
//                driver1.scrollTo(str);
                 driver1.findElementByXPath("//android.widget.TextView[@text='Views']").click();
                 driver1.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""+str+"\").instance(0))");
                 driver1.findElementByXPath("//android.widget.TextView[@text='WebView']").click();
               // driver1.quit();
        }
}