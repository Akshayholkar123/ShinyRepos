

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
class AppiumFirstTest{
	public static void main(String[] args) throws MalformedURLException {
		DesiredCapabilities dc = new DesiredCapabilities();

		dc.setCapability("platformName", "android");

		dc.setCapability("automationName", "uiautomator2");

		dc.setCapability("UDID", "MJKVJZNRBUCAKFRW" );

		dc.setCapability("app", "C:\\Users\\viren\\Downloads\\appium file\\ApiDemos-debug.apk");



		dc.setCapability("appPackage", "io.appium.android.apis");

		dc.setCapability("appActivity", ".ApiDemos");



		URL u = new URL("http://localhost:4723");



		AndroidDriver driver = new AndroidDriver(u,dc);

		driver.findElement(AppiumBy.accessibilityId("Views")).click();

		RemoteWebElement element = null;////*[contains(@class, '_highlighter-box_619e8') and contains(@class, '_inspected-element-box_619e8')]

		((JavascriptExecutor) driver).executeScript("mobile:longClickGesture", ImmutableMap.of("elementId",((RemoteWebElement)element).getId()));


	}

}
