Feature: Verify data driven testing

  Scenario Outline: Verify user can place order
    Given user open website
    Then verify user is on homepage
    When user enter details with source "<source>"  and destination "<destination>"
    When user enter date and click on search button
    Then verify user is on Bus Details page

    Examples:
      | source     | destination        |
      | Coimbatore | Thiruvananthapuram |
      | Coimbatore | Chennai            |
      | Chennai    | Thiruvananthapuram |