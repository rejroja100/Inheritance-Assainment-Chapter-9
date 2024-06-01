public class EmployeeB {
    private String name;
    private double salary;

    public EmployeeB(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee: " + name + ", Salary: $" + salary;
    }
}

public class Manager extends Employee {
    private String department;

    public Manager(String name, double salary, String department) {
        super(name, salary);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Manager: " + getName() + ", Department: " + department + ", Salary: $" + getSalary();
    }
}

public class Executive extends Manager {
    public Executive(String name, double salary, String department) {
        super(name, salary, department);
    }

    @Override
    public String toString() {
        return "Executive: " + getName() + ", Department: " + getDepartment() + ", Salary: $" + getSalary();
    }
}

public class TestProgram {
    public static void main(String[] args) {
        Employee employee = new Employee("John Doe", 50000);
        Manager manager = new Manager("Jane Smith", 80000, "Engineering");
        Executive executive = new Executive("Alice Johnson", 120000, "CEO Office");

        System.out.println(employee);
        System.out.println(manager);
        System.out.println(executive);
    }
}
