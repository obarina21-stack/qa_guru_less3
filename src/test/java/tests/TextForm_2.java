package tests;

import org.junit.jupiter.api.Test;

import java.io.File;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.value;
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
        $("#userNumber").setValue("9542679041");
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
//        $("#submit").click();
 //       $("#closeLargeModal").click();

        $("#firstName").shouldHave(value("Ivan"));
        $("#lastName").shouldHave(value("Ivanov"));
        $("#userEmail").shouldHave(value("ivanov@mail.com"));
        $("#gender-radio-1").shouldHave(value("Male"));
        $("#userNumber").shouldHave(value("9542679041"));
        $("#dateOfBirthInput").shouldHave(value("23 Apr 2000"));
        $(".subjects-auto-complete__control").shouldHave(text("Maths"));
        $("#hobbies-checkbox-2").shouldHave(value("2"));
        $("#uploadPicture").shouldHave(value("C:\\fakepath\\TextFileLess3.txt"));
        $("#currentAddress").shouldHave(value("123 Oak Street Apartment 4B"));
        $("#state").shouldHave(text("NCR"));
        $("#city").shouldHave(text("Gurgaon"));

    }
}
