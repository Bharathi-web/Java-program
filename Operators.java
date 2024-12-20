package JavaTask;

public class Operators {
	int a=10,b=20,val;
	 
	void ArithmeticOperation() {
		val=a+b;
		System.out.println("The sum of two numbers is:"+val);
		
		int val=a-b;
		System.out.println("The difference of numbers is:"+val);
		
		int val1=a*b;
		System.out.println("The multiple of two numbers is:"+val1);
		
		float val2=a/b;
		System.out.println("The division of two numbers is:"+val2);
		
		int val3=a%b;
		System.out.println("The mod of two numbers is:"+val3);
		
	}
	void AssignmentOperation() {
		int c=25,d=58;
		System.out.println("Assign value of c is"+(c+=2));
		System.out.println("Assign value of c is"+(c-=2));
		System.out.println("Assign value of c is"+(d*=2));
		System.out.println("Assign value of c is"+(d/=2));
		
	}
	void ComparisonOperation() {
		int e=6,f=8;
		System.out.println("compare e and f are equal:"+(e==f));
		System.out.println("compare e and f are not equal:"+(e!=f));
		System.out.println("compare e is greater than f:"+(e>f));
		System.out.println("compare e is greater than f:"+(e<f));
		System.out.println("compare e is greater than f:"+(e>=f));
		System.out.println("compare e is greater than f:"+(e<=f));

	}
	void LogicalOperation() {
		System.out.println((a>b)&&(b>a));
		System.out.println((a<b)&&(b<a));
		System.out.println((a>b)||(b>a));
		System.out.println((a<b)||(b<a));
		System.out.println(!(a==b));
		System.out.println(!(a>b));
}
	void UnaryOperation() {
		int val3,val4,val5,val6;
		System.out.println("The original value of a is:"+a);
		val3=++a;
		System.out.println("The value of a after pre increment:"+val3);
		val4=--a;
		System.out.println("The valueof a after pre decrement:"+val4);
		val5=a++;
		System.out.println("The value of a after post increment:"+val5);
		val6=a--;
		System.out.println("The value of a after post decdrement"+val6);
		
	}
	void BitwiseOperation() {
		int val7,val8,val9,val10;
		val7=a | b;
		System.out.println("The bitwise OR:"+val7);
		val8= a & b;
		System.out.println("The bitwise AND:"+val8);
		val9=a ^ b;
		System.out.println("The bitwise XOR:"+val9);
		val10= ~b;
		System.out.println("The bitwise Compliment:"+val10);
	}
	void TernaryOperation() {
		int februaryDays = 29;
	    String res;
	    res = (februaryDays == 28) ? "Not a leap year" : "Leap year";
	    System.out.println(res);
		
	}
	void InstanceOperation() {
		String str="programiz";
		boolean res1;
		res1=str instanceof String;
		System.out.println("Is str an object of string?"+res1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Operators ops=new Operators();
		ops.ArithmeticOperation();
		ops.AssignmentOperation();
		ops.ComparisonOperation();
		ops.LogicalOperation();
		ops.UnaryOperation();
		ops.BitwiseOperation();
		ops.TernaryOperation();
		ops.InstanceOperation();
	}
	

}
