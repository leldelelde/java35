package homeworks.HW16;

public class CreatingObjects {
    public static void main(String[] args) {

        Employee employee = new Employee("Bob", 45, "+5632755", "Street", 1000, "Worker");
        Manager manager = new Manager("Nick", 47, "+54782564", "Boulevard", 2000, "Sales");

        employee.printSalary();
        manager.printSalary();
    }
}
