import Patient;
public class testP {
    public static void main(String[] args) {
        Patient patientObj = new Patient("Juan", 18, "Male", "Critical");   //invoke constructor
        System.out.println(patientObj.getCondition());  //test the get
        patientObj.setCondition("Stable");  //test the set
        System.out.println(patientObj.getCondition());
    }
}