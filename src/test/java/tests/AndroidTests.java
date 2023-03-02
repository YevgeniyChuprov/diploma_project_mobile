package tests;

import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.WikipediaPage;

import static io.qameta.allure.Allure.step;

@Epic("Android")
public class AndroidTests extends TestBase {

    WikipediaPage wikipediaPage = new WikipediaPage();

    @Test
    @Feature("Search")
    @Tag("android")
    @DisplayName("Поиск страницы BrowserStack")
    void searchTest() {
        wikipediaPage
                .goBack()
                .searchArticle("BrowserStack")
                .checkSearchResultSize();
    }

    @Test
    @Feature("Search")
    @Tag("android")
    @DisplayName("Поиск страницы Microsoft, проверка на странице")
    void checkDescriptionTest() {
        step("Тестируем страницу Microsoft", () -> {
            wikipediaPage
                    .goBack()
                    .searchArticle("Microsoft")
                    .checkSearchResult("American multinational technology corporation")
                    .checkTextOnArticlePage();
        });
    }

    @Test
    @Feature("Search")
    @Tag("android")
    @DisplayName("Поиск по одной букве А")
    void LetterSearch() {
        step("Тестируем поиск по одной букве", () -> {
            wikipediaPage
                    .goBack()
                    .searchArticle("A")
                    .checkSearchResult("First letter of the Latin alphabet");
        });
    }

}
