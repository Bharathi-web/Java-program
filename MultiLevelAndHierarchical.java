package JavaTask;
class Person {
    String name;
    Person(String name) {
        this.name = name;
    }

    void info() {
        System.out.println("Name: " + name);
    }
}

class Emp extends Person { //multi-level
    Emp(String name) {
        super(name); //constructor
    }

    void work() {
        System.out.println(name + " is working.");
    }
}

class Manager extends Emp {
    Manager(String name) {
        super(name);
    }

    void manage() {
        System.out.println(name + " is managing the team.");
    }
}

class Developer extends Emp { //hierarchical
    Developer(String name) {
        super(name);
    }

    void develop() {
        System.out.println(name + " is developing software.");
    }
}

public class MultiLevelAndHierarchical {

	public static void main(String[] args) {
		Manager manager = new Manager("Bharathi");
        Developer developer = new Developer("Yogappriya");
        manager.info();
        manager.work();
        manager.manage();
        developer.info();
        developer.work();
        developer.develop();
	}

}
