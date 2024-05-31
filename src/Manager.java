public class Manager extends Employee {
    private double bonus;

    public Manager(String name, double baseSalary, double bonus) {
        super();
        setName(name);
        setBaseSalary(baseSalary);
        this.bonus = bonus;
    }

    public Manager() {
        this("", 0.0, 0.0);
    }


    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }


    @Override
    public double getSalary() {
        return super.getSalary() + bonus;
    }
}


