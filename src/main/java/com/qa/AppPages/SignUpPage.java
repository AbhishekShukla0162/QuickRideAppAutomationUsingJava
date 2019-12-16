package com.qa.AppPages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class SignUpPage {

    public SignUpPage(AndroidDriver<AndroidElement> driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    AndroidDriver<AndroidElement> driver;

    @AndroidFindBy(xpath = "//android.widget.EditText[@text = 'Phone']")
    public WebElement phone;

    public SignUpPage EnterPhoneNumberForLogin() {
        phone.sendKeys("8565009444");
        return this;
    }

    @AndroidFindBy(xpath = "//android.widget.EditText[@text = 'Password']")
    public WebElement password;

    public SignUpPage EnterPasswordForLfogin() {
        phone.sendKeys("Abhi@8565");
        return this;
    }

    @AndroidFindBy(xpath = "//android.widget.EditText[@text = 'Name']")
    public WebElement name;

    public SignUpPage EnterNameForLfogin() {
        name.sendKeys("Abhishek Shukla");
        return this;
    }

    @AndroidFindBy(xpath = "//android.widget.EditText[@text = 'Email For Communication']")
    public WebElement emailForCommu;

    public SignUpPage EnterEmailForCommunication() {
        emailForCommu.sendKeys("erabhishek262@gmail.com");
        return this;
    }

    @AndroidFindBy(xpath = "//android.widget.EditText[@text = 'Male']")
    public WebElement male;

    public SignUpPage SelectGender() {
        male.click();
        return this;
    }

    @AndroidFindBy(xpath = "//android.widget.EditText[@text = 'SIGN UP']")
    public WebElement signup;

    public SignUpPage SignupInApp() {
        male.click();
        return this;
    }
}
