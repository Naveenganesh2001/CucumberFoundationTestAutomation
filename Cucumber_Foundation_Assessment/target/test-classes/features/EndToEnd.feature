Feature: Verify end to end scenarios of the application

  @Smoke
  Scenario: Verify user can place order
    Given user open website
    Then verify user is on homepage
    When user enter details with source "Coimbatore"  and destination "Thiruvananthapuram"
    When user enter date and click on search button
    Then verify user is on Bus Details page
    When user click on view seats
    Then verify seat is displayed
    And click on modify




