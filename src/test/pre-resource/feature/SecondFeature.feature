Feature: Here we learn about parameters

  Scenario: Steps with parameters
    Given open "chrome" browser
    When enter 10 form "cart"

    Scenario: Second scenario
      Given open "edge" browser
      When enter "username" and "password"

      Scenario: Third scenario
        Given open "firefox" browser
        When enter "username" and "password"

        Scenario: Fourth scenario
          Given open "chrome" browser
          When enter "invalidusername" and "invalidepassword"


  Scenario Outline: using outline and example
    Given open "<browser>" browser
    When enter "<username>" and "<password>"

    Examples:
    |username   | password   | browser |
    |ali        | password234| edge    |
    |arash      | password45 | chrome  |
    |mohammad   | mohammad233| firefox |



