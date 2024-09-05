Feature: Title of your feature
  I want to use this template for my feature file

  @test
  Scenario: Add new customer to the portal
    Given login into the application with manager id
    When create a single customer with given details
      | customerName | gender | dob        | address    | city       | state | pin    | mobile     | email                  | password |
      | Amar         | M      | 17-03-1995 | Samastipur | Samastipur | Bihar | 848101 | 1234567890 | test38956928@gmail.com |   123456 |
    Then verify the creation message
    
#  @tag2
#  Scenario Outline: Title of your scenario outline
 #   Given I want to write a step with <name>
  #  When I check for the <value> in step
   # Then I verify the <status> in step
#
 #   Examples: 
  #    | name  | value | status  |
   #   | name1 |     5 | success |
    #  | name2 |     7 | Fail    |
