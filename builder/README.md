# Builder Pattern for Centralized Queueing System for Pag-Ibig Office
Welcome to my GitHub repository for a simple implementation of Builder Pattern. In this README, I'll provide a brief overview of the Builder Pattern and how it's applied in this project.

# What is the Builder Pattern?

The Builder Pattern is a creational design pattern used in object-oriented programming. It provides a way to construct a complex object step by step. The key idea behind the Builder Pattern is to separate the construction of a complex object from its representation, allowing the same construction process to create different representations.The Builder pattern ensures only one instance of a class exists and provides a global point of access to that instance. It restricts class instantiation to a single object, allowing widespread access across an application

# E-Commerce Problem

Imagine you're developing an e-commerce application where customers create accounts with varying levels of detail.

Initially, you use a standard constructor for the User class:

```
public User(String firstName, String lastName, String email,
           String address, String phone, int age) {
     // ...
}
```

However, you encounter challenges:

Registration forms: It's cumbersome to ensure users enter all fields in the correct order, leading to errors and frustration.
Optional fields: Not all customers provide complete information, but the constructor forces them to.
Data consistency: Changes to user profiles after registration can cause unexpected issues due to mutable fields.

# Implementation of Builder Pattern
In this project, I've applied the Builder Pattern for solving the problem. With this implementation, creating a User is now flexible.

![image](https://github.com/davidkingroderos/design-patterns/assets/75028710/d376cfae-cbcf-482c-b2ea-0c67a1a163f5)

# Benefits of the Builder Pattern

Builder Pattern is beneficial for creating complex objects with a step-by-step construction process, providing flexibility, readability, and encapsulation of construction details. It contributes to the creation of more maintainable, reusable, and testable code.

# UML Diagram
Here's a simplified UML diagram to help you visualize the structure of the Builder Pattern in this project:

![image](https://github.com/davidkingroderos/design-patterns/assets/75028710/b1be400c-cfcf-4b1a-bdf1-57108fd69800)

Feel free to explore the source code to see how these concepts are implemented in practice. If you have any questions or suggestions, please don't hesitate to open an issue or reach out to me.