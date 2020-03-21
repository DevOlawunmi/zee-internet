Feature: View the redirection page

  As a user,
  I want to view the redirect page
  So I can check the status codes

  Scenario: User can successfully view the redirection page

    Given I navigate to the-internet.herokuapp.com
    When I click on the 'redirect link'
    Then the 'redirection page' is displayed
    And I click the link to trigger a redirection
