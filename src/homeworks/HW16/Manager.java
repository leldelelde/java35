package homeworks.HW16;

public class Manager extends Member {
    private String department;

    public Manager (String name, int age, String phoneNumber, String address, int salary, String department){
        super (name, age, phoneNumber, address, salary);
        this.department = department;
    }
    //Not necessary here, as this is already in abstract class Member
    //public void printSalary (){
   //     System.out.printf("Salary for %s is %d", name, salary);
  //  }

}
