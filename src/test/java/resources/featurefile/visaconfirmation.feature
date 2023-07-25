Feature: Visa Check Test
  As a user I want to check visa on Gov UK

@smoke
  Scenario: An Australian coming to UK for tourism.
  Given I Click on start button
  When  I Select a Nationality 'Australia'
  And  I Click on Continue button
  And I Select reason 'Tourism'
  And Click on Continue button
  Then verify result 'You will not need a visa to come to the UK'
