## Use Case 2 – Basic Room Types & Static Availability

### Description

This use case introduces the **basic room types** available in the hotel system and demonstrates how rooms can be initialized using object-oriented design principles.

An abstract base class `Room` is used to define common attributes shared by all room types. Specific room types such as `SingleRoom`, `DoubleRoom`, and `SuiteRoom` extend this abstract class and initialize predefined values for beds, room size, and price per night.

Availability is represented using simple variables in the main class to demonstrate room initialization before implementing a centralized inventory management system.

### Room Types Implemented

* **SingleRoom**

  * Beds: 1
  * Size: 250 sqft
  * Price per night: 1500.0

* **DoubleRoom**

  * Beds: 2
  * Size: 400 sqft
  * Price per night: 2500.0

* **SuiteRoom**

  * Beds: 3
  * Size: 750 sqft
  * Price per night: 5000.0

### Program Output

```
Hotel Room Initialization

Single Room:
Beds: 1
Size: 250 sqft
Price per night: 1500.0
Available: 5

Double Room:
Beds: 2
Size: 400 sqft
Price per night: 2500.0
Available: 3

Suite Room:
Beds: 3
Size: 750 sqft
Price per night: 5000.0
Available: 2
```

### Concepts Demonstrated

* Abstract Classes
* Inheritance
* Constructor Initialization
* Object-Oriented Design
* Basic Room Modeling
