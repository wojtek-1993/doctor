package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static utils.Actions.click;

public class DirectingDoctorPage extends BasePage {

    public DirectingDoctorPage(WebDriver driver) {super(driver);}

    @FindBy(css = "#NxtList input[name=\"addOddzialowy\"]")
    private WebElement createDoctorDepartmentInput;

    public DirectingDoctorPage createDoctorDepartmentClick(){

        click(createDoctorDepartmentInput);
        return this;
    }
}
