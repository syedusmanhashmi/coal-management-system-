---

# Coal Management System

This project is a simple Java application that demonstrates the core concepts of **Object-Oriented Programming (OOP)** and **Multithreading**.

The system simulates a coal mining company, managing its employees, coal production, and transportation.

### Key Concepts Covered:
- **Inheritance:** `CoalMine` class inherits from the base `Company` class.
- **Composition:** A `CoalMine` has a `Coal` object, representing coal details.
- **Aggregation:** A `CoalMine` aggregates multiple `Employee` objects.
- **Multithreading:** `CoalTransportThread` simulates the process of transporting coal asynchronously.
  
### Classes Overview:
- **Company:** Base class containing basic company information (name and location).
- **CoalMine:** Inherits from `Company`, manages coal details and employees.
- **Coal:** Represents the type and quantity of coal in the mine.
- **Employee:** Represents an individual employee.
- **CoalTransportThread:** Simulates coal transportation using Java threads.
- **CoalManagementSystem:** The main class to test the system.

### Features:
- Display full mine details including company information, coal type, and employee list.
- Simulate concurrent transportation of coal using multiple threads.

### How to Run:
- Compile all `.java` files.
- Run the `CoalManagementSystem` class to see the system in action.

---

