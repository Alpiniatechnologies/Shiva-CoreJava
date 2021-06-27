package javapackage;

public class loopStatements 
{
	
	// =============== W H I L E   L O O P ============ //
	
	/*

	void meth1()
	{
		System.out.println("***meth1()***");
		int i = 0;
		while(i<=5) //  6<=5   // when the condition is true then only compiler will enter into while loop block{ }
		{
			System.out.println(i);
			i++;
		}
		System.out.println("compiler came out from while loop");
	}
	void meth2()
	{
		System.out.println("***meth2()***");
		int i = 0;
		while(i<=5)
			//int x=90;
	// If we are not writing braces only one statement is dependent on while,
			// And we should not declare any values in that statement. 
		System.out.println(i); // Infinite while loop
		i++;
	}
	void meth3()
	{
		System.out.println("***meth3()***");
		int i = 0;
		while(true)
		{
			System.out.println("Hi"); // Infinite while loop
		}
		 //  System.out.println("compiler came out from while loop");  // Unreachable code
	}
	public static void main(String[] args) 
	{
		loopStatements obj = new loopStatements();
		obj.meth1();
		System.out.println("===========================");
		obj.meth2(); // Infinite while loop
		System.out.println("============================");
		obj.meth3();  // Infinite while loop
	}
	
	*/


    // Dead code======> Warning
    // Unreachable code======> compile time error
	

    //=============== DO - W H I L E   L O O P ============ //
	
	/*
	void meth1()
	{
		int i = 0;
		do
		{
			System.out.println(i);  // o
			i++;
		}
		while(i<5); // True  // If the condition is true then enter into the DO loop multiple times
					// False // If the condition is false at least one time it will enter into DO loop 
		System.out.println("compiler came out come from do- while loop");
	}
	public static void main(String[] args) 
	{
	  loopStatements obj = new loopStatements();		
	  obj.meth1();
	}
	*/
	
	//=============== F O R   L O O P ============ //
	/*
	void meth1()
	{
		System.out.println("****meth1()****");
		for(int i=1;i<=3;i++)
		{
			System.out.println(i); // 1 2 3 
		}
		System.out.println("compiler came out from for loop");
	}
	void meth2()
	{
		System.out.println("****meth2()****");
		int i=1;
		for(new loopStatements().meth3();i<=3; )
		{
			System.out.println(i); // 1 2 3 
			i++; //3
		}
		System.out.println("compiler came out from for loop");
	}
	void meth3()
	{
		System.out.println("Initialization statement can be any valid java statement");
	}
	void meth4()
	{
		System.out.println("****meth4()****");
		int i=1;
		for(;;) // If I wont give any condition by default the condition will be true
		{
			System.out.println(i);  // Infinite for loop
		}
		// System.out.println("compiler came out from for loop"); Unreachable code
	}
	public static void main(String[] args) 
	{
		loopStatements obj = new loopStatements();		
		//obj.meth1();
		//System.out.println("======================");
		obj.meth2();
		System.out.println("======================");
		// obj.meth4(); // infinite For loop
	}
	
	void meth5()
	{
		int arr[]= {10,20};
		for(int a:arr)
		{
			System.out.println("inside for each"+a);
		}
	}
	*/
	
}



