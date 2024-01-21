# Adapter Pattern Implementation
Welcome to my GitHub repository for a simple implementation of plugging devices into power outlets using the Adapter Pattern. In this README, I'll provide a brief overview of the Adapter Pattern and how it's applied in this project.

# What is the Adapter Pattern?

The Adapter Design Pattern is a structural pattern that allows objects with incompatible interfaces to work together. It acts as a bridge between two interfaces, making them compatible without modifying their source code. The adapter pattern is commonly used to facilitate the interaction between different systems or classes that cannot communicate directly due to incompatible interfaces.

In simpler terms, it helps you encapsulate actions as objects, making it easy to manage and execute various operations without directly invoking them.

# Plugging Devices into Power Outlets

You are developing an application that helps users manage and control various electronic devices by plugging them into power outlets. Each device has different plug types, voltage, and amperage requirements. To ensure compatibility and safety, you need to create adapters for different devices to allow them to be plugged into standard power outlets.

## Adaptee Objects:

1. Laptop - Represents a laptop device that needs to be plugged into a power source. It has the charge() method.

2. Refrigerator - Represents a refrigerator device that requires a power source. It has the startCooling() method.

3. SmartphoneCharger - Represents a smartphone charger that needs to be plugged in for charging. It has the chargePhone() method.

## Target Object:

1. PowerOutlet - Represents a standard power outlet with a common interface for plugging in devices. It defines the plugIn() method as the target method.

## Adapter Objects:

1. LaptopAdapter - An adapter for plugging a laptop into a standard power outlet. It adapts the Laptop to the PowerOutlet interface, translating plugIn() to charge().

2. RefrigeratorAdapter - An adapter for plugging a refrigerator into a standard power outlet. It adapts the Refrigerator to the PowerOutlet interface, translating plugIn() to startCooling().

3. SmartphoneAdapter - An adapter for plugging a smartphone charger into a standard power outlet. It adapts the SmartphoneCharger to the PowerOutlet interface, translating plugIn() to chargePhone().

# Implementation of the Adapter Pattern
In this project, I've applied the Adapter Pattern to create a simple plugging devices in to power outlets. With this example, you can effectively integrate and make disparate interfaces function harmoniously.

![Preview](https://github.com/davidkingroderos/design-patterns/assets/75028710/f680a1c5-0f57-4c1f-8382-f0e841f8266b)

# How it Works
**Target**: The target is the interface that the client code expects and interacts with. This is the interface that the adapter will conform to, allowing the client to use the adapter as if it were an instance of the target interface.

**Adaptee**: The adaptee is the class or interface that needs to be integrated or adapted. It has an interface that is incompatible with the client's expectations.

**Adapter**: The adapter is a class that implements the target interface and acts as a wrapper for the adaptee. It translates or adapts the methods of the adaptee to the target interface. The adapter is responsible for delegating calls from the client to the adaptee.

# UML Diagram
Here's a simplified UML diagram to help you visualize the structure of the Adapter Pattern in this project:

![UML Diagram](https://github.com/davidkingroderos/design-patterns/assets/75028710/519c8315-47bd-441f-8317-4c55d2c67b13)

Feel free to explore the source code to see how these concepts are implemented in practice. If you have any questions or suggestions, please don't hesitate to open an issue or reach out to me.
