$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("changeBackground.feature");
formatter.feature({
  "line": 2,
  "name": "Background color change functionality",
  "description": "",
  "id": "background-color-change-functionality",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Regression"
    }
  ]
});
formatter.before({
  "duration": 1643606200,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "User is on the Background color testing page",
  "keyword": "Given "
});
formatter.match({
  "location": "ChangeBackgroundStepDefinition.user_is_on_the_Background_color_testing_page()"
});
formatter.result({
  "duration": 325290000,
  "status": "passed"
});
formatter.scenario({
  "line": 16,
  "name": "2 User should be able to change background color to White",
  "description": "",
  "id": "background-color-change-functionality;2-user-should-be-able-to-change-background-color-to-white",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 15,
      "name": "@ChangeToWhite"
    }
  ]
});
formatter.step({
  "line": 17,
  "name": "Set SkyWhite Background button exists",
  "keyword": "Given "
});
formatter.step({
  "line": 18,
  "name": "User clicks on the SkyWhite button",
  "keyword": "When "
});
formatter.step({
  "line": 19,
  "name": "The background color will change to SkyWhite",
  "keyword": "Then "
});
formatter.match({
  "location": "ChangeBackgroundStepDefinition.set_SkyWhite_Background_button_exists()"
});
formatter.result({
  "duration": 56095700,
  "status": "passed"
});
formatter.match({
  "location": "ChangeBackgroundStepDefinition.user_clicks_on_the_SkyWhite_button()"
});
formatter.result({
  "duration": 32879200,
  "status": "passed"
});
formatter.match({
  "location": "ChangeBackgroundStepDefinition.the_background_color_will_change_to_SkyWhite()"
});
formatter.result({
  "duration": 29666000,
  "status": "passed"
});
formatter.after({
  "duration": 609882200,
  "status": "passed"
});
});