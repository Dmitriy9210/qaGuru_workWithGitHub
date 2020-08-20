package tests;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;


public class YandexTests {

    @Test
    void selenideSearchYandexTest() {
        open("https://yandex.ru/");
        $(".input__input").setValue("Selenide").pressEnter();
        $("html").shouldHave(text("ru.selenide.org"));
    }
}
