package tests;

import org.junit.jupiter.api.Test;

import java.io.File;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TextForm_2 extends TestBase {

    @Test
    void successfulFillFormTest() {
        open("/automation-practice-form");
        $("#firstName").setValue("Ivan");
        $("#lastName").setValue("Ivanov");
        $("#userEmail").setValue("ivanov@mail.com");
        $("#gender-radio-1").setSelected(true);
        $("#userNumber").setValue("89542679041");
        $("#dateOfBirthInput").click();
        $(".react-datepicker__month-select").selectOption("April");
        $(".react-datepicker__year-select").selectOption("2000");
        $(".react-datepicker__day--023").click();
        $("#subjectsInput").setValue("Maths").pressEnter();
        $("#hobbies-checkbox-2").setSelected(true);
        $("#uploadPicture").uploadFile(new File("src/test/resources/TextFileLess3.txt"));
        $("#currentAddress").setValue("123 Oak Street Apartment 4B");
        $("#state").click();
        $("#state").find(byText("NCR")).click();
        $("#city").click();
        $("#city").find(byText("Gurgaon")).click();
        $("#firstName").setValue("Ivan");
        $("#firstName").setValue("Ivan");
        $("#firstName").setValue("Ivan");
        $("#submit").click();
    }
}
