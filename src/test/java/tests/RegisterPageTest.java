package tests;

import core.BaseTest;
import org.testng.annotations.Test;
import pages.RegisterPage;
import utils.WaitTool;

public class RegisterPageTest extends BaseTest {

    @Test
    public void creatingNewUser(){
        RegisterPage.goToPage();
        RegisterPage.setClickMyAccountButton();
        RegisterPage.setClickRegisterButton();
        RegisterPage.waitForInputFields();
        RegisterPage.setInputFirstName();
        RegisterPage.setInputLastName();
        RegisterPage.setInputEmail();
        RegisterPage.setInputTelephone();
        RegisterPage.setInputPassword();
        RegisterPage.setClickCheckBox();
        RegisterPage.setClickContinueButton();
        RegisterPage.waitForValidationSuccess();
        RegisterPage.verifyValidationMessage("Your Account Has Been Created!");

    }
}
