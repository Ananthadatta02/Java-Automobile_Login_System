# Java Automobile Login System

This repository contains a Java-based application for a secure automobile login system using OTP verification. It demonstrates key concepts in object-oriented programming, such as encapsulation, class interaction, and validation logic, making it an excellent learning resource for beginner to intermediate Java developers.

---

## Project Overview

The **Java Automobile Login System** is a console-based application designed to simulate a vehicle management and secure login process. Users must enter a valid 10-digit mobile number, receive a randomly generated 4-digit OTP, and provide the correct OTP to log in successfully.

---

## Features

1. **Vehicle Details Management**:
   - The `Vehicle` class encapsulates information about a vehicle, such as its name, brand, color, cost, and engine type.
   - It demonstrates the use of constructors, getters, setters, and the `toString()` method for object representation.

2. **Login Functionality**:
   - Users enter a mobile number for validation.
   - If valid, a 4-digit OTP is generated using the `Random` class and displayed to the user.
   - The system validates the entered OTP against the generated OTP.

3. **Input Validation**:
   - Ensures the mobile number is 10 digits long and falls within a valid range.
   - Checks the correctness of the OTP entered by the user.

---

## Classes and Methods

### 1. `Vehicle` Class
The `Vehicle` class encapsulates all vehicle-related details:
- **Fields**:
  - `vehicleName` (String): Name of the vehicle.
  - `vehicleBrand` (String): Brand of the vehicle.
  - `vehicleColour` (String): Color of the vehicle.
  - `vehicleCost` (double): Cost of the vehicle.
  - `engineType` (String): Type of engine (e.g., Petrol, Diesel, Electric).

- **Methods**:
  - Constructor to initialize all fields.
  - Getter and Setter methods for each field.
  - `toString()` method for displaying vehicle details in a formatted string.

---

### 2. `Vehicle_Factory` Class
The `Vehicle_Factory` class handles the core logic of the application:
- **Fields**:
  - `List<Vehicle>`: Stores a list of `Vehicle` objects.
  - `Scanner`: Reads user input.

- **Methods**:
  - `login()`: Handles the mobile number validation and OTP verification.
  - `generateOTP()`: Generates a random 4-digit OTP.

---

### 3. `Vehicle_Main` Class
The `Vehicle_Main` class serves as the entry point of the application:
- Instantiates the `Vehicle_Factory` class.
- Prompts the user to log in and interact with the system.

---

## How It Works

1. **Login Process**:
   - The user is prompted to enter a 10-digit mobile number.
   - The number is validated to ensure it falls within the accepted range.
   - If valid, a 4-digit OTP is generated and displayed.
   - The user is prompted to enter the OTP.
   - If the entered OTP matches the generated OTP, the login is successful. Otherwise, the system displays an error.

2. **Vehicle Management**:
   - Although the application doesn’t currently manage vehicle data in this version, the `Vehicle` class lays the foundation for extending the application to include features like adding, updating, and viewing vehicles.

---

## Usage

1. Clone the repository:
   ```bash
   git clone https://github.com/Ananthadatta02/Java-Automobile_Login_System.git
2. Navigate to the project directory.
3. Compile and run the Vehicle_Main class:
```bash
javac Vehicle_Main.java
java Vehicle_Main
```
## Requirements

Java 8 or higher.
A Java IDE or terminal for execution.

## Repository Structure

/collection
  ├── Vehicle_Main.java       # Entry point of the application
  ├── Vehicle_Factory.java    # Core logic for login and OTP generation
  ├── Vehicle.java            # Vehicle details encapsulation


## Clone the Repository
Click [here](https://github.com/Ananthadatta02/Java-Automobile_Login_System.git) to view the project and clone the repository.

This README provides a detailed explanation of your code and repository structure, making it easier for others to understand and use your project.













C
