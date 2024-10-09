Feature:Here we learn about parameters
  Background:

  Scenario: Steeps with parameters
    Given open "chrome" browser
    When enter 10 from "cart"

  Scenario: second scenario
    Given open "edge" browser

  Scenario Outline: multiple scenario
    Given open "<browser>" browser
    When enter "<username>" and "<password>"
    Examples:
    |username|password|browser|
    |Mahdi|password123| edge  |
    |john | wrongpass | chrome|
    |sarah | password |firefox|