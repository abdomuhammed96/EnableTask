Feature: "Jawwy TV" Main Test Cases


  Scenario: Validate the Subscription Packages for UAE
    When User opens Jawwy TV website
    And Changes country to be "UAE"
    Then Verify Subscription Packages type
    And Verify Subscription Packages Currency for "UAE"
    And Verify Subscription Packages Price for "UAE"

  Scenario: Validate the Subscription Packages for Algeria
    When User opens Jawwy TV website
    And Changes country to be "Algeria"
    Then Verify Subscription Packages type
    And Verify Subscription Packages Currency for "Algeria"
    And Verify Subscription Packages Price for "Algeria"

  Scenario: Validate the Subscription Packages for Jordan
    When User opens Jawwy TV website
    And Changes country to be "Jordan"
    Then Verify Subscription Packages type
    And Verify Subscription Packages Currency for "Jordan"
    And Verify Subscription Packages Price for "Jordan"










