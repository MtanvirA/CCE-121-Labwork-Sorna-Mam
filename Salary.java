class Employee {
    int salary=50000;
    void work() {
        System.out.println("John is working.");
    }
    double getSalary() {
        return salary;
    }
}

class HRManager extends Employee {
    void work() {
        System.out.println("Alice is managing HR tasks.");
    }
    void addEmployee() {
        System.out.println("Alice added a new employee: Bob");
    }
}

public class Salary {
    public static void main(String[] args) {
        Employee emp1 = new Employee();
        emp1.work();
        System.out.println("Salary: $" + emp1.getSalary());

        System.out.println();

        HRManager hr = new HRManager();
        hr.work();
        hr.addEmployee();
        System.out.println("Salary: $" + hr.getSalary());
    }
}
