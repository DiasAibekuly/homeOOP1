# Hotel Management System

A console-based Java application for managing hotel room bookings, guests, and room inventory. This project demonstrates Object-Oriented Programming (OOP) principles and the use of Java Collections.

##  Features

* **Room Management:** Support for different room types (`StandardRoom` and `Suite`).
* **Booking System:** Create bookings by linking a guest to a room and automatically calculating the total cost based on duration.
* **Hotel Manager:**
    * Add new rooms to the inventory.
    * Search for a room by its number.
    * Filter rooms by maximum price.
    * Sort the room list by price (ascending).
* **Guest Information:** Store and manage guest details (Name, ID).

##  Tech Stack

* **Language:** Java (JDK 8+)
* **IDE:** IntelliJ IDEA
* **Key Concepts:**
    * **Inheritance & Polymorphism:** Abstract `Room` class with `StandardRoom` and `Suite` subclasses.
    * **Encapsulation:** Proper use of access modifiers, getters, and setters.
    * **Collections:** Usage of `ArrayList` and `Comparator` for sorting data.

##  Project Structure

* **Main.java** — Entry point of the application; demonstrates the system functionality.
* **HotelManager.java** — Manager class for handling the list of rooms and search/sort operations.
* **Booking.java** — Handles booking logic and cost calculation.
* **Room.java (Abstract)** — Base class for all room types.
* **StandardRoom.java / Suite.java** — specific room implementations with unique attributes (View, Jacuzzi).
* **Guest.java** — Represents a hotel guest.

##  How to Run

1.  Clone this repository or download the source code.
2.  Open the project in **IntelliJ IDEA**.
3.  Run the `Main.java` file.

##  Example Output

When running the application, it creates sample rooms and guests, processes bookings, and sorts the available rooms:

```text
=== Booking Details 1 ===
Guest: John Doe  ID-001
Accommodation: Room #101 [Standard (No View)] - $100.0
Duration: 3 nights
Total Cost: $300.0

=== Booking Details 2 ===
Guest: Alice Smith  ID-002
Accommodation: Room #202 [Luxury Suite (+Jacuzzi)] - $200.0
Duration: 2 nights
Total Cost: $400.0

=== Hotel Manager Functions ===
-> Sorted Rooms by Price:
Room #101 [Standard (No View)] - $100.0
Room #303 [Standard (City View)] - $150.0
Room #202 [Luxury Suite (+Jacuzzi)] - $200.0
