package homeworks.HW16;

public class Employee extends Member {

    private String specialization;

    public Employee (String name, int age, String phoneNumber, String address, int salary, String specialization){
        super (name, age, phoneNumber, address, salary);
        this.specialization = specialization;
    }
    //Not necessary here, as this is already in abstract class Member
    //It would be necessary only if in the abstract class it would be abstract
   // public void printSalary (){
   //     System.out.printf("Salary for %s is %d", name, salary);
    //}
}
