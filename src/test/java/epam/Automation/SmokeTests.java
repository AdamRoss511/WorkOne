package epam.Automation;

import org.testng.Assert;
import org.testng.annotations.Test;

import static epam.Automation.HomeWorkPartOne.*;

public class SmokeTests extends TestInit {

    @Test
    public void smokeTest(){

        login();
        logout();
        Assert.assertFalse(isLoggedIn());
    }

    @Test
    public void logoutSupportTest(){

        login();
        openSupportPage();
        logout();
        Assert.assertFalse(isLoggedIn());
    }

    @Test
    public void contactFormTest(){

        login();
        openContactForm();
        filloutContactForm();
        submit();
        verification(;)
        Assert.assertFalse(isLoggedIn());
    }


}
