# Дипломный проект по тестирования мобильного приложения [Wikipedia](https://github.com/YevgeniyChuprov/diploma_project_mobile)

# <a name="Technology">Технологический стек</a>
<p  align="center">
  <code><img width="5%" title="IntelliJ IDEA" src="./images/icons/IDEA-logo.svg"></code>
  <code><img width="5%" title="Java" src="./images/icons/java-logo.svg"></code>
  <code><img width="5%" title="Selenide" src="./images/icons/selenide-logo.svg"></code>
  <code><img width="5%" title="Selenoid" src="./images/icons/selenoid-logo.svg"></code>
  <code><img width="5%" title="Gradle" src="./images/icons/gradle-logo.svg"></code>
  <code><img width="5%" title="JUnit5" src="./images/icons/junit5-logo.svg"></code>
  <code><img width="5%" title="Allure Report" src="./images/icons/allure-Report-logo.svg"></code>
  <code><img width="5%" title="Allure TestOps" src="./images/icons/allure-ee-logo.svg"></code>
  <code><img width="5%" title="Github" src="./images/icons/git-logo.svg"></code>
  <code><img width="5%" title="Jenkins" src="./images/icons/jenkins-logo.svg"></code>
  <code><img width="5%" title="Telegram" src="./images/icons/Telegram.svg"></code>
  <code><img width="5%" title="Telegram" src="./images/icons/Browserstack.svg"></code>
  <code><img width="5%" title="Telegram" src="./images/icons/Appium.svg"></code>
  <code><img width="5%" title="Telegram" src="./images/icons/Android-studio.svg"></code>
</p>

Написан на `Java` с использованием фреймворка `Selenide`
Применяется фреймворк для модульного тестирования `JUnit 5`
`Gradle` используется для автоматизированной сборки проекта
`Browserstack` - для запуска мобильных тестов удаленно.
`Android Studio tools`, `Appium` - для запуска мобильных тестов локально на эмуляторе мобильных устройств.
Системы `Allure Report` и `Allure testops` формирут отчет о запуске тестов
`Telegram`-бот отправляет уведомление о результатах прохождения тестов

# <a name="HowToRun">Содержание тест-кейсов</a>

- [x] Проверка поиска (iOS)
- [x] Поиск страницы BrowserStack
- [x] Открытие страницы настроек
- [x] Поиск страницы Api, проверка на странице


# Запуск тестов
Для запуска тестов android:
```shell
gradle clean android -Denv=android
```

Для запуска тестов iOS:
```shell
gradle clean ios -Denv=ios   
```

Для локального запуска тестов:
```shell
gradle clean android -Denv=local  
```


## <a name="GradleCommand">Запуск с параметрами:</a>
```bash
clean
test
${PLATFORM}
"-Denv=${PLATFORM}"

```
###    Параметры сборки
```PLATFORM``` – Выбор платформы на которой будут запускаться тесты.




### <img src="./images/icons/jenkins-logo.svg" width="50" height="50"/>  <a name="Запуск в Jenkins">Запуск в [Jenkins](https://jenkins.autotests.cloud/job/final_project_mobile_wiki/)</a>

Главная страница сборки:

<img src="./images/screens/jenkins_main.png" width="80%" height="80%"/>

Для запуска удаленных тестов необходимо заполнить параметры сборки:

<img src="./images/screens/jenkins_param.png" width="80%" height="80%"/>

### <img src="./images/icons/allure-Report-logo.svg" width="50" height="50"/> <a name="Сформированный отчет Allure Report">Сформированный отчет **[Allure Report](https://jenkins.autotests.cloud/job/final_project_lamoda/17/allure/)</a>**

Основной дашборд:

 <img src="./images/screens/allure_report.png" width="80%" height="80%"/>

Список тестов с результатами прогона:

 <img src="./images/screens/allure-behaviors.png" width="80%" height="80%"/>

### <img src="./images/icons/allure-ee-logo.svg" width="50" height="50"/> <a name="Интеграция с Allure TestOps">Интеграция с [Allure TestOps](https://allure.autotests.cloud/launch/19783)</a>

Основной дашборд:

<img src="./images/screens/allure_testops_report.png" width="80%" height="80%"/>

Список тестов с результатами прогона:

<img src="./images/screens/allure_testops_behaviors.png" width="80%" height="80%"/>

### <img src="./images/icons/Telegram.svg" width="50" height="50"/> Уведомления в Telegram с использованием бота

<img src="./images/screens/telegram.jpg" width="50%" height="50%" />  

К каждому тесту в отчете прилагается видео.
<p align="center">
  <img title="Selenoid Video" src="images/screens/test.gif">
</p>




