Feature:

  Scenario: Test scenario for web driver
    Given client open web page

  Scenario: Portnov responsive test
    Given client open portnov web page
    Then client set browser size to mobile

  Scenario: Iterate through elements
    Given client open test url for the form
    And I type "111" into all input fields
    Then I wait for 2 sec

  Scenario: Location strategy examples
    Given I open url "http://quote-stage.portnov.com/"
    Then I search for the element

  Scenario: Location strategy homework1
    Given I open url "http://quote-stage.portnov.com/"
    Then I search for the element
    Then I wait for 2 sec

