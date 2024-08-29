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
---

- Тесты в данном проекте написаны на языке <code>Java</code> с использованием фреймворка для тестирования [Selenide](https://selenide.org/), c применением паттерна Page Object.
- Сборщик - <code>Gradle</code>.
- <code>JUnit 5</code> задействован в качестве фреймворка модульного тестирования.
- При прогоне тестов для запуска используется [Android Studio](https://developer.android.com/), [Browserstack](https://www.browserstack.com/), драйвер Appium.
- В отчетах Allure для каждого теста (запускаемого удаленно) прикреплено видео прохождения теста.
---

<a id="tools"></a>

## 🔨 Технологии и инструменты:

<p align="left">
<a href="https://allurereport.org/"><img align="center" src="media/logo/Allure_Report.svg" height="40" width="40"></a>
<a href="https://gradle.org/"><img align="center" src="media/logo/gradle-original.svg" height="40" width="40"></a>
<a href="https://developer.android.com/"><img align="center" src="media/logo/androidStudio.svg" height="40" width="40"></a>
<a href="https://www.java.com/"><img align="center" src="media/logo/java-original-wordmark.svg" height="40" width="40"></a>
<a href="https://www.jenkins.io/"><img align="center" src="media/logo/jenkins-original.svg" height="40" width="40"></a>
<a href="https://junit.org/junit5/"><img align="center" src="media/logo/junit-original.svg" height="40" width="40"></a>
<a href="https://selenide.org/"><img align="center" src="media/logo/Selenide.svg" height="40" width="40"></a>
<a href="https://www.browserstack.com/"><img align="center" src="media/logo/browserstack.svg" height="40" width="40"></a>
<a href="https://appium.io/"><img align="center" src="media/logo/appium.svg" height="40" width="40"></a>
<a href="https://qameta.io/"><img align="center" src="media/logo/allureTe.svg" height="40" width="40"></a>
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
```

### Локальный запуск (через реальный девайс)

```bash
gradle clean test -DdeviceHost=real
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
<img src="media/screen/telegram.jpg" alt="Telegram" width="500" height="400">
</p>


#### Содержание уведомления в Telegram

- :heavy_check_mark: Окружение
- :heavy_check_mark: Комментарий
- :heavy_check_mark: Длительность прохождения тестов
- :heavy_check_mark: Общее количество сценариев
- :heavy_check_mark: Процент прохождения тестов
- :heavy_check_mark: Ссылка на Allure отчет

---