package JavaTask;

class Employees {
    String name;
    double baseSalary;

    // Constructor
    public Employees(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    // Method to calculate salary
    public double calculateSalary() {
        return baseSalary; // Default implementation
    }
}

// Subclass Managers
class Managers extends Employees {
    private double bonus;

    public Managers(String name, double baseSalary, double bonus) {
        super(name, baseSalary); // Call superclass constructor
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary() {
        return baseSalary + bonus;
    }
}

// Subclass Programmer
class Programmer extends Employees {
    private double overtimePay;

    public Programmer(String name, double baseSalary, double overtimePay) {
        super(name, baseSalary); // Call superclass constructor
        this.overtimePay = overtimePay;
    }

    @Override
    public double calculateSalary() {
        return baseSalary + overtimePay;
    }
}

public class EmpPolymorphism {
    public static void main(String[] args) {
        Employees manager = new Managers("Bharathi", 80000, 20000);
        Employees programmer = new Programmer("Yogapriya", 60000, 15000);

        System.out.println("Manager's salary: " + manager.calculateSalary());
        System.out.println("Programmer's salary: " + programmer.calculateSalary());
    }
}
