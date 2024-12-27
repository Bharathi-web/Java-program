package JavaTask;

class Employee {
	public void work() {
		System.out.println("Defines the work of the emp");
		
	}
	public void getSalary() {
		System.out.println("The Salary of the emp is 30000");
	}
}
class HRManager extends Employee {
	public void work() {
		System.out.println("Fs Devloper");
	}
	public void addEmployee() {
		System.out.println("The emp Name is Bharathi");
	}
}
public class Admin{
	public static void main(String[] args) {
		HRManager obj=new HRManager();
		obj.work();
		obj.getSalary();
		obj.addEmployee();
}

}
