@header
Feature: Header

  User Story:
  As a user can see specified elements on header

  @TC-002
  Scenario: Verify that the user can see company logo
    When Users should click the link
    Then Users should reach home page
    Then Users should see the company logo

  @TC-004
  Scenario: Verify that the user can click logo
    When Users should click the link
    And Users should reach home page
    Then Users should click the company logo
    Then Users should be redirected home page

  @TC-005
  Scenario Outline: Verify that the user can see features orderly "SERVICES+, EXPERIENCE, COMPANY, CAREERS"
    When Users should click the link
    And Users should reach home page
    Then Users should see the features orderly such as SERVICES+, EXPERIENCE, COMPANY, CAREERS "<modules>"
    Examples:
      | modules    |
      | Services   |
      | Experience |
      | Company    |
      | Careers    |

