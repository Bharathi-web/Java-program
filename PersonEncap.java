package JavaTask;
class Person1{
	private String name;
	private int age;
	private String country;
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getCountry() {
		return country;
		
	}
	public void setDetails(String name,int age,String country) {
		this.name=name;
		this.age=age;
		this.country=country;
	}

	
}

public class PersonEncap {

	public static void main(String[] args) {
		Person1 p=new Person1();
		p.setDetails("Bharathi", 22, "Indian");
		System.out.println("The Person "+p.getName()+"'s "+ "Details");
		System.out.println("Name: "+p.getName());
		System.out.println("Age: "+p.getAge());
		System.out.println("Country: "+p.getCountry());

		
		

	}

}
