package epam.Automation;

import org.testng.Assert;
import org.testng.annotations.Test;

import static epam.Automation.HomeWorkPartOne.isLoggedIn;
import static epam.Automation.HomeWorkPartOne.login;
import static epam.Automation.HomeWorkPartOne.logout;

public class SmokeTests extends TestInit {

    @Test
    public void smokeTest(){

        login();
        logout();
        Assert.assertFalse(isLoggedIn());
    }
}
