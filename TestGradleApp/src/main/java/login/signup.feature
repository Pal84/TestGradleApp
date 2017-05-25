Feature: Sign Up
 Scenario: When Tom is signing up
  Given valid "First Name", "Last Name", "E Mail Address" are given
  When "Tom" is clicking confirm button
  Then New user is successfully registered 