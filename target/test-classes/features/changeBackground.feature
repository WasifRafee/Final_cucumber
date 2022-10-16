@Regression
Feature: Background color change functionality

Background:
Given User is on the Background color testing page

@ChangeToSkyBlue
Scenario: 1 User should be able change background color to SkyBlue
Given Set SkyBlue Background Button Exists
When User clicks on the SkyBlue Button
Then The background color will change to SkyBlue



@ChangeToWhite
Scenario: 2 User should be able to change background color to White
Given  Set SkyWhite Background button exists
When User clicks on the SkyWhite button
Then The background color will change to SkyWhite