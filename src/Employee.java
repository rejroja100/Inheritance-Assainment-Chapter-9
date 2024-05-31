public class Employee {
    private String name;
    private double baseSalary;

    public Employee() {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    // Override the getSalary method to include the bonus
    public double getSalary() {
        return 0;
    }
}

