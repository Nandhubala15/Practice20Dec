Feature: 
  Place different orders from Flipkart
@Reg
  Scenario: 
    Order Salwar Suits

    Given launch flipkart URL
    When Search Salwar suits
    And Select a suit
    And add into cart
    Then Print the Order Details
@Sanity
  Scenario: 
    Given Launch meesho url
    When Search smart Watch
    And Scroll down
    And select any smart watch
    Then print the product Details
    And Buy
    And Enter Mobile Number
    And enter details
