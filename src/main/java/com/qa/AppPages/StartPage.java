package com.qa.AppPages;

import com.sun.xml.internal.bind.v2.model.core.ID;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidBy;
import io.appium.java_client.pagefactory.AndroidFindAll;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class StartPage {

        public StartPage(AndroidDriver<AndroidElement> driver) {
            PageFactory.initElements(new AppiumFieldDecorator(driver), this);
        }

        AndroidDriver<AndroidElement> driver;



   @AndroidFindAll({

           @AndroidBy(xpath = "//android.widget.Button[@text = 'ALLOW']"),
           @AndroidBy(id = "com.android.packageinstaller:id/permission_allow_button")

   })

    public WebElement allow;

    public StartPage ClickOnAllowbutton() throws InterruptedException {
        allow.click();
        Thread.sleep(2000);
        allow.click();
        return this;
    }

        @AndroidFindBy(xpath = "//android.widget.TextView[@text = 'Continue with Phone Number']")
        public WebElement withPhoneNumber;

        public StartPage ContinueWithPhoneNumber() {
            withPhoneNumber.click();
            return this;
        }

    @AndroidFindBy(xpath = "//android.widget.EditText[@text = 'Mobile Number']")
    public WebElement PhoneNumber;

    public StartPage ENTERPhoneNumber() {
        PhoneNumber.sendKeys("8565009444");
        return this;
    }
}

