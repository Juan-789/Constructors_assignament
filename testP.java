import Patient;
import java.util.*;
public class testP {
    public static void main(String[] args) {
        Patient patientObj1 = new Patient("Juan", 18, "Male", "Critical");   //invoke constructor1
        String credentials1 = patientObj1.getName+", "+patientObj1.getAge+" year old "+patientObj1.getGender+" with "+ patientObj1.getCondition+" condition.";
        System.out.println(credentials1);
        Patient patientObj2  = new Patient("Evan", 17, "Male", "Stable"); 
        String credentials2 =  patientObj2.getName+", "+patientObj2.getAge+" year old "+patientObj2.getGender+" with "+ patientObj2.getCondition+" condition.";
        // Add a office administrator interface so that any number of patients’ information can be stored in the system,
        // and any patient’s information can be accessed and displayed one at a time.
        Scanner inputObj = new Scanner(System.in);
        System.out.println("What patient do you want to know records of? ");
        String input = inputObj.nextLine();
        // if (input=="1") {
        //     System.out.println(credentials1);
        // }
        // else if (input=="2") {
        //     System.out.println(credentials2);
        // }
    }
    // public admin() {
        
    // }
}

// System.out.println(patientObj.getCondition());  //test the get
// patientObj.setCondition("Stable");  //test the set
// System.out.println(patientObj.getCondition());