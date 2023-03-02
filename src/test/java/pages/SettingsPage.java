package pages;

import com.codeborne.selenide.SelenideElement;
import io.appium.java_client.AppiumBy;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class SettingsPage {

    private final SelenideElement TextView = $(AppiumBy.className("android.widget.TextView"));

    @Step("роверяем открытие вкладки настроек")
    public SettingsPage checkSettings() {
        TextView.shouldHave(text("Settings"));
        return this;
    }
}
