#@quote-feature2
#Feature:quote project tests
#
#  @quote-feature2
#  Scenario:  (Smoke Test) Fill out the Required Fields of Quote and
#  arrive on the Confirmation Page
#    Given I visit Quote Page in the "QA" Environment
#    When I enter "username" for the Username field
#    And I enter "first" for first name and "last" for the last name in the Name field
#    And I enter "123@email.com" for the Email field
#    When I enter "password" for the Password field
#    And I enter "password" for the Confirm Password field
#    Then I "check" the Privacy Policy Policy checkbox
#    When I click on the "Send" button at the bottom of the page
#    Then I verify we see the Submitted Application Page

  @quote-feature3
  Feature: Store stage test

  @quote-feature3
  Scenario: (Smoke Test) HTC scenario
    Given I open Nop "QA" Portnov page
    When I enter "HTC" add to card
    Then I wait to "results" to be present
    Then I click on "shopping cart"
