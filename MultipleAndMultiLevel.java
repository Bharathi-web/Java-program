package JavaTask;
interface Workable {
    void work(); 
}

class LivingBeing {
   
    void breathe() {
        System.out.println("All Living Being can breath.");
    }
}

class Human extends LivingBeing {
    void speak() {
        System.out.println("Human is speaking.");
    }
}

class Employee1 extends Human implements Workable {
    private String name;

    public void Emp (String name) {
        this.name = name;
    }

    @Override
    public void work() {
        System.out.println(name + " is working.");
    }

    // Method to display employee details
    void displayDetails() {
        System.out.println("Employee Name: " + name);
    }
}

public class MultipleAndMultiLevel {

	public static void main(String[] args) {
		Employee1 employee = new Employee1();
		employee.Emp("Bharathi");
        employee.breathe();
        employee.speak();
        employee.displayDetails();
        employee.work();

	}

}
