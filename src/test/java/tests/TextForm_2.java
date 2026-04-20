package tests;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TextForm_2 extends TestBase {

    @Test
    void successfulFillFormTest() {
        open("/automation-practice-form");
        $("[id=firstName]").setValue("Ivan");
        $("[id=lastName]").setValue("Ivanov");
        $("[id=userEmail]").setValue("ivanov@mail.com");
        $("[id=gender-radio-1]").click();
        $("[id=dateOfBirthInput]").setValue("20 Apr 2000");
        $("[id=hobbies-checkbox-2]").click();
        $("[id=firstName]").setValue("Ivan");
        $("[id=firstName]").setValue("Ivan");
        $("[id=firstName]").setValue("Ivan");
        $("[id=firstName]").setValue("Ivan");
        $("[id=firstName]").setValue("Ivan");
        $("[id=firstName]").setValue("Ivan");
    }
}
