class Employee {
    String name;
    double salary;
    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
    void work() {
        System.out.println(name + " is working.");
    }
    double getSalary() {
        return salary;
    }
}

class HRManager extends Employee {
    HRManager(String name, double salary) {
        super(name, salary);
    }

    void work() {
        System.out.println(name + " is managing HR tasks.");
    }
    void addEmployee(String employeeName) {
        System.out.println(name + " added a new employee: " + employeeName);
    }
}

public class Salary {

    public static void main(String[] args) {
        Employee emp1 = new Employee("John", 50000.0);
        emp1.work();
        System.out.println("Salary: $" + emp1.getSalary());
        System.out.println();
        HRManager hr = new HRManager("Alice", 70000.0);
        hr.work();
        hr.addEmployee("Bob");
        System.out.println("Salary: $" + hr.getSalary());
    }
}
