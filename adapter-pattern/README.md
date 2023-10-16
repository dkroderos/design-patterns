# Command Pattern for Smart Home Automation System
Welcome to my GitHub repository for a simple implementation of a smart home program using the Command Pattern. In this README, I'll provide a brief overview of the Command Pattern and how it's applied in this project.

# What is the Command Pattern?
The Command Pattern is a behavioral design pattern that turns a request into a stand-alone object, which contains all the information about the request. This allows you to decouple the sender of a request from its receiver, providing greater flexibility and extensibility in your code.

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
In this project, I've applied the Command Pattern to create a simple smart home automation system. With this system, you can easily issue commands to control different smart devices in your home, such as lights, thermostats, and more.

![image](https://github.com/davidkingroderos/design-patterns/assets/75028710/8fdfc338-2f8f-40d5-aba7-e770d84deb27)


# How it Works
**Commands**: Each type of action you can perform on your smart devices is encapsulated as a Command object. For example, turning on the lights, adjusting the thermostat, or locking the door.

**Invoker**: The Invoker is responsible for invoking these Command objects. It doesn't need to know the specifics of how each command works; it just knows how to execute them.

**Receive**rs: These are the smart devices themselves. Each Command knows which Receiver it should interact with to perform the desired action.

By organizing your code in this way, you can easily add new commands and extend the functionality of your smart home system without modifying existing code.

# UML Diagram
Here's a simplified UML diagram to help you visualize the structure of the Command Pattern in this project:

![Blank diagram](https://github.com/davidkingroderos/design-patterns/assets/75028710/d71a4c72-3118-4e81-a1df-e6ea802e660d)


Feel free to explore the source code to see how these concepts are implemented in practice. If you have any questions or suggestions, please don't hesitate to open an issue or reach out to me.
