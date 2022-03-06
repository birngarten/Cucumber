package step_definitions;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.HomePage;
import pages.LoginPage;

public class US010_StepDef {

    LoginPage loginPage = new LoginPage();

    @Then("kullanici login sayfasinda email inputunun kullanilabilir oldugunu dogrular")
    public void kullanici_login_sayfasinda_email_inputunun_kullanilabilir_oldugunu_dogrular() {
        boolean isEnabled = loginPage.emailInput.isEnabled();
        Assert.assertTrue(isEnabled);

        //inputun içerisine yazı yaz
        loginPage.emailInput.sendKeys("mail@gmail.com");

        //inputun içerisindeki yazıyı kontrol et
        String text = loginPage.emailInput.getAttribute("value");

        Assert.assertEquals("mail@gmail.com", text);

    }

    @Then("kullanici login sayfasinda password inputunun kullanilabilir oldugunu dogrular")
    public void kullanici_login_sayfasinda_password_inputunun_kullanilabilir_oldugunu_dogrular() {
        boolean isEnabled = loginPage.passwordInput.isEnabled();
        Assert.assertTrue(isEnabled);

        //inputun içerisine yazı yaz
        loginPage.passwordInput.sendKeys("sifre");

        //inputun içerisindeki yazıyı kontrol et
        String text = loginPage.passwordInput.getAttribute("value");

        Assert.assertEquals("sifre", text);


    }

    @Then("kullanici login sayfasinda email inputunun placeholder degerinin {string} oldugunu dogrular")
    public void kullanici_login_sayfasinda_email_inputunun_placeholder_degerinin_oldugunu_dogrular(String value) {
        String placeholder = loginPage.emailInput.getAttribute("placeholder");
        Assert.assertEquals(value,placeholder);

    }

    @Then("kullanici login sayfasinda password inputunun placeholder degerinin {string} oldugunu dogrular")
    public void kullanici_login_sayfasinda_password_inputunun_placeholder_degerinin_oldugunu_dogrular(String value) {
        String placeholder = loginPage.passwordInput.getAttribute("placeholder");
        Assert.assertEquals(value,placeholder);


    }

}
