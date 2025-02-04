package JavaTask;
class Vehicle{
	int speed;
	public void vehicle() {
		int speed=0;
		
	}
	void speedup() {
		speed+=5;
		System.out.println("Each Vehicle has different speed capacity of "+speed+" "+"km");
		
	}
	
}
class Car extends Vehicle{
	void speedup() {
		speed+=12;
		System.out.println("Car has the speed of "+speed+" "+"km");
		
	}
	
}
class Bicycle extends Vehicle{
	void speedup() {
		speed+=2;
		System.out.println("Bike has the speed of "+speed+" "+"km");
		
	}
	
}


public class VehiclePolymorphism {
	public static void main(String[] args) {
		Vehicle v=new Vehicle();
		Vehicle c=new Car();
		Vehicle b=new Bicycle();
		v.speedup();
		c.speedup();
		b.speedup();
		//Call again to further speedup
		c.speedup();
		b.speedup();
		

	}

}
