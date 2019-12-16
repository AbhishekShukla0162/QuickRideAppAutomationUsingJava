package com.qa.AppTest;

import com.qa.AppBaseFile.BaseApp;
import com.qa.AppPages.RideBookingPage;
import com.qa.AppPages.SignUpPage;
import com.qa.AppPages.StartPage;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.testng.annotations.Test;
import ru.yandex.qatools.allure.annotations.Title;

public class AppTest extends BaseApp {

        @Test
        @Title("Test cases for Book a Ride in QuickBuy App")
        public void BookARideInQuickRideApp() throws Exception {
            AndroidDriver<AndroidElement> driver = capabilities();
            StartPage startPage = new StartPage(driver);
            RideBookingPage rideBookingPage = new RideBookingPage(driver);

            startPage.ClickOnAllowbutton()
                    .ContinueWithPhoneNumber()
                    .ENTERPhoneNumber();

            rideBookingPage.ClickCurrentLocation()
                    .ChooseCurrentLocation()
                    .SelectYehalankaNewTown()
                    .ClickOnRidelocation()
                    .ChooseRideLocation()
                    .SelectDestination()
                    .ClickFindRide()
                    .JoinARide()
                    .VerifyYourRide();
        }

    @Test
    @Title("Test cases for Normal User Signup using email on the QuickRide app in production.")
    public void RegiserToNewApp() throws Exception {
        AndroidDriver<AndroidElement> driver = capabilities();
        StartPage startPage = new StartPage(driver);
        SignUpPage signUpPage = new SignUpPage(driver);

        startPage.ClickOnAllowbutton()
                .ContinueWithPhoneNumber()
                .ENTERPhoneNumber();

       signUpPage.EnterPhoneNumberForLogin()
               .EnterPasswordForLfogin()
               .EnterNameForLfogin()
               .EnterEmailForCommunication()
               .SelectGender()
               .SignupInApp();
    }
}