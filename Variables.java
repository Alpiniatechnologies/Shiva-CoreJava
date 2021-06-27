package javapackage;

public class Variables
{
	int a;  // Instance
	static int b;  // Static
	
	void display()
	{
		int c = 10;  // Local
		int a = 1000;
		int b = 2000;
		System.out.println("Local variable=====>"+a);
		System.out.println("Instance variable====>"+ new Variables().a);  // calling an Instance variable
		
		System.out.println("local variable====>"+b);
		System.out.println("static variable====>"+Variables.b);  // static variable can directly called by class name
		
		System.out.println("loacl variable====>"+c);
	}
	
	void show()
	{
		System.out.println("***Executing show method***");
		
		System.out.println(a); // compiler should move towards Instance variable
		
		System.out.println(b);  // compiler should move towards static variable
	}
	
	public static void main(String[] args) 
	{
		Variables var = new Variables();
		
		var.display();
		var.show();
		
	}
}
