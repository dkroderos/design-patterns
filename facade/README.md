# Facade Pattern for Simplified Hotel Management System
Welcome to my GitHub repository for a simple implementation of a smart home program using the Facade Pattern. In this README, I'll provide a brief overview of the Facade Pattern and how it's applied in this project.

# What is the Facade Pattern?
Facad Pattern simplifies how different parts of a system interact. It's a go-between, making things easier by providing a straightforward interface for users to deal with, hiding all the messy details behind it.

# Simplified Hotel Management System

The HotelApp needs to manage various hotel services for guest check-in and check-out. These services include valet parking for vehicles, room cleaning, and handling luggage carts. However, the HotelApp aims to interact with these services through a simplified, single interface provided by the FrontDesk. The FrontDesk class should delegate the client's requests to the appropriate service classes (Valet, HouseKeeping, Cart) while abstracting the service details from the client.

# Class Definitions:
HotelService (Interface): Defines the common interface for all hotel services.

Valet: A service class implementing the HotelService interface, responsible for vehicle valet parking and pick-up. It includes the pickUpVehicle(plateNumber) method.

HouseKeeping: A service class implementing the HotelService interface, responsible for room cleaning. It includes the cleanRoom(roomNumber) method.

Cart: A service class implementing the HotelService interface, responsible for handling luggage cart requests. It includes the requestCart(numberOfCarts) method.

FrontDesk: The facade class that coordinates interactions between the client (HotelApp) and the individual hotel services.

HotelApp: The client class that uses the FrontDesk facade to access and utilize hotel services seamlessly.

# Implementation of Simplified Hotel Management System
In this project, I've applied the Facade Pattern to create a simple simplified hotel management system. With this system, you can easily interact with the services of the hotel by just interacting in the front desk.

![image](https://github.com/davidkingroderos/design-patterns/assets/75028710/4686f5aa-3dcd-45c7-abb9-8b167ee1cc0b)

# Benefits of the Facade Design Pattern

The Facade Design Pattern offers a number of benefits, including:

Reduced Complexity: The Facade Design Pattern hides the complexities of the subsystem from the client, making it easier for the client to use.
Improved Maintainability: The Facade Design Pattern makes it easier to maintain the subsystem by encapsulating its complexity.
Increased Reusability: The Facade Design Pattern makes the subsystem more reusable by providing a unified interface.
Potentially Improved Performance: The Facade Design Pattern can potentially improve performance by caching results or optimizing the order in which operations are performed.

# UML Diagram
Here's a simplified UML diagram to help you visualize the structure of the Facade Pattern in this project:

![Blank diagram (3)](https://github.com/davidkingroderos/design-patterns/assets/75028710/e539685b-5be8-4773-bb8a-c6d61060bbad)

Feel free to explore the source code to see how these concepts are implemented in practice. If you have any questions or suggestions, please don't hesitate to open an issue or reach out to me.
