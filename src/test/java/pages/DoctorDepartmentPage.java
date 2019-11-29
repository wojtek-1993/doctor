package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


import static utils.Actions.*;

public class DoctorDepartmentPage extends BasePage {

    private WebDriver driver;

    public DoctorDepartmentPage(WebDriver driver) {super(driver); this.driver = driver;}

    @FindBy(id="ID_LEKARZ_KIER_HIS")
    private WebElement idNumberInput;

    @FindBy(id="NAZWISKO")
    private WebElement lastnameInput;

    @FindBy(id="IMIONA")
    private WebElement nameInput;

    @FindBy(id="TYTUL")
    private WebElement titleInput;

    @FindBy(id="NR_PRAWA_WYK_ZAWODU")
    private WebElement numberOfTheProfessionInput;

    @FindBy(css = "#jedn  input[value=\"Wybierz...\"]")
    private WebElement selectButtonInput;

    @FindBy(css = "#NxtList input[value=\"Wybierz...\"]")
    private WebElement selectDepartmentInput;

    @FindBy(id = "MM_insert")
    private WebElement addButtonInput;

    public DoctorDepartmentPage fillInDoctorDepartmentForm(String id, String lastname, String name, String title, String numberOfTheProfession) {

        sendKeys(idNumberInput, id);
        sendKeys(lastnameInput,lastname);
        sendKeys(nameInput, name);
        sendKeys(titleInput, title);
        sendKeys(numberOfTheProfessionInput, numberOfTheProfession );
        click(selectButtonInput);
        windowHandleSwitchTo(driver, selectDepartmentInput);
        return this;
    }

    public DoctorDepartmentPage addButtonClick() {

        click(addButtonInput);
        return this;
    }
}
