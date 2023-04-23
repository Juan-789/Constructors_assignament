// Create a program that has a class called "Patient" that models a patient in a medical clinic
public class Patient {
    String name;    //create instances
    int age;
    String gender;
    String condition;
    Patient(String nameA, int ageA, String genderA, String conditionA) {    //constructor
        name = nameA;
        age = ageA;
        gender = genderA;
        condition = conditionA;
    }
    public int getAge() {   //get the instances
        return age;
    }
    public String getCondition() {
        return condition;
    }public String getGender() {
        return gender;
    }public String getName() {
        return name;
    }
    public void setAge(int age) {   //set the instances
        this.age = age;
    }
    public void setCondition(String condition) {
        this.condition = condition;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }public void setName(String name) {
        this.name = name;
    }
}
