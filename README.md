# Car Classes Using Java

## Project Structure

    Vehicle.java      -> Abstract base class
    SUV.java          -> Extends Vehicle
    SportsCar.java    -> Extends Vehicle
    Hybrid.java       -> Extends Vehicle
    Demo.java         -> Main class to run the program

## Prerequisites

-   Java JDK 8 or higher installed
-   `javac` and `java` added to your system PATH

To verify installation:

    java -version
    javac -version

## How to Run the Program

### 1. Compile the Java Files

    javac *.java

### 2. Run the Program

    java Demo

## 💡 Expected Output

Each vehicle type prints its own implementation of the `forward()` and
`reverse()` methods, demonstrating runtime polymorphism.

Example:

    SUV Highlander moves forward in rough terrain.
    SUV Highlander reverses.

    SportsCar 911 accelerates forward rapidly.
    SportsCar 911 reverses.

    Hybrid Prius moves forward, optimizing between electric and fuel power.
    Hybrid Prius reverses.
