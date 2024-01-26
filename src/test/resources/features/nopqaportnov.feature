Feature: Store stage test

  @e2e_Macbook
  Scenario: Macbook e2e scenario
    Given I open url "https://nop-qa.portnov.com/"
    Then I wait for 2 sec
    Then element with xpath "//a[contains(text(),'Apple')]" should be displayed
    Then I click on element using JavaScript with xpath "//a[contains(text(), 'Apple')]"
    Then element with xpath "//div[contains(@class, 'product-review-links')]" should not contain text "0"
    Then I clear element with xpath "//input[@aria-label='Enter a quantity']"
    Then I type "3" into element with xpath "//input[@aria-label='Enter a quantity']"
    Then I click on element with xpath "//div[contains(@class, 'overview')]//button[contains(text(), 'Add to cart')]"
    And I wait for element with xpath "//div[contains(@class, 'bar-notification')][contains(@class, 'success')]" to be present
    And element with xpath "//div[contains(@class, 'bar-notification')][contains(@class, 'success')]" should contain text "added"
    And I wait for 3 sec
    And I click on element with xpath "//a/span[contains(text(), 'Shopping cart')]"
    And element with xpath "//td[contains(@class, 'subtotal')]/span" should contain text "$5,400.00"
    Then I wait for 2 sec
    And I take screenshot






