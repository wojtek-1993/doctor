package tests;

import org.junit.Assert;
import org.junit.Test;

public class TestDirectingDoctor extends TestBase {

    @Test
    public void popTest() {

        loginPage.fillInLoginForm("***", "***");
        loginPage.clickButtonLogIn();
        institutionPage.selectInstitutionClick();
        institutionPage.selectDirectingDoctorClick();
        directingDoctorPage.createDoctorDepartmentClick();
        doctorDepartmentPage.fillInDoctorDepartmentForm("***", "***", "***", "***","***");
        doctorDepartmentPage.addButtonClick();

        String url = "http://localhost/***/***.php?";
        Assert.assertEquals(driver.getCurrentUrl(), url);
    }
}
