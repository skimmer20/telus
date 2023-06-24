Feature: Amazon Test

  Scenario: Verify available items on Amazon using specific filter
    Given I navigate to the Amazon
    And I click on search bar
    And I type 'Portable Charger'
    And I click on search results
    And I select in 'Cell Phone Compatibility' the next items:
      | Apple iPhone |
    When I choose price range from '20' to '50' dollars in Price section
    Then I verify the prices for available items are between '20' and '50' dollars
    And I select item on position '5'