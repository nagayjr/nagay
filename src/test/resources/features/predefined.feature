@Yahoo
Feature: Bing test 4 cucumber


  @regression
  Scenario: Predefined steps for Yahoo
    Given I open url "https://www.yahoo.com/"
    Then I should see page title as "Yahoo | Mail, Weather, Search, Politics, News, Finance, Sports & Videos"
    Then I type "Cucumber" into element with xpath "//*[@name='p']"
    Then I click on element with xpath "//button[@type='submit']"
    Then I wait for element with xpath "//*[@id='results']" to be present
    Then I should see page title contains "Cucumber - Yahoo Search Results"
    Then element with xpath "//*[@id='results']" should contain text "Cucumber"


    @gibiru
    Scenario: Gibiru scenario
      Given I open url "https://gibiru.com/"
      And element with xpath "//div/*[contains(text(), 'Mobile App')]" should be displayed
      Then I type "Behavior Driver Development" into element with xpath "//input[@id='q']"
      Then I click on element using JavaScript with xpath "//button[@type='submit']"
      Then element with xpath "//div[@id='web-results']" should contain text "Cucumber"
      Then I wait for 3 sec











