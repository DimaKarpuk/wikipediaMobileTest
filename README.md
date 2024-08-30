# Проект по автоматизации mobile тестов для приложения [Wikipedia](https://ru.wikipedia.org/)
<p align="center"><a href="https://ru.wikipedia.org/"><img src="media/logo/wikipedia.png" align="center" width="300" height="300" alt="Wiki"/></a></p>  

> Википедия - общедоступная многоязычная универсальная интернет-энциклопедия со свободным контентом, реализованная на принципах вики.

# 🧾 Содержание:

- <a href="#tools">Технологии и инструменты</a>
- <a href="#checking">Тестовые сценарии, реализованные в автоматизированных тест-кейсах</a>
- <a href="#jenkins">Сборка в Jenkins</a>
- <a href="#console">Запуск тестов (Из терминала)</a>
- <a href="#allureReport">Allure-отчет</a>
- <a href="#allure">Интеграция с Allure TestOps</a>
- <a href="#teleg"> Уведомление в Telegram о результатах выполнения автоматизированных тестов</a>
- <a href="#gif"> Пример видео запуска теста</a>
---

- Тесты в данном проекте написаны на языке <code>Java</code> с использованием фреймворка для тестирования [Selenide](https://selenide.org/), c применением паттерна Page Object.
- Сборщик - <code>Gradle</code>.
- <code>JUnit 5</code> задействован в качестве фреймворка модульного тестирования.
- При прогоне тестов для запуска используется [Android Studio](https://developer.android.com/), [Browserstack](https://www.browserstack.com/), драйвер Appium.
- В отчетах Allure для каждого теста (запускаемого удаленно) прикреплено видео прохождения теста.
---

<a id="tools"></a>

## 🔨 Технологии и инструменты:

<p align="center">
<a href="https://qameta.io/"> <img src="media/logo/allureTe.svg" title="Appium" alt="Appium" width="40" height="40"/> </a>
<a href="https://appium.io/"> <img src="media/logo/appium.svg" title="Appium" alt="Appium" width="40" height="40"/> </a>
<a href="https://www.w3schools.com/java/"> <img src="https://cdn.jsdelivr.net/gh/devicons/devicon@latest/icons/java/java-original.svg" title="Java" alt="Java" width="40" height="40"/> </a> 
<a href="https://www.jetbrains.com/idea/"> <img src="https://cdn.jsdelivr.net/gh/devicons/devicon@latest/icons/intellij/intellij-original.svg" title="IntelliJ Idea" alt="IntelliJ Idea" width="40" height="40"/> </a> 
<a href="https://www.android.com/"> <img src="https://cdn.jsdelivr.net/gh/devicons/devicon@latest/icons/android/android-original.svg" title="Android" alt="Android" width="40" height="40"/> </a> 
<a href="https://developer.android.com/studio"> <img src="https://cdn.jsdelivr.net/gh/devicons/devicon@latest/icons/androidstudio/androidstudio-original.svg" title="Android Studio" alt="Android Studio" width="40" height="40"/> </a> 
<a href="https://git-scm.com/"> <img src="https://cdn.jsdelivr.net/gh/devicons/devicon@latest/icons/git/git-original.svg" title="Git" alt="Git" width="40" height="40"/> </a> 
<a href="https://junit.org/junit5"> <img src="https://cdn.jsdelivr.net/gh/devicons/devicon@latest/icons/junit/junit-original.svg" title="JUnit5" alt="JUnit5" width="40" height="40"/> </a>
<a href="https://www.browserstack.com/"> <img src="https://cdn.jsdelivr.net/gh/devicons/devicon@latest/icons/browserstack/browserstack-original.svg" title="Browserstack" alt="Browserstack" width="40" height="40"/> </a>
<a href="https://gradle.org"> <img src="https://cdn.jsdelivr.net/gh/devicons/devicon@latest/icons/gradle/gradle-original.svg" title="Gradle" alt="Gradle" width="40" height="40"/> </a>
<a href="https://www.jenkins.io"> <img src="https://cdn.jsdelivr.net/gh/devicons/devicon@latest/icons/jenkins/jenkins-original.svg" title="Jenkins" alt="Jenkins" width="40" height="40"/> </a>
</p>

---
<a id="checking"></a>
## :clipboard: Тестовые сценарии

- :white_check_mark: Тест стартовых страниц при запуске приложения
- :white_check_mark: Тест главного меню приложения
- :white_check_mark: Тест на регистрацию
---

<a id="jenkins"></a>
## <img src="media/logo/jenkins-original.svg" width="25" height="25"/> Сборка в [Jenkins](https://jenkins.autotests.cloud/job/MobileTest_KarpukD27/)

<p align="center">
<img src="media/screen/jenkins.png" alt="Jenkins Page" width="1000" height="350">
</p>

---

<a id="console"></a>
## :rocket: Команды для запуска

### Локальный запуск (через эмулятор)

```bash
gradle clean test -DdeviceHost=emulation 
-DdeviceName=
-DplatformVersion=
-DmobileUrl= 
```

### Локальный запуск (через реальный девайс)

```bash
gradle clean test -DdeviceHost=real
-DdeviceName=
-DmobileUrl=

```

> Для запуска локальных тестов требуются следующие установленные программы на компьютере: Appium Server, Appium и Android Studio

### Удаленный запуск (через browserstack)

```bash
gradle clean test -DdeviceHost=browserstack
```
---

<a id="allureReport"></a>
## <img alt="Allure" height="25" src="media/logo/Allure_Report.svg" width="25"/> </a>Интеграция с <a target="_blank" href="https://jenkins.autotests.cloud/job/MobileTest_KarpukD27/15/allure/">Allure Report</a>

## 🖨️ Основная страница отчёта

<p align="center">  
<img title="Allure Overview Dashboard" src="media/screen/allureReport.png" width="850">  
</p>  

## 📄 Тест-кейсы

<p align="center">  
<img title="Allure Tests" src="media/screen/allureReport1.png" width="850">   
</p>

---

<a id="allure"></a>
## <img alt="Allure_TO" height="25" src="media/logo/allureTe.svg" width="25"/> </a>Интеграция с <a target="_blank" href="https://allure.autotests.cloud/project/4412/dashboards">Allure TestOps</a>

## 🖨️ Основная страница отчёта

<p align="center">  
<img title="Allure TestOps Dashboard" src="media/screen/allureTest.png" width="850">  
</p>  

## 📄 Авто тест-кейсы

<p align="center">  
<img title="Allure Tests" src="media/screen/allureTest1.png" width="850">  
</p>

---

<a id="teleg"></a>
## <img src="media/logo/Telegram_2019_Logo.svg" width="25" height="25"/> Уведомления в Telegram чат с ботом

### Уведомление через чат бот

<p align="center">
<img src="media/screen/telegram.jpg" alt="Telegram" width="430" height="400">
</p>


#### Содержание уведомления в Telegram

- :heavy_check_mark: Окружение
- :heavy_check_mark: Комментарий
- :heavy_check_mark: Длительность прохождения тестов
- :heavy_check_mark: Общее количество сценариев
- :heavy_check_mark: Процент прохождения тестов
- :heavy_check_mark: Ссылка на Allure отчет

---
<a id="gif"></a>
####  Пример видео запуска теста
<p align="center">
  <p align="center">
<img title="Browserstack Video" src="media/gif/test.gif" width="500" height="500"  alt="video">   
</p>
