package org.example;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.File;


public class FormPage extends RegistrationTestForm {
    public FormPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        RegistrationTestForm.driver = driver; }

    public FormPage() {
        driver.get("https://demoqa.com/automation-practice-form");
        PageFactory.initElements(driver, this);
    }

    //Поиск элементов на странице
    @FindBy(id = "firstName")
    private static WebElement FirstName;

    @FindBy(id = "lastName")
    private static WebElement LastName;

    @FindBy(id = "userEmail")
    private static WebElement Email;

    @FindBy(css = "label[for=gender-radio-1]")
    private static WebElement gender;

    @FindBy(id = "userNumber")
    private static WebElement number;

    @FindBy(id = "dateOfBirthInput")
    private static WebElement clickDateOfBirth;

    @FindBy(xpath = "//div[@class='react-datepicker__month-dropdown-container react-datepicker__month-dropdown-container--select']/child::*")
    private static WebElement clickOpenMounthList;

    @FindBy(xpath = "//*[@class='react-datepicker__month-select']/child::option[@value='11']")
    private static WebElement clickSelectMounth;

    @FindBy(xpath = "//div[@class='react-datepicker__month-dropdown-container react-datepicker__month-dropdown-container--select']/child::*")
    private static WebElement clickOpenYearList;

    @FindBy(xpath = "//*[@class='react-datepicker__year-select']/child::option[@value='1990']")
    private static WebElement clickSelectYear;

    @FindBy(xpath = "//div[@class='react-datepicker__day react-datepicker__day--010']")
    private static WebElement clickSelectDate;

    @FindBy(xpath = "//*[@id=\"subjectsInput\"]")
    private static WebElement subjects;

    @FindBy(css = "input[type=file]")
    private static WebElement upload_a_picture;

    @FindBy(id = "currentAddress")
    private static WebElement Address;

    @FindBy(id = "react-select-3-input")
    private static WebElement State;

    @FindBy(id = "react-select-4-input")
    private static WebElement Sity;

    @FindBy(id = "submit")
    private static WebElement submit;




    //Реализация логики заполнения формы
    public void inputFirstName (String firstName) {
        FirstName.sendKeys(firstName);
    }

    public void inputLastName(String lastName) {
        LastName.sendKeys(lastName);
    }

    public void inputEmail(String email){
        Email.sendKeys(email);
    }

    public void selectGender(){
        gender.click();
    }

    public void inputUserPhoneNumber(String userPhoneNumber){
        number.click();
        number.sendKeys(userPhoneNumber);
    }
    public void selectdateOfBirth() {
        clickDateOfBirth.click();
        clickOpenMounthList.click();
        clickSelectMounth.click();
        clickOpenYearList.click();
        clickSelectYear.click();
        clickSelectDate.click();
    }
    public void inputSubjects() {
        subjects.sendKeys("Computer Science");
        subjects.sendKeys(Keys.ENTER);
        subjects.sendKeys("Math");
        subjects.sendKeys(Keys.ENTER);
    }

    public void uploadPicture(){
        File uploadFile = new File("src/test/resources/images.png");
        upload_a_picture.sendKeys(uploadFile.getAbsolutePath());
    }

    public void inputCurrentAddress(String address){
        Address.sendKeys(address);
    }

    public void selectState(String state) {
        State.sendKeys(state);
        State.sendKeys(Keys.ENTER);
    }

    public void selectSity(String sity) {
        Sity.sendKeys(sity);
        Sity.sendKeys(Keys.ENTER);
    }

    public void clickSubmit(){
        submit.click();
    }

}

