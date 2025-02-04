package JavaTask;
class Vehicles {

    public void startEngine() {
        System.out.println("Starting the vehicle engine...");
    }

    public void stopEngine() {
        System.out.println("Stopping the vehicle engine...");
    }
}

// Subclass Car
class Cars extends Vehicles {

    @Override
    public void startEngine() {
        System.out.println("Car engine starts with a key or button.");
    }

    @Override
    public void stopEngine() {
        System.out.println("Car engine stops when you turn off the key or press the button.");
    }
}

// Subclass Motorcycle
class Motorcycle extends Vehicles {

    @Override
    public void startEngine() {
        System.out.println("Motorcycle engine starts with a kick or button.");
    }

    @Override
    public void stopEngine() {
        System.out.println("Motorcycle engine stops by turning off the ignition.");
    }
}



public class StartenginePolymorphism {

	public static void main(String[] args) {
		Vehicles myCar = new Cars();
        Vehicles myMotorcycle = new Motorcycle();

        System.out.println("Car operations:");
        myCar.startEngine();
        myCar.stopEngine();

        System.out.println("\nMotorcycle operations:");
        myMotorcycle.startEngine();
        myMotorcycle.stopEngine();

	}

}
