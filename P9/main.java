class Employee {
    String name;
    double salary;
    static int count = 0;

    Employee() {
        this("Unknown", 0);
    }

    Employee(String n, double s) {
        this.name = n;
        this.salary = s;
        count++;
    }

    void show() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }

    static void countEmployees() {
        System.out.println("Total Employees: " + count);
    }
}

public class Main {
    public static void main(String[] args) {

        Employee e1 = new Employee();
        Employee e2 = new Employee("Rahul", 30000);
        Employee e3 = new Employee("Aman", 40000);

        e1.show();

        System.out.println();

        e2.show();

        System.out.println();

        e3.show();

        System.out.println();

        Employee.countEmployees();
    }
}
