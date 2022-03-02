Feature: Calculator

 # Scenario Outline:
  #  Given I have first number <first>
   # Given I have second number <second>
    #When I <operation> the two numbers
    #Then I get the result <result>

    #Examples:
     # | first| second |operation | result |
      #| 40   | 20     |add       | 60     |
      #| 40   | 20     |subtract       | 20     |
      #| 40   | 20     |divide    | 2     |





  Scenario: Add two numbers
    Given I have first number
    * I have second number
    When I add the two numbers
    Then I get the result

#Scenario: Add my name
#Given my name is "Mini Hopp"
#When I ask to print my name
#Then "Mini Hopp" is printed

#Scenario: Add three numbers
#* I have third number 30.0
#When I add the three numbers
#Then I get the result 90.0



#Scenario: Subtract two numbers
##When I subtract the two numbers
#Then I get the result 20.0

#Scenario: Divide two numbers
#When I divide the two numbers
#Then I get the result 2.0