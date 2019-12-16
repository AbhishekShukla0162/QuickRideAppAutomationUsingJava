package com.qa.AppPages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class RideBookingPage {

    public RideBookingPage(AndroidDriver<AndroidElement> driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    AndroidDriver<AndroidElement> driver;

    @AndroidFindBy(id = "com.disha.quickride:id/tv_from_location")
    public WebElement clickcurrentLocation;

    public RideBookingPage ClickCurrentLocation() {
        clickcurrentLocation.click();
        return this;
    }

    @AndroidFindBy(xpath = "//android.widget.EditText[@text = 'Enter from location']")
    public WebElement chooseLocation;

    public RideBookingPage ChooseCurrentLocation() {
        chooseLocation.sendKeys("Yelahanka New Town, Bengaluru, Karnataka 560064");
        return this;
    }

    @AndroidFindBy(xpath = "//android.widget.TextView[@text = 'Yelahanka, Bengaluru, Karnataka, India']")
    public WebElement select;

    public RideBookingPage SelectYehalankaNewTown() {
        select.click();
        return this;
    }

    @AndroidFindBy(id = "com.disha.quickride:id/tv_from_location")
    public WebElement ridelocation;

    public RideBookingPage ClickOnRidelocation() {
        ridelocation.click();
        return this;
    }

    @AndroidFindBy(xpath = "//android.widget.EditText[@text = 'Enter to location']")
    public WebElement chooselocation;

    public RideBookingPage ChooseRideLocation() {
        chooselocation.sendKeys("Near Prestige Mall, Udaya Layout, Yelahanka New Town, Bengaluru, Karnataka 560064");
        return this;
    }

    @AndroidFindBy(xpath = "//android.widget.TextView[@text = 'Mother Dairy']")
    public WebElement destination;

    public RideBookingPage SelectDestination() {
        destination.click();
        return this;
    }

    @AndroidFindBy(xpath = "//android.widget.Button[@text = 'FIND RIDE']")
    public WebElement findride;

    public RideBookingPage ClickFindRide() {
        findride.click();
        return this;
    }

    @AndroidFindBy(xpath = "//android.widget.TextView[@text = 'Join']")
    public WebElement joinride;

    public RideBookingPage JoinARide() {
        joinride.click();
        return this;
    }

    @AndroidFindBy(xpath = "//android.widget.Button[@text = 'VERIFY NOW']")
    public WebElement VERIFY;

    public RideBookingPage VerifyYourRide() {
        VERIFY.click();
        return this;
    }



}
