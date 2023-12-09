# Singleton Pattern for Centralized Queueing System for Pag-Ibig Office
Welcome to my GitHub repository for a simple implementation of a Centralized Queueing System for Pag-Ibig Office using Singleton Pattern. In this README, I'll provide a brief overview of the Singleton Pattern and how it's applied in this project.

# What is the Singleton Pattern?

The Singleton pattern ensures only one instance of a class exists and provides a global point of access to that instance. It restricts class instantiation to a single object, allowing widespread access across an application

# Centralized Queueing System for Pag-Ibig Office

The Pag-ibig office implements a centralized queuing system for three help desk stations. Individuals visiting the office obtain a queue number from this centralized system. Additionally, there's an online monitoring system that displays the current queued number in real-time for individuals monitoring the queue remotely.

Each help desk station has an option to reset the queuing number based on an inputted number, allowing flexibility in managing the queue during specific situations, such as reorganization or technical issues. This queuing system ensures a single centralized queue number for all help desk stations, while the reset option offers control and adjustment in exceptional circumstances.

This approach aims to maintain an organized queuing process for individuals visiting the office and provides the flexibility to handle queue adjustments as needed.

# Implementation of Centralized Queueing SyStem
In this project, I've applied the Singleton Pattern for creating a Centralized Queuing System for Pag-ibig Office. With this implementation, the clients only need one instance of the system.

![image](https://github.com/davidkingroderos/design-patterns/assets/75028710/d376cfae-cbcf-482c-b2ea-0c67a1a163f5)

# Benefits of the Singleton Pattern

The Singleton pattern ensures that only one instance of a class exists throughout the application's lifecycle. This approach provides a global point of access to that instance, enabling easy utilization across various parts of the codebase. It efficiently manages resources by centralizing control over object creation, allowing lazy initialization to optimize memory usage. Additionally, it offers a controlled way to manage shared resources and global settings. The Singleton pattern can also be designed to ensure thread safety in multi-threaded environments, while still offering flexibility for extensions or modifications without compromising the single instance paradigm.

# UML Diagram
Here's a simplified UML diagram to help you visualize the structure of the Singleton Pattern in this project:

![image](https://github.com/davidkingroderos/design-patterns/assets/75028710/e05bd3cf-cd33-4305-a527-ad57e6df6d03)

Feel free to explore the source code to see how these concepts are implemented in practice. If you have any questions or suggestions, please don't hesitate to open an issue or reach out to me.
