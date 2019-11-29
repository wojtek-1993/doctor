package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static utils.Actions.*;
import static utils.Actions.click;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver) {super (driver);}

    @FindBy(className = "gwt-TextBox")
    private WebElement usernameInput;

    @FindBy(className = "gwt-PasswordTextBox")
    private WebElement passwordInput;

    @FindBy(className = "gwt-Button")
    private WebElement buttonInput;

    @FindBy(id = "hotSearchPatient")
    private WebElement searchPatientInput;


    public LoginPage fillInLoginForm(String username, String password) {

        sendKeys(usernameInput, username);
        sendKeys(passwordInput, password);
        return this;

    }

    public LoginPage clickButtonLogIn(){

        click(buttonInput);
        return this;

    }

}
