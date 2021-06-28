package javapackage;

public class typecasting 
{
	int display()  // implicit casting / widening / casting Upwards
	{
		byte b = 10;
		int i = b;
		double d = b;
		System.out.println("Byte datatype===>"+b);
		System.out.println("int datatype===>"+i);
		System.out.println("double datatype===>"+d);
		
		char c = 'A';
		int x = c;
		System.out.println("char datatype===>"+c); // A
		System.out.println("int datatype===>"+x); //65
		return 'A';
	}
	void show()
	{
		int i = 500;
		byte b= (byte)i;
		System.out.println("int datatype===>"+i);
		System.out.println("byte datatype===>"+b);
		
		float f = 10.9999f;
		byte b2 = (byte)f;
		System.out.println("float value====>"+f);
		System.out.println("byte value===>"+b2);
	}
	public static void main(String[] args) 
	{
		typecasting aobj=new typecasting();
		int result = aobj.display();
		System.out.println("value returned by display()===."+result);
		System.out.println("======================");
		aobj.show();
				
		
	}

}
