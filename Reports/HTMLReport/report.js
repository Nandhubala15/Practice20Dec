$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/FeatureFile/Flipkart.feature");
formatter.feature({
  "name": "",
  "description": "  Place different orders from Flipkart",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "",
  "description": "    Order Salwar Suits",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Reg"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "launch flipkart URL",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefiniFlipkart.launch_flipkart_URL()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Search Salwar suits",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefiniFlipkart.search_Salwar_suits()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Select a suit",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefiniFlipkart.select_a_suit()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "add into cart",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefiniFlipkart.add_into_cart()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Print the Order Details",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefiniFlipkart.print_the_Order_Details()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});