package com.qa.AppBaseFile;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class BaseApp {

        public static final String ANSI_RED = "\u001B[31m";
        public static final String ANSI_RESET = "\u001B[0m";

        public AndroidDriver<AndroidElement> capabilities() throws MalformedURLException {
            System.out.println(ANSI_RED + "Welcome To Quick Ride App Automation" + ANSI_RESET);

            File AppLocation = new File("src");
            File InstallAppLocation = new File(AppLocation, "Quick Ride.com.apk");

            DesiredCapabilities capability = new DesiredCapabilities();
            capability.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Device");
            capability.setCapability(MobileCapabilityType.APP, InstallAppLocation.getAbsolutePath());
            AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(
                    new URL("http://127.0.0.1:4723/wd/hub"), capability);
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            return driver;
        }
    }
