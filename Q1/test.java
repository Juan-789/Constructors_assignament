// You should also write a test program to create an instance of the Car class, set the attributes using the setter methods, 
//and print out the values using the getter methods. 

import Car; //importing the other file
public class test {
    public static void main(String[] args) {
        Car instance = new Car("Tesla", "X", 2023); //creates object and sets the car
        System.out.println(instance.getMake()); //prints one of the methods
        instance.setMake("Rivian");
        System.out.println(instance.getMake());
    }
}
