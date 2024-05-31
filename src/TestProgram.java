public class TestProgram {
    public static void main(String[] args) {

        Employee emp = new Employee();
        emp.setName("John Doe");
        emp.setBaseSalary(50000);

        Manager mgr = new Manager();
        mgr.setName("Jane Smith");
        mgr.setBaseSalary(70000);
        mgr.setBonus(15000);


        System.out.println("Employee Name: " + emp.getName());
        System.out.println("Employee Salary: " + emp.getSalary());

        System.out.println("Manager Name: " + mgr.getName());
        System.out.println("Manager Base Salary: " + (mgr.getSalary() - mgr.getBonus()));
        System.out.println("Manager Bonus: " + mgr.getBonus());
        System.out.println("Manager Total Salary: " + mgr.getSalary());
    }
}

