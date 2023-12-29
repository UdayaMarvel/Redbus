$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/BusTickets.feature");
formatter.feature({
  "name": "Book a Ticket",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@RedBus"
    }
  ]
});
formatter.background({
  "name": "Redbus Launch",
  "description": "",
  "keyword": "Background"
});
formatter.embedding("image/png", "embedded0.png", null);
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Launch the RedBus \"https://www.redbus.in\"",
  "keyword": "Given "
});
formatter.match({
  "location": "BookTickets.launch_the_red_bus(String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Book a Bus for Chennai To Thirunelveli",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@RedBus"
    },
    {
      "name": "@Bus"
    },
    {
      "name": "@Ta"
    }
  ]
});
formatter.step({
  "name": "User enters a From place in From Input TxBx With one dim list",
  "rows": [
    {
      "cells": [
        "Chennai",
        "Pondicherry",
        "Kanchipuram"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "BookTickets.user_enters_a_from_place_in_from_input_tx_bx_with_one_dim_list(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters a To place in To Input TxBx with one dim Map",
  "rows": [
    {
      "cells": [
        "place1",
        "Tirunelveli"
      ]
    },
    {
      "cells": [
        "place2",
        "Tanjavur"
      ]
    },
    {
      "cells": [
        "place3",
        "Goa"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "BookTickets.user_enters_a_to_place_in_to_input_tx_bx_with_one_dim_map(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Selects a date in the calendar dropdown",
  "keyword": "And "
});
formatter.match({
  "location": "BookTickets.user_selects_a_date_in_the_calendar_dropdown()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on search buses",
  "keyword": "And "
});
formatter.match({
  "location": "BookTickets.user_clicks_on_search_buses()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded1.png", null);
formatter.after({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "With Different Data",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Train"
    }
  ]
});
formatter.step({
  "name": "User enters a From place in From Input TxBx \"\u003cFromPlace\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "User enters a To place in To Input TxBx \"\u003cToPlace\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "User Selects a date in the calendar dropdown \"\u003cDate\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "User clicks on search buses",
  "keyword": "And "
});
formatter.step({
  "name": "Validate the From place, To place and Date",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "FromPlace",
        "ToPlace",
        "Date"
      ]
    },
    {
      "cells": [
        "Chennai",
        "Tanjavur",
        "15"
      ]
    },
    {
      "cells": [
        "Chennai",
        "Tirunelveli",
        "16"
      ]
    },
    {
      "cells": [
        "Chennai",
        "Madurai",
        "19"
      ]
    },
    {
      "cells": [
        "Chennai",
        "Goa",
        "18"
      ]
    }
  ]
});
formatter.background({
  "name": "Redbus Launch",
  "description": "",
  "keyword": "Background"
});
formatter.embedding("image/png", "embedded2.png", null);
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Launch the RedBus \"https://www.redbus.in\"",
  "keyword": "Given "
});
formatter.match({
  "location": "BookTickets.launch_the_red_bus(String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "With Different Data",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@RedBus"
    },
    {
      "name": "@Train"
    }
  ]
});
formatter.step({
  "name": "User enters a From place in From Input TxBx \"Chennai\"",
  "keyword": "When "
});
formatter.match({
  "location": "Outline.user_enters_a_from_place_in_from_input_tx_bx(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters a To place in To Input TxBx \"Tanjavur\"",
  "keyword": "And "
});
formatter.match({
  "location": "Outline.user_enters_a_to_place_in_to_input_tx_bx(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Selects a date in the calendar dropdown \"15\"",
  "keyword": "And "
});
formatter.match({
  "location": "Outline.user_selects_a_date_in_the_calendar_dropdown(String)"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchElementException: Unable to find element with locator By.xpath: //span[text()\u003d\u002715\u0027]\nFor documentation on this error, please visit: https://www.selenium.dev/documentation/webdriver/troubleshooting/errors#no-such-element-exception\nBuild info: version: \u00274.10.0\u0027, revision: \u0027c14d967899\u0027\nSystem info: os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002717.0.9\u0027\nDriver info: driver.version: RemoteWebDriver\r\n\tat org.openqa.selenium.remote.ElementLocation$ElementFinder$2.findElement(ElementLocation.java:168)\r\n\tat org.openqa.selenium.remote.ElementLocation.findElement(ElementLocation.java:59)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:350)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:344)\r\n\tat in.redbus.stepdefinition.Outline.user_selects_a_date_in_the_calendar_dropdown(Outline.java:62)\r\n\tat ✽.User Selects a date in the calendar dropdown \"15\"(file:src/test/resources/BusTickets.feature:23)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "User clicks on search buses",
  "keyword": "And "
});
formatter.match({
  "location": "BookTickets.user_clicks_on_search_buses()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Validate the From place, To place and Date",
  "keyword": "Then "
});
formatter.match({
  "location": "BookTickets.validate_the_from_place_to_place_and_date()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "error_message": "org.openqa.selenium.NoSuchWindowException: no such window: target window already closed\nfrom unknown error: web view not found\n  (Session info: MicrosoftEdge\u003d120.0.2210.91)\nBuild info: version: \u00274.10.0\u0027, revision: \u0027c14d967899\u0027\nSystem info: os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002717.0.9\u0027\nDriver info: org.openqa.selenium.edge.EdgeDriver\nCommand: [c5fc6e8e79fdae99f4532f502ffa5719, screenshot {}]\nCapabilities {acceptInsecureCerts: false, browserName: MicrosoftEdge, browserVersion: 120.0.2210.91, fedcm:accounts: true, ms:edgeOptions: {debuggerAddress: localhost:55685}, msedge: {msedgedriverVersion: 120.0.2210.91 (f469d579f138..., userDataDir: C:\\Users\\DABC\\AppData\\Local...}, networkConnectionEnabled: false, pageLoadStrategy: normal, platformName: windows, proxy: Proxy(), se:cdp: ws://localhost:55685/devtoo..., se:cdpVersion: 120.0.2210.91, setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:extension:minPinLength: true, webauthn:extension:prf: true, webauthn:virtualAuthenticators: true}\nSession ID: c5fc6e8e79fdae99f4532f502ffa5719\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:77)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:499)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:480)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:199)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:132)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:51)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:191)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.invokeExecute(DriverCommandExecutor.java:196)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:171)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:531)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:590)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:594)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.getScreenshotAs(RemoteWebDriver.java:316)\r\n\tat in.redbus.stepdefinition.Hooks.browserEnd(Hooks.java:25)\r\n\tat java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77)\r\n\tat java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.base/java.lang.reflect.Method.invoke(Method.java:568)\r\n\tat cucumber.runtime.Utils$1.call(Utils.java:26)\r\n\tat cucumber.runtime.Timeout.timeout(Timeout.java:16)\r\n\tat cucumber.runtime.Utils.invoke(Utils.java:20)\r\n\tat cucumber.runtime.java.JavaHookDefinition.execute(JavaHookDefinition.java:65)\r\n\tat cucumber.runner.HookDefinitionMatch.runStep(HookDefinitionMatch.java:16)\r\n\tat cucumber.runner.TestStep.executeStep(TestStep.java:65)\r\n\tat cucumber.runner.TestStep.run(TestStep.java:50)\r\n\tat cucumber.runner.TestCase.run(TestCase.java:50)\r\n\tat cucumber.runner.Runner.runPickle(Runner.java:50)\r\n\tat io.cucumber.junit.PickleRunners$NoStepDescriptions.run(PickleRunners.java:146)\r\n\tat io.cucumber.junit.FeatureRunner.runChild(FeatureRunner.java:68)\r\n\tat io.cucumber.junit.FeatureRunner.runChild(FeatureRunner.java:23)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat io.cucumber.junit.Cucumber.runChild(Cucumber.java:144)\r\n\tat io.cucumber.junit.Cucumber.runChild(Cucumber.java:65)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat io.cucumber.junit.Cucumber$RunCucumber.evaluate(Cucumber.java:174)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat org.apache.maven.surefire.junit4.JUnit4Provider.execute(JUnit4Provider.java:365)\r\n\tat org.apache.maven.surefire.junit4.JUnit4Provider.executeWithRerun(JUnit4Provider.java:273)\r\n\tat org.apache.maven.surefire.junit4.JUnit4Provider.executeTestSet(JUnit4Provider.java:238)\r\n\tat org.apache.maven.surefire.junit4.JUnit4Provider.invoke(JUnit4Provider.java:159)\r\n\tat org.apache.maven.surefire.booter.ForkedBooter.invokeProviderInSameClassLoader(ForkedBooter.java:384)\r\n\tat org.apache.maven.surefire.booter.ForkedBooter.runSuitesInProcess(ForkedBooter.java:345)\r\n\tat org.apache.maven.surefire.booter.ForkedBooter.execute(ForkedBooter.java:126)\r\n\tat org.apache.maven.surefire.booter.ForkedBooter.main(ForkedBooter.java:418)\r\n",
  "status": "failed"
});
formatter.background({
  "name": "Redbus Launch",
  "description": "",
  "keyword": "Background"
});
formatter.embedding("image/png", "embedded3.png", null);
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Launch the RedBus \"https://www.redbus.in\"",
  "keyword": "Given "
});
formatter.match({
  "location": "BookTickets.launch_the_red_bus(String)"
});
