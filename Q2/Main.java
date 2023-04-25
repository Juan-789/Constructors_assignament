import java.util.*;
public class Main {
    public static void main(String[] args) {
        Patient patientObj1 = new Patient("Juan", 18, "Male", "Critical");   //invoke constructor1
        Patient patientObj2  = new Patient("Evan", 17, "Male", "Stable"); 
        
        // Add a office administrator interface so that any number of patients’ information can be stored in the system,
        // and any patient’s information can be accessed and displayed one at a time.
        Scanner inputObj = new Scanner(System.in);
        System.out.println("What patient do you want to know records of? ");
        int input = inputObj.nextInt();

        if (input==1) {
            System.out.println(patientObj1.getName()+", "+patientObj1.getAge()+" year old "+patientObj1.getGender()+" with "+ patientObj1.getCondition()+" condition.");
        }
        else if (input==2) {
            System.out.println(patientObj2.getName()+", "+patientObj2.getAge()+" year old "+patientObj2.getGender()+" with "+ patientObj2.getCondition()+" condition.");
        }
    }
}
