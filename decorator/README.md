# Decorator Pattern for Digital Banking
Welcome to my GitHub repository for a simple implementation of a Digital Banking using the Decorator Pattern. In this README, I'll provide a brief overview of the Decorator Pattern and how it's applied in this project.

# What is the Decorator Pattern?

The Decorator Pattern is a structural design pattern in object-oriented programming that allows behavior to be added to individual objects, dynamically, without affecting the behavior of other objects from the same class.

# Digital Banking

CIMB is a digital bank that offers GSave and UpSave savings accounts.   As with a typical Savings Account, it contains accountNumber, accountName, and a balance for that account.

# Class Definitions:

The typical savings account offers an interest rate of 1%.
The benefits of the typical savings account is the same with the "Standard Savings Account" as compared to other banks.

The GSave account offers an interest rate of 2.5%.
Benefits include the "Standard Savings Account" plus access to "GCash transfer".

The UpSave account offers the highest interest rate of 4.0%.
Benefits include the "Standard Savings Account" plus "with Insurance".

# Description of the following methods

`showAccountType()` - Either returns "Savings Account", "GSave" or "UpSave"

`getInterestRate()` - Either returns 1% for Savings Account; 2.5% for GSave; 4.0% UpSave

`getBalance()` - Returns the balance of the account set.

`showBenefits()` - Either returns "Standard Savings Account" for Savings Account; benefits offered by savings account + "GSave Transfer"; benefits offered by savings account + "With Insurance";
                            
`computeBalanceWithInterest()` - returns new balance by computing the balance plus the interest depending on the interest rate.

`showInfo()` - Returns details of account number, account name, and balance.

# Implementation of Digital Banking
In this project, I've applied the Decorator Pattern to create a Digital Banking.

![image](https://github.com/davidkingroderos/design-patterns/assets/75028710/611e00a6-8f5b-4fbe-bd86-9d597aa28e68)

# Benefits of the Decorator Design Pattern

The Decorator Design Pattern provides a flexible and dynamic way to add new behaviors or functionalities to objects without altering their structure. It enables the enhancement of individual objects' functionality at runtime by wrapping them with one or more decorators.

By using decorators, you can extend the functionality of objects without subclassing them excessively or modifying their code directly. This promotes code reuse, as decorators can be stacked or combined to create different combinations of functionalities. Additionally, it allows for a more modular and cohesive codebase, as each decorator focuses on a specific responsibility, making it easier to manage and maintain the code.

# UML Diagram
Here's a simplified UML diagram to help you visualize the structure of the Decorator Pattern in this project:

![image](https://github.com/davidkingroderos/design-patterns/assets/75028710/89326b18-f39a-4097-8c00-1428dc121ffa)

Feel free to explore the source code to see how these concepts are implemented in practice. If you have any questions or suggestions, please don't hesitate to open an issue or reach out to me.
