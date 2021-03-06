package com.test.apidemo.app.screens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.WebElement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/*
 * Created by priyankp.shah on 15/9/15.
 */
@Component
@Scope("cucumber-glue")
public class ActivityScreen extends AbstractScreen {

    @Autowired
    private SecureSurfaceScreen secureSurfaceScreen;

    private WebElement secureSurfaceElement;

    @Autowired
    public ActivityScreen(AppiumDriver<? extends MobileElement> driver) {
        super(driver);
    }

    public SecureSurfaceScreen getSecureSurfaceScreen() {
        secureSurfaceElement = this.getElement("apidemo.activityscreen.securesurface.lable");
        secureSurfaceElement.click();
        return secureSurfaceScreen;
    }
}
