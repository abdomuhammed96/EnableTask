Feature: "Kader" Main Test Cases


  Scenario: Verify that homepage is opened successfully 
    When User opens Kader website
    Then Verify that the homepage is opened


  Scenario: Verify that user can navigate to "looking for a work" page
    When User opens Kader website
    And  clicks on looking for a work button
    Then Verify that the user can normally explore the looking for a work page








