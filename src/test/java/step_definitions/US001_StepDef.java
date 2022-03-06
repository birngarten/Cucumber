package step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.HomePage;
import utilities.Driver;

public class US001_StepDef {

    HomePage homePage = new HomePage();

    @Given("kullanici {string} adresine gider")
    public void kullanici_adresine_gider(String adres) {
        Driver.getDriver().get(adres);

    }

    @Then("kullanici seyahatin tadini cikartin yazisinin gorunur oldugunu dogrular")
    public void kullanici_seyahatin_tadini_cikartin_yazisinin_gorunur_oldugunu_dogrular() {

        boolean isDisplayed = homePage.seyahatinTadiniCikartin.isDisplayed();
        Assert.assertTrue(isDisplayed);


    }
}
