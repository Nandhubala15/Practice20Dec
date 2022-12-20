$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/FeatureFile/Flipkart.feature");
formatter.feature({
  "name": "",
  "description": "  Place different orders from Flipkart",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Sanity"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Launch meesho url",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefiniFlipkart.launch_meesho_url()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Search smart Watch",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefiniFlipkart.search_smart_Watch()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Scroll down",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefiniFlipkart.scroll_down()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "select any smart watch",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefiniFlipkart.select_any_smart_watch()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "print the product Details",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefiniFlipkart.print_the_product_Details()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Buy",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefiniFlipkart.buy()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter Mobile Number",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefiniFlipkart.enter_Mobile_Number()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter details",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefiniFlipkart.enter_details()"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchElementException: Unable to find element with locator By.xpath: //span[text()\u003d\u0027Name\u0027]\nFor documentation on this error, please visit: https://selenium.dev/exceptions/#no_such_element\nBuild info: version: \u00274.4.0\u0027, revision: \u0027e5c75ed026a\u0027\nSystem info: host: \u0027DESKTOP-P23JR2D\u0027, ip: \u0027192.168.43.111\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_341\u0027\nDriver info: driver.version: RemoteWebDriver\r\n\tat org.openqa.selenium.remote.ElementLocation$ElementFinder$2.findElement(ElementLocation.java:165)\r\n\tat org.openqa.selenium.remote.ElementLocation.findElement(ElementLocation.java:60)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:365)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:357)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:70)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:39)\r\n\tat com.sun.proxy.$Proxy22.sendKeys(Unknown Source)\r\n\tat org.stepdefinition.StepDefiniFlipkart.enter_details(StepDefiniFlipkart.java:132)\r\n\tat ✽.enter details(file:src/test/resources/FeatureFile/Flipkart.feature:21)\r\n",
  "status": "failed"
});
formatter.after({
  "status": "passed"
});
});