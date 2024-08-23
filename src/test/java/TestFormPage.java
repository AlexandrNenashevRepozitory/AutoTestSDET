import jdk.jfr.Description;
import org.example.FormPage;
import org.example.RegistrationTestForm;
import org.junit.Test;

public class TestFormPage extends RegistrationTestForm {

    @Test
    @Description("Тест проверяет функциональность заполнения и отправки формы регистрации.")
    public void testForm(){


        // Инициализация тестовых данных
        String firstName = "Jon";
        String lastName = "Smith";
        String email = "JonhSmith@gmail.com";
        String userPhoneNumber = "89991390000";
        String address = "Crosby Street";
        String state = "NCR";
        String sity = "Noida";


        // Создание объекта страницы формы
        FormPage startFormPage = new FormPage();



        // Ввод имени
        startFormPage.inputFirstName(firstName);

        // Ввод фамилии
        startFormPage.inputLastName(lastName);

        // Ввод email
        startFormPage.inputEmail(email);

        // Выбор гендера
        startFormPage.selectGender();

        // Ввод номера телефона
        startFormPage.inputUserPhoneNumber(userPhoneNumber);

        // Выбор даты рождения
        startFormPage.selectdateOfBirth();

        // Ввод предмета
        startFormPage.inputSubjects();

        // Загрузка изображения
        startFormPage.uploadPicture();

        // Ввод текущего адреса
        startFormPage.inputCurrentAddress(address);

        // Выбор штата
        startFormPage.selectState(state);

        // Выбор города
        startFormPage.selectSity(sity);

        // Отправка формы
        startFormPage.clickSubmit();
    }
}

