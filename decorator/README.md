# Decorator Pattern for Digital Banking
Welcome to my GitHub repository for a simple implementation of a Digital Banking using the Decorator Pattern. In this README, I'll provide a brief overview of the Decorator Pattern and how it's applied in this project.

# What is the Decorator Pattern?

The Decorator Pattern is a behavioral design pattern that establishes a one-to-many dependency between objects, where changes in one object (the subject or publisher) result in the automatic notification and update of all dependent objects (Decorators or subscribers).

# Digital Banking

The goal is to design a Digital Banking for a media company. The system needs to notify subscribers about breaking news as soon as it's published by the news agency.

# Class Definitions:
Subject: an object that maintains a list of its dependents, also known as Decorators, and provides methods to add or remove Decorators. The subject notifies its Decorators automatically whenever its state changes.

Decorator: an object that is notified and updated by the subject whenever the state of the subject changes.

# Implementation of Simplified Hotel Management System
In this project, I've applied the Decorator Pattern to create a Digital Banking. With this implementation, the clients can easily subscribe and unsubscribe in various services.

![image](https://github.com/davidkingroderos/design-patterns/assets/75028710/80259536-7be1-4638-9d0c-2ba8154aafab)

# Benefits of the Decorator Design Pattern

This pattern promotes loose coupling between objects, as the subject doesn't need to know the specific details of its Decorators, only that they implement a common interface. It allows for a more dynamic relationship where many objects can observe a single subject, and any changes in the subject trigger updates in all connected Decorators.

The Decorator pattern is useful when there is a need to maintain consistency between related objects or when a change in one object should trigger changes in other objects without coupling them tightly together. Some examples of where the Decorator pattern might be used include monitoring changes in a model-view-controller (MVC) architecture, handling events in graphical user interfaces, or managing stock prices in financial applications.

# UML Diagram
Here's a simplified UML diagram to help you visualize the structure of the Decorator Pattern in this project:

![image](https://github.com/davidkingroderos/design-patterns/assets/75028710/e058f7a3-343f-49c1-9f7f-c57e662ed0af)

Feel free to explore the source code to see how these concepts are implemented in practice. If you have any questions or suggestions, please don't hesitate to open an issue or reach out to me.
