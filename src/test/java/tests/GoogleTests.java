package tests;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;


class GoogleTests {
    
    @Test
    void selenideSearchTest() {
        // Открыть google
        open("https://google.com");
        
        // Ввести Selenide в поиск
        $(byName("q")).setValue("Selenide").pressEnter();
        
        // Проверить, что Selenide появился в результатах поиска
        $("html").shouldHave(text("selenide.org"));
    }

    @Test
    void selenideSearchAndOpenTest() {
        // Открыть google
        open("https://google.com");
        
        // Ввести Selenide в поиск
        $(byName("q")).setValue("Selenide").pressEnter();
        
        // Проверить, что Selenide появился в результатах поиска
        $("html").shouldHave(text("selenide.org"));

        // открыть сайт selenide
        $(byText("selenide.org")).click();
        
        // Проверить, что открылась действительно нужная страница Selenide)
        $("html").shouldHave(text("selenide.jar"));
    }
    
    @Test
    void SearchMailRuTest() {
        open("https://google.com");
        $(byName("q")).setValue("mail ru").pressEnter();
        $("html").shouldHave(text("mail.ru"));
    }
}
