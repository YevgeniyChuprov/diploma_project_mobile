package tests;

import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.SettingsPage;
import pages.WikipediaPage;

import static io.qameta.allure.Allure.step;

@Epic("Android")
public class AndroidTests extends TestBase {

    WikipediaPage wikipediaPage = new WikipediaPage();
    SettingsPage settingsPage = new SettingsPage();

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
    @Feature("Setting")
    @Tag("android")
    @DisplayName("Открытие страницы настроек")
    void openSettingPage() {
        wikipediaPage
                .goBack()
                .clickMore()
                .clickSettings();

        settingsPage.checkSettings();
    }

    @Test
    @Feature("Search")
    @Tag("android")
    @DisplayName("Поиск страницы Microsoft, проверка на странице")
    void checkDescriptionTest() {
        step("Тестируем страницу Microsoft", () -> {
            wikipediaPage
                    .goBack()
                    .searchArticle("Api")
                    .checkSearchResult("Software interface between computers and/or programs")
                    .checkTextOnArticlePage();
        });
    }
}
