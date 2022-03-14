package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    @FindBy(xpath = "//input[@placeholder='Email giriniz']")
    public WebElement emailInput;//input[@placeholder='Şifrenizi giriniz']

    @FindBy(xpath = "//input[@placeholder='Şifrenizi giriniz']")
    public WebElement passwordInput;

    @FindBy(xpath = "//a[.='Şifremi Unuttum']")
    public WebElement sifremiUnuttumLink;



}