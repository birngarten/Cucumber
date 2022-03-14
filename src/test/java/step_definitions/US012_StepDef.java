package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.LoginPage;
import utilities.Driver;

public class US012_StepDef {

    LoginPage loginPage = new LoginPage();


    @Then("kullanici {string} linkinin aktif ve görünür oldugunu dogrular")
    public void kullanici_linkinin_aktif_ve_görünür_oldugunu_dogrular(String string) {

        Assert.assertTrue(loginPage.sifremiUnuttumLink.isEnabled());
        Assert.assertTrue(loginPage.sifremiUnuttumLink.isDisplayed());

    }

    @Then("kullanici {string} linkinin alti cizili oldugunu dogrular")
    public void kullanici_linkinin_alti_cizili_oldugunu_dogrular(String string) {

        String cssValue = loginPage.sifremiUnuttumLink.getCssValue("text-decoration");
        Assert.assertTrue(cssValue.contains("underline"));

    }

    @And("kullanici {string} linkine tiklar")
    public void kullanici_linkine_tiklar(String Link) {
        loginPage.sifremiUnuttumLink.click();

    }

    @Then("kullanici sayfa adresinin {string} ifadesini icerdigini dogrular")
    public void kullanici_sayfa_adresinin_ifadesini_icerdigini_dogrular(String endPoint) {

        String currentUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(currentUrl.contains(endPoint));

    }
}
