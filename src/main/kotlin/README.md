### INHERITANCE
### This refers to defining a new class(subclass) based on an existing class(superclass)
Subclass inherits all the functions and properties of superclass and it can also add new features or override
the properties and functions inherited from the superclass


1. Create a class Car with the following attributes: make, model, color, capacity.
   It has these functions:
- carry(people: Int) : Prints out “Carrying $people passengers” if the
  number of people is within its capacity else it prints out “Over capacity
  by $x people” where x is the number of people exceeding its capacity
  (3 points)
- identity() : Prints out the color, make and model in the following
  format e.g: “I am a white subaru legacy” (1 point)
- calculateParkingFees(hours: Int) : Calculates and returns the
  parking fees by multiplying the hours by 20 (1 point)

2. Create a class Bus with the same attributes and functions as the Car class.
   In addition, it has another method called maxTripFare(fare: Double) that
   calculates and returns the maximum amount of fare that can be collected per
   trip. (2 points)
   The bus’ calculateParkingFees method returns the product of hours and
   the capacity of the bus