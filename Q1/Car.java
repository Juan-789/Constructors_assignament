//Create a program that has a class called "Car" that models a car. The class should have the following attributes:

// make (String): The make of the car.
// model (String): The model of the car.
// year (int): The year the car was made.

// The class should have a constructor that takes in a String for make, a String for model, and an int for year. 
//The constructor should set the values of the attributes based on the arguments passed in.

// In addition to the constructor, the class should have the following methods:

// getMake(): Returns the make of the car as a String.
// getModel(): Returns the model of the car as a String.
// getYear(): Returns the year of the car as an int.
// setMake(String make): Sets the make of the car to the specified String.
// setModel(String model): Sets the model of the car to the specified String.
// setYear(int year): Sets the year of the car to the specified int.

// You should also write a test program to create an instance of the Car class, set the attributes using the setter methods, 
//and print out the values using the getter methods. 

// Expected output.

// Make: Toyota
// Model: Corolla
// Year: 2010

public class Car {
    String make;
    String model;
    int year;
    Car(String makeA, String modelA, int yearA) { //sets the instances as these arguments
        make = makeA;
        model = modelA;
        year = yearA;
    }
    public String getMake() {   //returns make or company manufacturer of the car
        return make;
    }
    public String getModel() {  //returns model of the car
        return model;
    }
    public int getYear() {  //returns year of the car
       return year;
    } 
    public void setMake(String make) {  //sets the make
        this.make = make;
    }
    public void setModel(String model) { //sets the model
        this.model = model;
    }
    public void setYear(int year) { //sets the year
        this.year = year;
    }
}
