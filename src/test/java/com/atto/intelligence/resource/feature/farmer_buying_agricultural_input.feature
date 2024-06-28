Feature: Validate the pruchase of agricultural inputs

Scenario: Register a farmer in the system
    Given The user will be registered by providing their data.
    When registration to be carried out.
    Then It should appear as a message stating that the registration has been completed.

Scenario: Register product in the system
    Given the user is registering a product passing all the data to the system.
    When registration to be carried out.
    Then It should appear as a message stating that the registration has been completed.

Scenario: Select a registered product
    Given the user will list a product registered in the system.
    When the user will inform the name of the product to be listed.
    Then All information about the registered product will be listed.

Scenario: Payment for a product
    Given the user will finalize the customer's payment depending on the type of payment.
    When inform the payment method.
    Then If it is cash, you will have a discount and the fees must be calculated in advance.

Scenario: Finalizing the purchase
    Given the user when completing the customer's purchase.
    When payment for approved.
    Then the following message will appear Purchase made successfully!.


